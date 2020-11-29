package mavendemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class _1mavendemo {
	@Test
	public void test() throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.firefox.marionette", "src/browserFiles/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		System.out.println("Success");
		driver.quit();
	}
}
