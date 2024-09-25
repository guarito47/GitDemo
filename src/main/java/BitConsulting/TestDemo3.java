package BitConsulting;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class TestDemo3 {

        /*last change from gitspace 25/9/24 */
        @Test
        public void titleCheckGoogle() throws MalformedURLException {
            MutableCapabilities caps = new MutableCapabilities();
            WebDriver driver =  new RemoteWebDriver(new URL("https://hub.browserstack.com/wd/hub"), caps);

            /*new version from gitspace into branch development*/
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
