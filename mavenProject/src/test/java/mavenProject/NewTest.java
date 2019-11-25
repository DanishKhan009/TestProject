package mavenProject;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class NewTest {
  @Test
  public void f() {
  }
  @BeforeClass
  public void beforeClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }
  @Test
  public void show() {
	 System.out.println("Testing"); 
  }
  @Test
  public void Tesing() {

	  WebDriver driver = null;
	  WebDriverManager.chromedriver().version("77.0.3865.40").setup();
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("start-maximized"); 
	  options.addArguments("enable-automation"); 
	  options.addArguments("--no-sandbox"); 
	  options.addArguments("--disable-infobars");
	  options.addArguments("--disable-dev-shm-usage");
	  options.addArguments("--disable-browser-side-navigation"); 
	  options.addArguments("--disable-gpu"); 
	  driver = new ChromeDriver(options);
	  		
	  		
	  		
	  driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signin");
		WebElement userId =driver.findElement(By.id("identifierId"));
		userId.sendKeys("gmailID");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  	//Test
		
		if (userId.isDisplayed()) {
			Reporter.log("Yes it is displayed");
		}
		else
		{
			Reporter.log("No its not displayed");
		}
		driver.quit();
	  	}



}
