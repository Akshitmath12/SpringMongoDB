// Test generated by RoostGPT for test JavaUnitTest using AI Type Open AI and AI Model gpt-4

package com.telusko.joblisting.model;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.data.mongodb.core.mapping.Document;

public class Post_setTechs_1b061b0fa7_Test {
  
    @Test
    public void testSetTechs_Success() {
        Post post = new Post();
        String[] expectedTechs = {"Java", "Spring Boot", "MongoDB"};
        post.setTechs(expectedTechs);
        Assert.assertArrayEquals(expectedTechs, post.getTechs());
    }

    @Test
    public void testSetTechs_Null() {
        Post post = new Post();
        post.setTechs(null);
        Assert.assertNull(post.getTechs());
    }

    @Test
    public void testSetTechs_Empty() {
        Post post = new Post();
        String[] expectedTechs = {};
        post.setTechs(expectedTechs);
        Assert.assertArrayEquals(expectedTechs, post.getTechs());
    }
}
