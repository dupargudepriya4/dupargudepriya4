

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethod12Aug {
	WebDriver driver;
	
	@BeforeMethod
	public void before() {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	driver.manage().window().maximize();
	//To load the website
	driver.get("https:/www.google.com/?gws_rd=ssl");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	Reporter.log("BeforeMethod",true);
	}
	
	@AfterMethod
	public void after() {
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Reporter.log("AfterMethod",true);
		
	}
		
	@Test
	public void Test_01() {
		WebElement d1 = driver.findElement(By.xpath("//input[class='gLFyf gsfi']"));
		d1.sendKeys("java",Keys.ENTER);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		for(int i=0 ; i<=11; i++) {
			
			Reporter.log("Test Case 1 Successful",true);
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			
		}
		
	}
	
	

}
