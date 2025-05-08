package com.telusko.joblisting.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Post_Post_ec8a5320eb_Test {

    @Test
    public void testPostConstructor() {
        Post post = new Post();
        assertNotNull(post, "Post object should not be null");
    }

    @Test
    public void testPostFields() {
        Post post = new Post();
        post.setProfile("Software Developer");
        post.setDesc("Java Developer");
        post.setExp(5);
        post.setTechs(new String[]{"Java", "Spring Boot"});

        assertEquals("Software Developer", post.getProfile(), "Profile should be 'Software Developer'");
        assertEquals("Java Developer", post.getDesc(), "Description should be 'Java Developer'");
        assertEquals(5, post.getExp(), "Experience should be 5");
        assertArrayEquals(new String[]{"Java", "Spring Boot"}, post.getTechs(), "Technologies should be 'Java' and 'Spring Boot'");
    }

    @Test
    public void testPostToString() {
        Post post = new Post();
        post.setProfile("Software Developer");
        post.setDesc("Java Developer");
        post.setExp(5);
        post.setTechs(new String[]{"Java", "Spring Boot"});

        String expectedToString = "Post{profile='Software Developer', desc='Java Developer', exp=5, techs=[Java, Spring Boot]}";
        assertEquals(expectedToString, post.toString(), "ToString method should return expected string");
    }
}
