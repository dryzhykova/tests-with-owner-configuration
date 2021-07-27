package tests.web;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebTests extends BaseTest {

    @Test
    public void runWithLocalConfigFile() throws InterruptedException {
        assertEquals("chrome", webConfig.getBrowserName());
        assertEquals("91.0", webConfig.getBrowserVersion());
        assertEquals(false, webConfig.isRemote());
        open("https://qa.guru/");
        sleep(3000);
    }

    @Test
    public void runWithRemoteConfigFile() throws InterruptedException {
        assertEquals("chrome", webConfig.getBrowserName());
        assertEquals("91.0", webConfig.getBrowserVersion());
        assertEquals(true, webConfig.isRemote());
        assertEquals("selenoid.autotests.cloud", webConfig.selenideUrl());
        assertEquals("user1", webConfig.selenideLogin());
        assertEquals("1234", webConfig.selenidePassword());
        open("https://qa.guru/");
        sleep(3000);
    }
}
