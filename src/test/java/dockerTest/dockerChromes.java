package dockerTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class dockerChromes {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dcap = new DesiredCapabilities();
		dcap.setBrowserName("chrome");
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url,dcap);
		driver.get("https://www.google.com/");
		System.out.println("Title of the page: "+driver.getTitle());
		driver.quit();
	}
}
