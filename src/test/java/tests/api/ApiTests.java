package tests.api;

import config.ApiConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApiTests {
    public static ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());

    @Test
    public void getTokenAndUrlFromFile() {
        final String expectedToken = "123456789";
        final String expectedBaseUrl = "https://qa.guru";
        Assertions.assertEquals(apiConfig.getToken(), expectedToken);
        Assertions.assertEquals(apiConfig.getBaseUrl(), expectedBaseUrl);
    }

    @Test
    public void getTokenAndUrlFromSystemProperties() {
        final String expectedToken = "987654321";
        final String expectedBaseUrl = "https://google.com";
        Assertions.assertEquals(apiConfig.getToken(), expectedToken);
        Assertions.assertEquals(apiConfig.getBaseUrl(), expectedBaseUrl);
    }
}
