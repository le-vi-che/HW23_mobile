package Config;

import org.aeonbits.owner.Config;

@Config.Sources(
        {"classpath:mobile.properties"}
)
public interface BrowserstackConfig extends Config {

    @Key("user")
    String getUser();

    @Key("key")
    String getKey();

    @Key("app")
  //  @DefaultValue("//app=bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c")
    String getApp();

    @Key("device")
    String getDevice();

    @Key("osVersion")
    String getOsVersion();

    @Key("baseUrl")
    String getBaseUrl();


    @Key("project")
    String getProject();

    @Key("build")
    String getBuild();

    @Key("name")
    String getName();
}
