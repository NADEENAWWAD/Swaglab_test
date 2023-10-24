
import java.awt.Button;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Swaglab_test extends Swagtwo {

	
	
	@BeforeMethod
	public void mySetup() 
	{
		
	driver.get(Url);
	

	}

	@Test()
	
	public void LoginWithStandardUSer() throws InterruptedException {
		loginfunction(StandardUserName, passWord);

		Thread.sleep(2000) ;

	}

	@Test()
	public void LoginWithProblemUser() throws InterruptedException {
		loginfunction(ProblemUserName, passWord);

			Thread.sleep(2000) ;


	}
	@Test()
	public void LoginWithPerformanceUser() throws InterruptedException {
		loginfunction(PerformanceUserName, passWord);

			Thread.sleep(2000) ;



	}

	@AfterMethod
	public void myPostTesting() {

	}
}