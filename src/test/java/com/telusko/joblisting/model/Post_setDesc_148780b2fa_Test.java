// Test generated by RoostGPT for test JavaUnitTest using AI Type Open AI and AI Model gpt-4

package com.telusko.joblisting.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class Post_setDesc_148780b2fa_Test {

    @InjectMocks
    private Post post;

    @BeforeEach
    public void setUp() {
        post = new Post();
    }

    @Test
    public void testSetDesc_Success() {
        String desc = "This is a test description";
        post.setDesc(desc);
        assertEquals(desc, post.getDesc());
    }

    @Test
    public void testSetDesc_Null() {
        String desc = null;
        post.setDesc(desc);
        assertEquals(desc, post.getDesc());
    }
}
