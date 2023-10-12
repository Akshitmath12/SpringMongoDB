// Test generated by RoostGPT for test JavaUnitTest using AI Type Open AI and AI Model gpt-4

package com.telusko.joblisting.controller;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.mock.web.MockHttpServletResponse;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class PostController_redirect_31b271143a_Test {
    @InjectMocks
    PostController postController;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testRedirectSuccess() throws IOException {
        MockHttpServletResponse response = new MockHttpServletResponse();
        postController.redirect(response);
        assertEquals("/swagger-ui.html", response.getRedirectedUrl());
    }

    @Test(expected = IOException.class)
    public void testRedirectFailure() throws IOException {
        MockHttpServletResponse response = new MockHttpServletResponse();
        response.sendError(404);
        postController.redirect(response);
    }
}
