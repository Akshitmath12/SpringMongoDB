// Test generated by RoostGPT for test JavaUnitTest using AI Type Open AI and AI Model gpt-4

package com.telusko.joblisting.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Post_toString_ceffa8036e_Test {
    private Post post;

    @BeforeEach
    public void setUp() {
        post = new Post();
        post.setProfile("Java Developer");
        post.setDesc("Java Developer with Spring Boot experience");
        post.setExp(5);
        post.setTechs(new String[] {"Java", "Spring Boot"});
    }

    @Test
    public void testToString() {
        String expectedOutput = "Post{" +
                "profile='Java Developer'" +
                ", desc='Java Developer with Spring Boot experience'" +
                ", exp=5" +
                ", techs=[" + String.join(", ", post.getTechs()) + "]" +
                '}';
        assertEquals(expectedOutput, post.toString());
    }

    @Test
    public void testToStringWithNullValues() {
        post = new Post();

        String expectedOutput = "Post{" +
                "profile='null'" +
                ", desc='null'" +
                ", exp=0" +
                ", techs=null" +
                '}';
        assertEquals(expectedOutput, post.toString());
    }
}
