// Test generated by RoostGPT for test JavaUnitTest using AI Type Open AI and AI Model gpt-4

package com.telusko.joblisting.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Post_setProfile_50f29a11fe_Test {

    private Post post;

    @Before
    public void setUp() {
        post = new Post();
    }

    @Test
    public void testSetProfile_ValidProfile() {
        String validProfile = "Software Engineer";
        post.setProfile(validProfile);
        assertEquals(validProfile, post.getProfile());
    }

    @Test
    public void testSetProfile_EmptyProfile() {
        String emptyProfile = "";
        post.setProfile(emptyProfile);
        assertEquals(emptyProfile, post.getProfile());
    }

    // TODO: Add more test cases here for other scenarios and edge cases
}
