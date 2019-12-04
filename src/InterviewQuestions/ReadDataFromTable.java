package InterviewQuestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadDataFromTable {
	public WebDriver driver;
	@Test
	public void deleteStock() throws InterruptedException
	{
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.rediff.com/");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a[2]")).click();
		driver.findElement(By.xpath("//span[@id=\"signin_info\"]/a[1]")).click();
		
		driver.findElement(By.id("useremail")).sendKeys("paiamrutha88@gmail.com");
		
		driver.findElement(By.id("emailsubmit")).click();
		
		driver.findElement(By.id("userpass")).sendKeys("caps9876");
		
		driver.findElement(By.id("loginsubmit")).click();
		Thread.sleep(100);
		
		//click on my port folio
		
		driver.findElement(By.xpath("//*[@id='headcontent']/div[1]/ul/li[2]/a")).click();
		
		//delete stock
		
		String stockName="Mahanagar Gas";
		
		//find row number of stockname
		
		int n= getStockRowNum(stockName);
		System.out.println(n);
		if (n== -1)
			System.out.println("stock not found");

		driver.findElement(By.xpath("//table[@id='stock']/tbody/tr["+n+"]/td[1]")).click();
		driver.findElements(By.xpath("//input[@name='Delete']")).get(n-1).click();
		
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
				
	}

	
	public int getStockRowNum (String stockName)
	{
		List <WebElement> rows= driver.findElements(By.xpath("//table[@id='stock']/tbody/tr"));
		for (int rNum=0;rNum<rows.size();rNum++)
		{
			WebElement row= rows.get(rNum);
			List<WebElement> cells = row.findElements(By.tagName("td"));
			
			for (int cNum=0;cNum<cells.size();cNum++)
			{
				WebElement cell=cells.get(cNum);
				
				if (!cell.getText().trim().equals("") && stockName.contains(cell.getText()))
					return ++rNum;
			}
			
		}
		return -1;
	}
}
