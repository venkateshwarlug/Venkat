package POMframework;

	import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class Stock
	{
		FirefoxDriver driver;
		@BeforeTest
		public void open() 
		{
			driver=new FirefoxDriver();
			driver.get("http://webwaves.in/ecommerce/seller/");
		}
		
		@Test
		public void data()
		{
			WebwavesLogin page1 =PageFactory.initElements(driver, WebwavesLogin.class);
			
			
		}

	}


