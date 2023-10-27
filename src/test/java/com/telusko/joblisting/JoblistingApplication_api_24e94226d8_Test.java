package com.telusko.joblisting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
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
    }

    @Test
    public void testApiWithRestController() {
        Docket docket = joblistingApplication.api();
        assertNotNull(docket);
        assertNotNull(docket.getGroupName());
    }
}
