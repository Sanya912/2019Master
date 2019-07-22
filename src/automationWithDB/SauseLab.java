package automationWithDB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SauseLab {

	public static final String USERNAME  ="omelik912";
	public static final String ACCESS_KEY = "bc3d1451-0c3d-45f8-82a4-feaba1459842";
	 public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 7");
		caps.setCapability("version", "75.0");
		

		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
	}

}
