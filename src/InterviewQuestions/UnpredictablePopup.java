package InterviewQuestions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnpredictablePopup {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qtpselenium.com/test/unpredictable.php");
		Set<String>winIds= driver.getWindowHandles();
		System.out.println(winIds.size());
		if (winIds.size()==2)
		{
			Iterator <String>itr = winIds.iterator();
			String mainId= itr.next();
			String popupId=itr.next();
			driver.switchTo().window(popupId);
			driver.close();
			driver.switchTo().window(mainId);
		}
	}

}
