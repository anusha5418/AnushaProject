package Anusha;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.text.DateFormatter;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class alertsinSelenium {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		
		
		
		//Scroll page to Webelement
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		//Scroll by pixel
		jse.executeScript("scroll(0,350);");
		
		driver.findElement(By.xpath("//button[contains(text(),'Simple Alert')]")).click();
	
	 
		Alert Alert=driver.switchTo().alert();
		String alertText= driver.switchTo().alert().getText();
		Alert.accept();
		 
		Random r =new Random();
		int rand_1= r.nextInt(10000);
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		LocalDateTime now= LocalDateTime.now();
		String currentDateWithTime= df.format(now);
		System.out.println(currentDateWithTime);
		
		 File myScreenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File path=new File(System.getProperty("user.dir")+"\\Screenshots\\"+currentDateWithTime+".png");
		 Files.copy(myScreenshot,path);
		System.out.println("alert text is, "+alertText);
		
		
		Thread.sleep(3000);
		driver.quit();
		// TODO Auto-generated method stub

	}

}
