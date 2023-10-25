// Test generated by RoostGPT for test JavaUnitTest using AI Type Open AI and AI Model gpt-4

package com.telusko.joblisting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class JoblistingApplication_api_24e94226d8_Test {

    @InjectMocks
    private JoblistingApplication joblistingApplication;

    @Test
    public void testApi() {
        Docket docket = joblistingApplication.api();

        assertNotNull(docket);
        assertEquals(DocumentationType.SWAGGER_2, docket.getDocumentationType());
        assertTrue(docket.getDocumentationType().equals(DocumentationType.SWAGGER_2));
        assertTrue(docket.getGroupName().isEmpty());
        assertTrue(docket.getApiInfo() != null);
        assertTrue(docket.getSelect().apis(RequestHandlerSelectors.withClassAnnotation(RestController.class)).build().equals(docket));
        assertFalse(docket.getGlobalResponseMessage(RequestMethod.GET, HttpStatus.OK).isEmpty());
    }
}
