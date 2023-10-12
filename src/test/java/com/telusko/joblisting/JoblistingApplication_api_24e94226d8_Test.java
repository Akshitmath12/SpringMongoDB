// Test generated by RoostGPT for test JavaUnitTest using AI Type Open AI and AI Model gpt-4

package com.telusko.joblisting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
@EnableSwagger2
public class JoblistingApplication_api_24e94226d8_Test {

    @InjectMocks
    JoblistingApplication joblistingApplication;

    @Test
    public void testApi() {
        Docket docket = joblistingApplication.api();
        assertNotNull(docket);
    }

    @Test
    public void testApiInfo() {
        Docket docket = joblistingApplication.api();
        assertNotNull(docket.getApiInfo());
    }
}
