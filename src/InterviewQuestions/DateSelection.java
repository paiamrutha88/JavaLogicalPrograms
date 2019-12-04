package InterviewQuestions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DateSelection {
	public WebDriver driver;
	@Test
	
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
}
