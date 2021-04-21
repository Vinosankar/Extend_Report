package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openfun {

	static WebDriver driver; 
	
	 public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.get("http://www.google.com");
	    driver.findElement(By.name("q")).sendKeys("Whatsup Duck!");
	    driver.findElement(By.name("q")).submit();
	    driver.quit();
}
}
