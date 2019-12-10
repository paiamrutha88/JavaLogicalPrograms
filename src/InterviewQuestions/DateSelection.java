package InterviewQuestions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DateSelection {
	public WebDriver driver;
	@Test (enabled=false)
	
	public void addStock() throws InterruptedException, ParseException
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
		
		//add stock
		
		driver.findElement(By.xpath("//input[@id='addStock']")).click();
		driver.findElement(By.xpath("//input[@id='addstockname']")).sendKeys("Marico Ltd."); 
		driver.findElement(By.id("stockPurchaseDate")).click();
		selectDate("02/12/2018");
		
		
		
	}
	
	@Test
	public void createPortfolio() throws InterruptedException
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
		
		driver.findElement(By.xpath("//*[@id='headcontent']/div[1]/ul/li[2]/a")).click();
		WebElement e= driver.findElement(By.id("portfolioid"));
		Select s = new Select(e);
		s.selectByVisibleText("test");
		
		int n= getStockRowNum("Mahanagar Gas");
		System.out.println(n);
		driver.findElement(By.xpath("//table[@id='stock']/tbody/tr["+n+"]/td[1]")).click();
		
		driver.findElements(By.xpath("//input[@class='buySell']")).get(n-1).click();
		Thread.sleep(100);
		selectDate("04/16/2019");
		
		driver.findElement(By.id("buysellqty")).sendKeys("100");
		driver.findElement(By.id("buysellprice")).sendKeys("1011");

		driver.findElement(By.id("buySellStockButton")).click();
		
	}
	
	public void selectDate(String d) throws InterruptedException  
	{
		
		Date current = new Date();
		SimpleDateFormat sd= new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date selected = sd.parse(d);
			String day = new SimpleDateFormat("d").format(selected);
			String month = new SimpleDateFormat("MMMM").format(selected);
			String year = new SimpleDateFormat("yyyy").format(selected);
			
			System.out.println(day +" "+ month +" "+year);
			
			String desiredMonthYear= month+" "+year;
			
			while (true)
			{
				String displayedMonthYear = driver.findElement(By.xpath("//div[@class='dpTitleText']")).getText();
				
				if (displayedMonthYear.equals(desiredMonthYear))
				{
					//select date
				//	Thread.sleep(100);
					driver.findElement(By.xpath("//td[text()='"+day+"']")).click();
					break;
				}
				else
				{
					if (selected.compareTo(current)>0)
				
					{
					driver.findElement(By.xpath("//*[@id='datepicker']/table/tbody/tr[1]/td[4]/button")).click();
					}
					else if (selected.compareTo(current)<0)
					{
						driver.findElement(By.xpath("//*[@id='datepicker']/table/tbody/tr[1]/td[2]/button")).click();
					}
				}
			}
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
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
