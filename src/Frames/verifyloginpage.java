package Frames;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class verifyloginpage {
	@Test
	public void enterinvalidcreds() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("http://facebook.com");
		 Loginpage login=new Loginpage(driver);
		 
		 login.enterinvalidcreds();
		
		

}
}
