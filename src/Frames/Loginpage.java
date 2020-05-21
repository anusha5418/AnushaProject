package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Loginpage {

WebDriver driver;
By first_name = By.xpath("//input[@name='firstname']");
By surname= By.xpath("//input[@name='lastname']");
By mobilenumber=By.xpath("//input[@name='reg_email__']");
By dropdown=By.xpath("//select[@id='month']");
//Select Monthobj=new Select(driver.findElement());
//Select dayobj=new Select(driver.findElement(By.xpath("//select[@id='day']")));
//Select yearobj=new Select(driver.findElement(By.xpath("//select[@id='year']")));
By submit=By.xpath("//button[@name='websubmit']");

public Loginpage(WebDriver driver) {
	System.out.println("inside constrctor");
 this.driver=driver;
}
public void enterinvalidcreds(){
	System.out.println("entering details....");
	driver.findElement(first_name).sendKeys("Invalid firstname");
	driver.findElement(surname).sendKeys("invalid surname");
	driver.findElement(mobilenumber).sendKeys("12344658868");
	
	
	Select obj = new Select(driver.findElement(dropdown));
	obj.selectByVisibleText("");
	
//	Monthobj.selectByVisibleText("June");
//	dayobj.selectByValue("11");
//	yearobj.selectByValue("1993");
//	driver.findElement(submit).click();

}
}
 