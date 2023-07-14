package BitConsulting;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class TestDemo2 {


        @Test
        public void titleCheckGoogle() throws MalformedURLException {
            MutableCapabilities caps = new MutableCapabilities();
            WebDriver driver =  new RemoteWebDriver(new URL("https://hub.browserstack.com/wd/hub"), caps);


            driver.get("https://google.com/");
            Assert.assertTrue(driver.getTitle().matches("Google"));
        }


}
