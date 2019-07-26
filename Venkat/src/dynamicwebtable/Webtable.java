package dynamicwebtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class Webtable {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest 
	public void open()
	{
	pr=new ProfilesIni();
	fp=pr.getProfile("venki");
	driver=new FirefoxDriver();
	driver.get("https://www.timeanddate.com/worldclock/");
	}
	@Test
	public void data()
	{
		WebElement table=driver.findElement(By.xpath(""));
		List<WebElement>nrows=table.findElements(By.tagName("tr"));
	
	for(int i=0;i<nrows.size();i++)
     {
	List<WebElement>ncolumns=nrows.get(i).findElements(By.tagName("td"));
	for(int j=0;j<ncolumns.size();j++) {
		String s=ncolumns.get(j).getText();
		System.out.print(s);
	}
	System.out.println();
		
	}
		
	}
}



