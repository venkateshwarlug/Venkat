package appachipoi;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebDriverWithPoi {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	FileInputStream fso;
	XSSFWorkbook wbo;
    XSSFSheet wso;
FileOutputStream fo;

@BeforeTest
public void open() {
	pr=new ProfilesIni();
  fp=pr.getProfile("onlineQA");
  driver=new FirefoxDriver();
  driver.get("https://google.com");
}
  @Test
  public void test() throws IOException
  {
	  
	  FileInputStream fso=new FileInputStream("C:\\Users\\lenovo\\Desktop\\abc.xlsx");
	   wbo=new XSSFWorkbook(fso);
	   wso=wbo.getSheet("abc");
	  Row r;
	  r=wso.createRow(0);
	  String data=driver.findElement(By.linkText("Gmail")).getText();
	  r.createCell(0).setCellValue(data);
	  FileOutputStream fo=new FileOutputStream("C:\\Users\\lenovo\\Desktop\\abc.xlsx");
	  wbo.write(fo);
	  driver.close();
	  
  }	

}