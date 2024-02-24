package dockerTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExecuteTestDocker {
	@Test
	public void localtest() throws MalformedURLException {
	WebDriverManager.chromedriver().setup();
	DesiredCapabilities dcap = new DesiredCapabilities();
	URL url = new URL("http://localhost:4444/wd/hub");
	WebDriver driver = new RemoteWebDriver(url,dcap);
	driver.get("https://www.google.com/");
	System.out.println("Title of the page"+driver.getTitle());
	driver.quit();
	}
}
