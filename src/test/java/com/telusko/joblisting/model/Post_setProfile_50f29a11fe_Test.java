// Test generated by RoostGPT for test JavaUnitTest using AI Type Open AI and AI Model gpt-4

package com.telusko.joblisting.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Post_setProfile_50f29a11fe_Test {

    @InjectMocks
    private Post post;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSetProfileSuccess() {
        String profile = "Software Developer";
        post.setProfile(profile);
        assertEquals(profile, post.getProfile());
    }

    @Test
    public void testSetProfileNull() {
        String profile = null;
        post.setProfile(profile);
        assertEquals(profile, post.getProfile());
    }
}
