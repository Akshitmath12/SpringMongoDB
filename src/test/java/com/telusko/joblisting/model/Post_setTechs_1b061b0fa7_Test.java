// Test generated by RoostGPT for test JavaUnitTest using AI Type Open AI and AI Model gpt-4

package com.telusko.joblisting.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Post_setTechs_1b061b0fa7_Test {

    private JobListing jobListing;

    @BeforeEach
    public void setUp() {
        jobListing = new JobListing();
    }

    @Test
    public void testSetTechs_Success() {
        String[] techs = {"Java", "Spring Boot", "MongoDB"};
        jobListing.setTechs(techs);
        assertArrayEquals(techs, jobListing.getTechs());
    }

    @Test
    public void testSetTechs_Empty() {
        String[] emptyTechs = {};
        jobListing.setTechs(emptyTechs);
        assertArrayEquals(emptyTechs, jobListing.getTechs());
    }

}
