package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravinkumar\\eclipse-workspace\\ScreenShot\\drivers\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.get("http://greenstech.in/selenium-course-content.html");
//typecast

TakesScreenshot tk = (TakesScreenshot)driver;

//temp

File s = tk.getScreenshotAs(OutputType.FILE);
System.out.println(s);

//destination

File d = new File("V:\\screenshot\\greentech.png");
System.out.println(d);

//copy

FileUtils.copyFile(s, d);
driver.quit();



}
}
