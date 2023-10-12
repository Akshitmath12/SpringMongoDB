// Test generated by RoostGPT for test JavaUnitTest using AI Type Open AI and AI Model gpt-4

package com.telusko.joblisting.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Post_toString_ceffa8036e_Test {

    @Mock
    private Post post;

    @BeforeEach
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testToString_Success() {
        String[] techs = {"Java", "Spring Boot"};
        post.setProfile("Software Developer");
        post.setDesc("Full Stack Developer");
        post.setExp(5);
        post.setTechs(techs);

        String expected = "Post{profile='Software Developer', desc='Full Stack Developer', exp=5, techs=[Java, Spring Boot]}";
        String actual = post.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testToString_Empty() {
        String[] techs = {};
        post.setProfile("");
        post.setDesc("");
        post.setExp(0);
        post.setTechs(techs);

        String expected = "Post{profile='', desc='', exp=0, techs=[]}";
        String actual = post.toString();

        assertEquals(expected, actual);
    }
}
