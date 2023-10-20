// Test generated by RoostGPT for test JavaUnitTest using AI Type Open AI and AI Model gpt-4

package com.telusko.joblisting.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Post_setProfile_50f29a11fe_Test {

    @InjectMocks
    private Post post;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSetProfile_Successful() {
        String expectedProfile = "Software Developer";
        post.setProfile(expectedProfile);
        Assertions.assertEquals(expectedProfile, post.getProfile(), "Profile should be set correctly");
    }

    @Test
    public void testSetProfile_Null() {
        post.setProfile(null);
        Assertions.assertNull(post.getProfile(), "Profile should be null");
    }
}
