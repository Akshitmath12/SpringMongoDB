// Test generated by RoostGPT for test JavaUnitTest using AI Type Open AI and AI Model gpt-4

package com.telusko.joblisting.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Post_setExp_4638d82240_Test {

    @InjectMocks
    private Post post;

    @BeforeEach
    public void setUp() {
        post = new Post();
    }

    @Test
    public void testSetExp_positive() {
        int exp = 5;
        post.setExp(exp);
        assertEquals(exp, post.getExp());
    }

    @Test
    public void testSetExp_zero() {
        int exp = 0;
        post.setExp(exp);
        assertEquals(exp, post.getExp());
    }

    @Test
    public void testSetExp_negative() {
        int exp = -3;
        post.setExp(exp);
        assertEquals(exp, post.getExp());
    }
}
