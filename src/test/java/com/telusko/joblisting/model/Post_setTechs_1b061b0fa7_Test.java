package com.telusko.joblisting.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Post_setTechs_1b061b0fa7_Test {
    private Post post;

    @BeforeEach
    public void setUp() {
        post = new Post();
    }

    @Test
    public void testSetTechs() {
        String[] techs = new String[] {"Java", "Spring", "Hibernate"};
        post.setTechs(techs);
        assertArrayEquals(techs, post.getTechs());
    }

    @Test
    public void testSetTechs_Null() {
        post.setTechs(null);
        assertNull(post.getTechs());
    }
}
