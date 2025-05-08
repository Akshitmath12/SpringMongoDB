package com.telusko.joblisting.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Post_getDesc_66e632b9da_Test {

    private Post post;

    @BeforeEach
    public void setUp() {
        post = new Post();
    }

    @Test
    public void testGetDesc_WhenDescIsNotEmptyString() {
        String expectedDesc = "This is a test description";
        post.setDesc(expectedDesc);

        String actualDesc = post.getDesc();

        assertEquals(expectedDesc, actualDesc);
    }

    @Test
    public void testGetDesc_WhenDescIsNull() {
        post.setDesc(null);

        String actualDesc = post.getDesc();

        assertNull(actualDesc);
    }
}
