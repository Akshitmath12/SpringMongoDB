// Test generated by RoostGPT for test JavaUnitTest using AI Type Open AI and AI Model gpt-4

package com.telusko.joblisting.model;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class Post_Post_ec8a5320eb_Test {

    @Autowired
    private Post post;

    @MockBean
    private PostService postService;

    @Test
    public void testPostCreation() {
        Post newPost = new Post();
        when(postService.save(newPost)).thenReturn(newPost);
        assertEquals(newPost, postService.save(newPost));
    }

    @Test
    public void testPostCreationFailure() {
        Post newPost = new Post();
        when(postService.save(newPost)).thenReturn(null);
        assertEquals(null, postService.save(newPost));
    }
}
