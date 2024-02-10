package drivers;

import Config.browserstackConfig;
import com.codeborne.selenide.WebDriverProvider;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;

public class BrowserstackDriver implements WebDriverProvider {

    static browserstackConfig config = ConfigFactory.create(browserstackConfig.class, System.getProperties());
    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        MutableCapabilities caps = new MutableCapabilities();
      
        caps.setCapability("browserstack.user",  config.getUser());
        caps.setCapability("browserstack.key", config.getKey());

        caps.setCapability("apps", config.getApp());

        caps.setCapability("device", config.getDevice());
        caps.setCapability("os_version", config.getOsVersion());

        caps.setCapability("project", config.getProject());
        caps.setCapability("build", config.getBuild());
        caps.setCapability("name", config.getName());

        try {
            return new RemoteWebDriver(
                    new URL(config.getBaseUrl()), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
