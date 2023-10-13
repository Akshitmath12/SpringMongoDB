// Test generated by RoostGPT for test JavaUnitTest using AI Type Open AI and AI Model gpt-4

package com.telusko.joblisting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import springfox.documentation.service.ApiInfo;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
public class JoblistingApplication_apiInfo_0779216cdc_Test {

    @InjectMocks
    private JoblistingApplication joblistingApplication;

    @Test
    public void testApiInfoNotNull() {
        ApiInfo apiInfo = joblistingApplication.apiInfo();
        assertNotNull(apiInfo, "ApiInfo should not be null");
    }

    @Test
    public void testApiInfoProperties() {
        ApiInfo apiInfo = joblistingApplication.apiInfo();
        assertNotNull(apiInfo.getTitle(), "Title should not be null");
        assertNotNull(apiInfo.getDescription(), "Description should not be null");
        assertNotNull(apiInfo.getVersion(), "Version should not be null");
        assertNotNull(apiInfo.getTermsOfServiceUrl(), "TermsOfServiceUrl should not be null");
        assertNotNull(apiInfo.getContact(), "Contact should not be null");
        assertNotNull(apiInfo.getLicense(), "License should not be null");
        assertNotNull(apiInfo.getLicenseUrl(), "LicenseUrl should not be null");
    }
}
