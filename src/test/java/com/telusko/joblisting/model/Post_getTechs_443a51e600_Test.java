package com.telusko.joblisting.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PostTest {

    @Test
    public void testGetTechs() {
        // Initialize the object with test data
        Post post = new Post();
        String[] expectedTechs = {"Java", "Spring Boot"};
        post.setTechs(expectedTechs);

        // Call the method to test
        String[] actualTechs = post.getTechs();

        // Assert the result
        assertArrayEquals(expectedTechs, actualTechs);
    }

    @Test
    public void testGetTechsWhenTechsIsNull() {
        // Initialize the object without setting techs
        Post post = new Post();

        // Call the method to test
        String[] actualTechs = post.getTechs();

        // Assert the result
        assertNull(actualTechs);
    }
}
