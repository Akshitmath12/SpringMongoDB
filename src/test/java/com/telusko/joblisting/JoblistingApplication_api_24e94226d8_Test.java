// Test generated by RoostGPT for test JavaUnitTest using AI Type Open AI and AI Model gpt-4

package com.telusko.joblisting;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.spi.DocumentationType;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

public class JoblistingApplication_api_24e94226d8_Test {

    @Test
    public void testApi() {
        // Mock the Docket instance
        Docket docket = Mockito.mock(Docket.class);
        when(docket.select()).thenReturn(docket);
        when(docket.apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))).thenReturn(docket);
        when(docket.build()).thenReturn(docket);
        when(docket.useDefaultResponseMessages(false)).thenReturn(docket);

        // Create instance of the class containing the method to be tested
        JoblistingApplication joblistingApplication = new JoblistingApplication();

        // Call the method
        Docket result = joblistingApplication.api();

        // Assertions
        assertNotNull(result);
        assertEquals(result, docket);
    }

    @Test
    public void testApiFailure() {
        // Mock the Docket instance
        Docket docket = Mockito.mock(Docket.class);
        when(docket.select()).thenReturn(null);

        // Create instance of the class containing the method to be tested
        JoblistingApplication joblistingApplication = new JoblistingApplication();

        // Call the method
        Docket result = joblistingApplication.api();

        // Assertions
        assertNotNull(result);
        assertEquals(result, docket);
    }
}
