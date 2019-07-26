package TestNGFrameWork;

import org.testng.annotations.Test;

public class Tc1Hrm{
	HrmLoginTCByTestNG obj;
	@Test
	public void open()
	{
		
		obj=new HrmLoginTCByTestNG();
		obj.open();
		obj.login("Admin","admin123");
		obj.verifystatus();
		obj.logout();
		obj.close();

}
}