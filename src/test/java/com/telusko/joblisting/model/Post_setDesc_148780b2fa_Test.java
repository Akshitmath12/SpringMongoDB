package com.telusko.joblisting.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Post_setDesc_148780b2fa_Test {

    @Test
    public void testSetDesc_ValidDesc() {
        // Arrange
        Post post = new Post();
        String expectedDesc = "This is a valid description";

        // Act
        post.setDesc(expectedDesc);

        // Assert
        Assertions.assertEquals(expectedDesc, post.getDesc());
    }

    @Test
    public void testSetDesc_NullDesc() {
        // Arrange
        Post post = new Post();
        String expectedDesc = null;

        // Act
        post.setDesc(expectedDesc);

        // Assert
        Assertions.assertNull(post.getDesc());
    }
}
