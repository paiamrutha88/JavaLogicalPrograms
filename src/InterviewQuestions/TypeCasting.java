package InterviewQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TypeCasting {
	public static WebDriver driver;
	@Test
	public void test()
	{
		// TODO Auto-generated method stub


		driver= new ChromeDriver();
		
	}

}
class A1
{}
class B1 extends A1
{}