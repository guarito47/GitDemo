package BitConsulting;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;



public class TestDemo {


        @Test
        public void titleCheck() throws MalformedURLException {
            MutableCapabilities caps = new MutableCapabilities();
            WebDriver driver =  new RemoteWebDriver(new URL("https://hub.browserstack.com/wd/hub"), caps);


            driver.get("https://bit-consulting.org/");
            Assert.assertTrue(driver.getTitle().contains("BIT Consulting"));
        }


}