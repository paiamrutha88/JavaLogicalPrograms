package InterviewQuestions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.dice.com/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

}
