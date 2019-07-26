package Dframework;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;

public class TestNGListners implements ITestListener{

	@Override
	public void onFinish(ITestContext result) {
		System.out.println("TC on Finish output is"+" "+result.getName());
		
	}

	@Override
	public void onStart(ITestContext result) {
		System.out.println("TC on start output is"+"  "+result.getName());
	
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println("TC on start out put is"+" "+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test on failure"+" "+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TC on Test skipped"+" "+result.getName());
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("TC on Test start"+" "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("TC on Test sucess"+" "+result.getName());	
	}
		
		
	}

	
	


