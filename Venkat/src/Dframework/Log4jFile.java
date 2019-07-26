package Dframework;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Log4jFile {
	
 private static Logger log=Logger.getLogger(Log4jFile.class);
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
@BeforeTest
public void open() {
	DOMConfigurator.configure("Log4j.xml");
	pr=new ProfilesIni();
  fp=pr.getProfile("onlineQA");
  log.info("first profile created");
  driver=new FirefoxDriver();
  log.info("such browser opened");
  driver.get("https://opensource-demo.orangehrmlive.com/");
  log.info("succ page navigated");
}
@Test
public void login(){
	driver.findElement(By.id("txtUsername")).clear();
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	log.info("succ user name inserted");
	driver.findElement(By.id("txtPassword")).clear();
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	log.info("succ password inserted");
	driver.findElement(By.id("btnLogin")).click();
	log.info("succ btnlogin");
}
}