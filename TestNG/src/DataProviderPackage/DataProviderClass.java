package DataProviderPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	WebDriver driver;	
@BeforeMethod
public void setupMethod()


{	
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anu suresh\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
      driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.get("https://facebook.com/");
	}

@DataProvider
public void getTestData() {

}
@Test
public void ApplicationTest(String firstname,String lastname,String EmailAdress, String password)
{
	driver.findElement(By.id("u_0_n")).sendKeys(firstname);
	driver.findElement(By.id("u_0_o")).sendKeys(lastname);
	driver.findElement(By.id("u_0_r")).sendKeys(EmailAdress);
	driver.findElement(By.id("u_0_w")).sendKeys(password);


	
	


}


@AfterMethod
public void closeMethod()
{
	driver.quit();
}
}
