package com.telusko.joblisting.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Post_getExp_e90c52dc7e_Test {

    private Post post;

    @BeforeEach
    public void setUp() {
        post = new Post();
    }

    @Test
    public void testGetExp_WhenExpIsSet() {
        int expectedExp = 5;
        post.setExp(expectedExp);
        int actualExp = post.getExp();
        Assertions.assertEquals(expectedExp, actualExp, "Expected experience does not match the actual experience");
    }

    @Test
    public void testGetExp_WhenExpIsNotSet() {
        int defaultExp = 0;
        int actualExp = post.getExp();
        Assertions.assertEquals(defaultExp, actualExp, "Expected default experience does not match the actual experience");
    }
}
