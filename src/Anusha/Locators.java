package Anusha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		try {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
			Thread.sleep(1000);
	    driver.get("http://facebook.com");
		WebElement firstname_ele=driver.findElement(By.name("firstname"));
		firstname_ele.sendKeys("Nathasha");
		WebElement Surname=driver.findElement(By.name("lastname"));
		Surname.sendKeys("Sidh");
		Thread.sleep(1000);
		firstname_ele.clear();
		firstname_ele.sendKeys("Nathasha");
		WebElement submitButton=driver.findElement(By.name("websubmit"));
		submitButton.click();
		Thread.sleep(1000);
		
		
		driver.close();
		} catch (InterruptedException e) {
			System.out.println("in exception block, failed to perform browser action...");
			e.printStackTrace();
		}
		
		
		
		
		// TODO Auto-generated method stub

	}

}
