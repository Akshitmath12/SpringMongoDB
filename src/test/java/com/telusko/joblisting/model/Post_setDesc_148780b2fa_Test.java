// Test generated by RoostGPT for test JavaUnitTest using AI Type Open AI and AI Model gpt-4

package com.telusko.joblisting.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class Post_setDesc_148780b2fa_Test {

    private Post post;

    @BeforeEach
    public void setUp() {
        post = new Post();
    }

    @Test
    public void testSetDesc_ValidDesc() {
        String testDesc = "This is a test description.";
        post.setDesc(testDesc);
        assertEquals(testDesc, post.getDesc());
    }

    @Test
    public void testSetDesc_NullDesc() {
        String testDesc = null;
        post.setDesc(testDesc);
        assertEquals(testDesc, post.getDesc());
    }
}
