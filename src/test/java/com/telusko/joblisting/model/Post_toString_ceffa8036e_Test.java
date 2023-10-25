// Test generated by RoostGPT for test JavaUnitTest using AI Type Open AI and AI Model gpt-4

package com.telusko.joblisting.model;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;

@SpringBootTest
public class Post_toString_ceffa8036e_Test {

    @Test
    public void testToString() {
        Post post = new Post();
        post.setProfile("Java Developer");
        post.setDesc("Java and Spring Boot development");
        post.setExp(3);
        post.setTechs(new String[]{"Java", "Spring Boot"});

        String expected = "Post{" +
                "profile='Java Developer'" +
                ", desc='Java and Spring Boot development'" +
                ", exp=3" +
                ", techs=" + Arrays.toString(new String[]{"Java", "Spring Boot"}) +
                '}';
        assertEquals(expected, post.toString());
    }

    @Test
    public void testToStringEmpty() {
        Post post = new Post();
        String expected = "Post{" +
                "profile=''" +
                ", desc=''" +
                ", exp=0" +
                ", techs=" + Arrays.toString(new String[]{}) +
                '}';
        assertEquals(expected, post.toString());
    }
}
