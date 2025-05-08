package com.telusko.joblisting.model;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Arrays;

@Document
public class Post {

    private String profile;
    private String desc;
    private int exp;
    private String[] techs;

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String[] getTechs() {
        return techs;
    }

    public void setTechs(String[] techs) {
        this.techs = techs;
    }

    @Override
    public String toString() {
        return "Post{" + "profile='" + profile + '\'' + ", desc='" + desc + '\'' + ", exp=" + exp + ", techs=" + Arrays.toString(techs) + '}';
    }
}

@SpringBootTest
public class Post_toString_ceffa8036e_Test {

    @Test
    public void testToString() {
        Post post = new Post();
        post.setProfile("Java Developer");
        post.setDesc("Java and Spring Boot");
        post.setExp(3);
        post.setTechs(new String[]{"Java", "Spring Boot"});
        
        String expected = "Post{profile='Java Developer', desc='Java and Spring Boot', exp=3, techs=[Java, Spring Boot]}";
        String actual = post.toString();
        
        assertEquals(expected, actual);
    }

    @Test
    public void testToStringWithNullValues() {
        Post post = new Post();
        
        String expected = "Post{profile='null', desc='null', exp=0, techs=null}";
        String actual = post.toString();
        
        assertEquals(expected, actual);
    }
}
