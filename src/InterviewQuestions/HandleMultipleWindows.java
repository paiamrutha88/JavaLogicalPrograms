package InterviewQuestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindows {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
	 
	//System.setProperty("webdriver.chrome.driver", "D:chromedriver.exe");
	driver =  new ChromeDriver();
	driver.get("http://toolsqa.com/automation-practice-switch-windows/");
	String parentWindowHandle = driver.getWindowHandle();
	System.out.println("Parent window's handle -> " + parentWindowHandle);
	WebElement clickElement = driver.findElement(By.id("button1"));
	 
	for(int i = 0; i < 3; i++)
	{
	clickElement.click();
	Thread.sleep(3000);
	}
	 
	Set<String> allWindowHandles = driver.getWindowHandles();
	 
	for(String handle : allWindowHandles)
	{
	System.out.println("Window handle - > " + handle);
	
	}
	Iterator<String> itr= allWindowHandles.iterator();
	
	while(itr.hasNext()){
		String childWindow=itr.next();
		// Compare whether the main windows is not equal to child window. If not equal, we will close.
		if(!parentWindowHandle.equals(childWindow)){
		driver.switchTo().window(childWindow);
		System.out.println(driver.switchTo().window(childWindow).getTitle());
		driver.close();
	}
	}
	}

}
