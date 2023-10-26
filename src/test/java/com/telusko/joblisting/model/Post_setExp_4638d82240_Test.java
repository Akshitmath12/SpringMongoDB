// Test generated by RoostGPT for test JavaUnitTest using AI Type Open AI and AI Model gpt-4

package com.telusko.joblisting.model;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class Post_setExp_4638d82240_Test {

    Post post = new Post();

    @Test
    public void testSetExp_PositiveValue() {
        int exp = 5;
        post.setExp(exp);
        assertEquals(exp, post.getExp(), "Expected and actual experience should match");
    }

    @Test
    public void testSetExp_NegativeValue() {
        int exp = -3;
        post.setExp(exp);
        assertEquals(exp, post.getExp(), "Expected and actual experience should match");
    }
}
