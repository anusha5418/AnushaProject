package Anusha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());// validate whether u landed in correct url
		//System.out.println(driver.getPageSource());//print page source
		
		driver.navigate().to("http://yahoo.com");
		//driver.navigate().back();
		driver.close();// close current browser
		//driver.quit();// close all browsers opened by Selenium
		
		

	}

}
