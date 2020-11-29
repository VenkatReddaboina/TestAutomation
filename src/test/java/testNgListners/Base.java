package testNgListners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public static WebDriver driver;
	public static void intialiazation(){
		System.setProperty("webdriver.firefox.marionette", "src/browserFiles/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
	}
	public void failed() throws IOException{
	File srcFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcFile, new File("E:/0_SeleniumFiles/1_EclipseWorkpath/TestAutomation/Screenshots/testfailure.jpg"));
			
	}

}
