// Test generated by RoostGPT for test JavaUnitTest using AI Type Open AI and AI Model gpt-4

package com.telusko.joblisting;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

public class JoblistingApplication_api_24e94226d8_Test {

    @InjectMocks
    JoblistingApplication joblistingApplication;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testApi() {
        Docket result = joblistingApplication.api();
        assertNotNull(result);
        assertEquals(DocumentationType.SWAGGER_2, result.getDocumentationType());
        assertTrue(result.getDocumentationType().equals(DocumentationType.SWAGGER_2));
    }

    @Test
    public void testApiInfo() {
        ApiInfo result = joblistingApplication.apiInfo();
        assertNotNull(result);
    }
}
