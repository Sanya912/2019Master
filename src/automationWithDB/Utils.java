package automation;



import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.jdbc.Driver;

public class Utils {

	public static void main(String[] args) throws SQLException {

		System.setProperty("webdriver.chrome.driver","C:\\DRIVERS\\chromeDriver75\\chromedriver.exe");
		
		DataBaseConnection ob1 = new DataBaseConnection();
		String us = ob1.dbConnector1("select * from credentials where scenario = 'dssdddsfegwggggfef'; ", "username");
		//String ge = "Philadelphia";
		WebDriver br = new ChromeDriver();
		br.get("https://www.zillow.com");
		br.findElement(By.xpath("//input[@type='text']")).sendKeys("" +us+"");
		
	}

}
