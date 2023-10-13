// Test generated by RoostGPT for test JavaUnitTest using AI Type Open AI and AI Model gpt-4

package com.telusko.joblisting.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class Post_setProfile_50f29a11fe_Test {

    @MockBean
    private Post post;

    @BeforeEach
    public void setUp() {
        post = new Post();
    }

    @Test
    public void testSetProfile_Success() {
        String expectedProfile = "Software Engineer";
        post.setProfile(expectedProfile);
        assertEquals(expectedProfile, post.getProfile(), "The profile should be set correctly");
    }

    @Test
    public void testSetProfile_NullProfile() {
        String expectedProfile = null;
        post.setProfile(expectedProfile);
        assertEquals(expectedProfile, post.getProfile(), "The profile should be able to accept null value");
    }
}
