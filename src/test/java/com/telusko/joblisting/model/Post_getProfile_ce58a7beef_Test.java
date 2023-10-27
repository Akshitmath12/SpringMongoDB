package com.telusko.joblisting.model;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class Post_getProfile_ce58a7beef_Test {

    @Test
    public void testGetProfile() {
        Post post = new Post();
        post.setProfile("Java Developer");
        String actual = post.getProfile();
        String expected = "Java Developer";
        assertEquals(expected, actual);
    }

    @Test
    public void testGetProfile_Null() {
        Post post = new Post();
        post.setProfile(null);
        String actual = post.getProfile();
        assertNull(actual);
    }
}
