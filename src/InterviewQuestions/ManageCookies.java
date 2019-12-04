package InterviewQuestions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.StringTokenizer;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class ManageCookies {
	
	
	FileWriter fw;
	BufferedWriter bw;
	@Test (enabled=true)
	public void storeCookie()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");
		
		driver.findElement(By.name("username")).sendKeys("abc123");
		driver.findElement(By.name("password")).sendKeys("123xyz");
		driver.findElement(By.name("submit")).click();
		
		//Store cookie
		
		File f=new File("Cookies.data");
		f.delete();
		try {
			f.createNewFile();
			 fw= new FileWriter(f);
			
			 bw=new BufferedWriter(fw);
			
			for (Cookie ck : driver.manage().getCookies())
			{
				
				bw.write(ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure());
				bw.newLine();
			}
			
			bw.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
	
	//use cookie
	@Test
	public void useCookie()
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		File f= new File("Cookies.data");
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br= new BufferedReader(fr);
			
			String strLine;
			try {
				while((strLine=br.readLine())!= null)
				{
					StringTokenizer stoken = new StringTokenizer(strLine,";");
						
						while(stoken.hasMoreTokens())
						{
							String name= stoken.nextToken();
							String value=stoken.nextToken();
							String domain = stoken.nextToken();
							String path = stoken.nextToken();
							
							Date expiry=null;
							
							
							
							
							Boolean isSecure = new Boolean(stoken.nextToken()).booleanValue();
							
							Cookie ck=new Cookie(name,value,domain,path,expiry,isSecure);
									
							System.out.println(ck);
							driver.manage().addCookie(ck);
							
						}
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");
	}
	

}
