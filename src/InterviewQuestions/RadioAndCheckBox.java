package InterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioAndCheckBox {
	
	WebDriver driver=new ChromeDriver();
	
	@Test
	public void checkRadio() throws InterruptedException
	{
		driver.get("http://demo.guru99.com/test/radio.html");
		driver.findElement(By.id("vfb-7-1")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("vfb-7-2")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("vfb-7-3")).click();
		System.out.println(driver.findElement(By.id("vfb-6-0")).isSelected());
		driver.findElement(By.id("vfb-6-0")).click();
		System.out.println(driver.findElement(By.id("vfb-6-0")).isSelected());
		driver.findElement(By.id("vfb-6-1")).click();
		driver.findElement(By.id("vfb-6-2")).click();
		
		
	}

}
