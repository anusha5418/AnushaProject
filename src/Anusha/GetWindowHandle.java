package Anusha;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.toolsqa.com/selenium-webdriver/handling-multiple-browsers-in-selenium-webdriver/");
			String firstwindowprop =driver.getWindowHandle();
			System.out.println("fisrt window prop is "+firstwindowprop);
		    WebElement link = driver.findElement(By.xpath("//a[@title='Switch Window Practice Page for Selenium WebDriver']"));
		    JavascriptExecutor jsx = (JavascriptExecutor)driver;
		    jsx.executeScript("window.scrollBy(0,350)");
		    link.click();
		    Set<String> allwindows=driver.getWindowHandles();
		    for (String prop : allwindows) {
		    	System.out.println("properties"+prop);
		    }
				Thread.sleep(1000);
		        driver.quit();
			} catch (InterruptedException e) {
				System.out.println("in exception block, failed to perform browser action...");
				e.printStackTrace();
			}

	}

}
