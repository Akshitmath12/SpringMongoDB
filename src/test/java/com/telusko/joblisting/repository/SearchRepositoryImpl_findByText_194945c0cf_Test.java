package com.telusko.joblisting.repository;

import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.telusko.joblisting.model.Post;
import org.bson.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.mongodb.core.convert.MongoConverter;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class SearchRepositoryImpl_findByText_194945c0cf_Test {

    @Mock
    private MongoClient client;

    @Mock
    private MongoConverter converter;

    @Mock
    private MongoDatabase database;

    @Mock
    private MongoCollection<Document> collection;

    @Mock
    private AggregateIterable<Document> result;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        when(client.getDatabase("telusko")).thenReturn(database);
        when(database.getCollection("JobPost")).thenReturn(collection);
        when(collection.aggregate(any())).thenReturn(result);
    }

    @Test
    public void testFindByText() {
        String text = "Java";
        Post post = new Post();
        post.setProfile("Java Developer");
        post.setDesc("Java Developer with 5 years of experience");
        post.setExp(5);
        post.setTechs(new String[]{"Java", "Spring", "Hibernate"});

        when(result.spliterator()).thenReturn(Arrays.asList(new Document("post", post)).spliterator());
        when(converter.read(any(), any())).thenReturn(post);

        List<Post> posts = findByText(text);

        assertNotNull(posts);
        assertTrue(posts.size() > 0);
        verify(client, times(1)).getDatabase("telusko");
        verify(database, times(1)).getCollection("JobPost");
        verify(collection, times(1)).aggregate(any());
    }

    @Test
    public void testFindByTextWithException() {
        String text = "Java";
        when(client.getDatabase("telusko")).thenThrow(new RuntimeException());

        findByText(text);
    }

    private List<Post> findByText(String text) {
        // TODO: Replace this with actual implementation
        return null;
    }
}
