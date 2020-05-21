package Anusha;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Promppopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		
		
		
		//Scroll page to Webelement
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		//Scroll by pixel
		jse.executeScript("scroll(0,500);");
		
	   driver.findElement(By.xpath("//button[contains(text(),'Prompt Pop up')]")).click();
		
		Alert alert=driver.switchTo().alert();
		String alertText= driver.switchTo().alert().getText();
		System.out.println("alert text is, "+alertText);
		alert.sendKeys("Anusha");
		Thread.sleep(10000);
		alert.accept();
		
		driver.quit();
		// TODO Auto-generated method stub

	}

}
