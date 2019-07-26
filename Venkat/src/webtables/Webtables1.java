
	package webtables;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.firefox.FirefoxProfile;
	import org.openqa.selenium.firefox.internal.ProfilesIni;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Webtables1 {
		ProfilesIni pr;
		FirefoxProfile fp;
		FirefoxDriver driver;
		@BeforeTest 
		public void open()
		{
		pr=new ProfilesIni();
		fp=pr.getProfile("onlineQA");
		driver=new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		}
		@Test
		public void data()
		{
			
			List<WebElement>table=driver.findElements(By.tagName("table"));
			System.out.println(table.size());
		}
		

	}


