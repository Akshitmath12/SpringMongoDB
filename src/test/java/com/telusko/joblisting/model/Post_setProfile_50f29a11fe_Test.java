// Test generated by RoostGPT for test JavaUnitTest using AI Type Open AI and AI Model gpt-4

package com.telusko.joblisting.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Post_setProfile_50f29a11fe_Test {

    private Post post;

    @BeforeEach
    public void setUp() {
        post = new Post();
    }

    @Test
    public void testSetProfile_Success() {
        String expectedProfile = "Java Developer";
        post.setProfile(expectedProfile);
        assertEquals(expectedProfile, post.getProfile());
    }

    @Test
    public void testSetProfile_Null() {
        String expectedProfile = null;
        post.setProfile(expectedProfile);
        assertEquals(expectedProfile, post.getProfile());
    }
}