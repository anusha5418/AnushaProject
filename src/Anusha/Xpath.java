package Anusha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath {

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
			driver.findElement(By.name("websubmit")).click();
			System.out.println(driver.getTitle());
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("12345678");
			WebElement MonthDropdown=driver.findElement(By.xpath("//select[@id='month']"));
			Select Monthobj=new Select( MonthDropdown);
			Monthobj.selectByVisibleText("Jun");
			WebElement dayDropdown=driver.findElement(By.xpath("//select[@id='day']"));
			Select dayobj=new Select( dayDropdown);
			dayobj.selectByValue("11");		
			WebElement YearDropdown=driver.findElement(By.xpath("//select[@id='year']"));
			Select Yearobj=new Select( YearDropdown);
			Yearobj.selectByValue("1993");
			WebElement gendertype=driver.findElement(By.xpath("//input[@name='sex']//following-sibling::label[contains(text(),'Female')]"));
			gendertype.click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[contains(text(),'Forgot account?')]")).click();
		    Thread.sleep(1000);
			driver.close();
			} catch (InterruptedException e) {
				System.out.println("in exception block, failed to perform browser action...");
				e.printStackTrace();
			}
			
			
			
		// TODO Auto-generated method stub

	}

}
