package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:config/${state}.web.properties"
})
public interface WebConfig extends Config {

    @Key("browser.name")
    String getBrowserName();

    @Key("browser.version")
    String getBrowserVersion();

    @Key("remote")
    Boolean isRemote();

    @Key("selenide.url")
    String selenideUrl();

    @Key("selenide.login")
    String selenideLogin();

    @Key("selenide.password")
    String selenidePassword();
}
