

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActiTimePopUp {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//To load the browser
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
		
		//To click on login button
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(5000);
		//To click on question mark
		driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_support']")).click();
		
		//to click on about ur actitime
		driver.findElement(By.xpath("//a[@class='item_link' and @onclick='MenuHandler.openAbout(); return false;' ]")).click();
	
		
		//thread timing removed..
		System.out.println("helloo....");
		
		System.out.println("helloo techneai team....");
		
		//To print text on console using gettext()
		System.out.println(driver.findElement(By.xpath("//span[@class='productVersion']")).getText());
		Thread.sleep(2000);
		
		

	}

}
