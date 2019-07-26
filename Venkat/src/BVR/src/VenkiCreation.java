package BVR.src;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class VenkiCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("onlineQA");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("https://www.google.co.in/maps/@38.1748061,-84.822638,3a,75y,345.63h,90t/data=!3m6!1e1!3m4!1sL0Z7lhcCrTPTZ7EaXBQnzw!2e0!7i13312!8i6656");

	}

}
