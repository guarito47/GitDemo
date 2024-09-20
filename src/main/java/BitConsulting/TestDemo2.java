package BitConsulting;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class TestDemo2 {

        /*first changes made by gitSpace in developmet and ready to upload as new branch*/
        @Test
        public void titleCheckGoogle() throws MalformedURLException {
            MutableCapabilities caps = new MutableCapabilities();
            WebDriver driver =  new RemoteWebDriver(new URL("https://hub.browserstack.com/wd/hub"), caps);


            driver.get("https://google.com/");
            System.out.println("test developmet 3");
            Assert.assertTrue(driver.getTitle().matches("Google"));
        }

        @Test
        public void newTestCase() throws MalformedURLException {
            MutableCapabilities caps = new MutableCapabilities();
            WebDriver driver =  new RemoteWebDriver(new URL("https://hub.browserstack.com/wd/hub"), caps);


            driver.get("https://google.com/");
            System.out.println("test developmet 3");
            Assert.assertTrue(driver.getTitle().matches("Google"));
        }


}
