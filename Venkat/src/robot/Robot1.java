package robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Robot1 {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;

	@BeforeTest
	public void open() {
		pr = new ProfilesIni();
		fp = pr.getProfile("onlineQA");
		driver = new FirefoxDriver();
		driver.get("https://docs.seleniumhq.org/download/");
	}

	@Test
	public void data() throws InterruptedException, AWTException {
		driver.findElement(By.linkText("3.141.59")).click();
		Thread.sleep(5000);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_ENTER);
	}
}