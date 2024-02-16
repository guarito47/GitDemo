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

            System.out.println(driver.getTitle()+"3");
            System.out.println(driver.getTitle()+"4");
            System.out.println("code development test 1");
            System.out.println("code development test 2");

            Assert.assertTrue(driver.getTitle().contains("BIT Consulting"));
        }
        @Test
        public void newTestDemo() throws MalformedURLException {
            MutableCapabilities caps = new MutableCapabilities();
            WebDriver driver =  new RemoteWebDriver(new URL("https://hub.browserstack.com/wd/hub"), caps);


            driver.get("https://bit-consulting.org/");

            System.out.println(driver.getTitle()+"3");
            System.out.println(driver.getTitle()+"4");
            System.out.println("code development test 1");
            System.out.println("code development test 2");

            Assert.assertTrue(driver.getTitle().contains("BIT Consulting"));
        }

}
