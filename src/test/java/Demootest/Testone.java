package Demootest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testone {
	
	WebDriver driver;
	
	@BeforeTest
	public void test2() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rbishoyi\\OneDrive - DXC Production\\Desktop\\New folder (3)\\New folder (2)\\chromedriver.exe");

		driver=new ChromeDriver();
		
		
	}
	@Test
	public void test() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		WebElement w1=driver.findElement(By.xpath("//input[@id='email']"));
		w1.sendKeys("rohitbishoyi3@gmail.com");
		WebElement w2=driver.findElement(By.xpath("//input[@id='pass']"));
		w2.sendKeys("rohitdavid10");
		Thread.sleep(5000);
		WebElement w3=driver.findElement(By.xpath("//button[@name='login']"));
		w3.click();
		Thread.sleep(5000);
		
	}
	
	
	@AfterTest
	public void test3() {
		driver.close();
	}

}
