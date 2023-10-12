// Test generated by RoostGPT for test JavaUnitTest using AI Type Open AI and AI Model gpt-4

package com.telusko.joblisting.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Post_setDesc_148780b2fa_Test {

    private Post post;

    @BeforeEach
    public void setUp() {
        post = new Post();
    }

    @Test
    public void testSetDesc_ValidDesc() {
        String validDesc = "This is a valid description.";
        post.setDesc(validDesc);
        Assertions.assertEquals(validDesc, post.getDesc());
    }

    @Test
    public void testSetDesc_EmptyDesc() {
        String emptyDesc = "";
        post.setDesc(emptyDesc);
        Assertions.assertEquals(emptyDesc, post.getDesc());
    }

    @Test
    public void testSetDesc_NullDesc() {
        String nullDesc = null;
        post.setDesc(nullDesc);
        Assertions.assertEquals(nullDesc, post.getDesc());
    }
}
