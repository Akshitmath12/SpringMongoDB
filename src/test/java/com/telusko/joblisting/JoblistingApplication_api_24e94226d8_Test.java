// Test generated by RoostGPT for test JavaUnitTest using AI Type Open AI and AI Model gpt-4

package com.telusko.joblisting;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@EnableSwagger2
class JoblistingApplication_api_24e94226d8_Test {

    @Autowired
    private Docket docket;

    @Test
    void testApi() {
        assertNotNull(docket);
        assertEquals("2.0", docket.getDocumentationType().getVersion());
        assertNotNull(docket.getGroupName());
        assertFalse(docket.isUseDefaultResponseMessages());
    }

    @Test
    void testApiInfo() {
        assertNotNull(docket.getApiInfo());
    }
}
