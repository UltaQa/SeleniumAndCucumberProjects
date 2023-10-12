package SearchingFor;



import java.util.concurrent.TimeUnit;

import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class SeleniumJobs {
	
	String alertValue = "";
	String jobAlertCreated = "Job Alert Created";
	
	
	WebDriver driver = null;

	@Given("^On indeed home page$")
	public void on_indeed_home_page() throws Throwable {
		System.out.println("First Step .. User is on indeed home page");
		
		System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver"); // location of chromedriver

		driver = new ChromeDriver(); // instantiating Chrome driver

		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.indeed.com"); // opening indeed.com
		
		driver.manage().timeouts().pageLoadTimeout(360,TimeUnit.SECONDS); // timeout ensures values entered in text boxes are maintained

}	

	@When("^search for selenium jobs$")
	public void search_for_selenium_jobs() throws Throwable {
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"text-input-what\"]")).sendKeys("selenium automation"); // Will send job search to input field
		driver.findElement(By.xpath("//*[@id=\"text-input-what\"]")).sendKeys(Keys.RETURN); // Will send job search to input field

		}

	@Then("^refine job search$")
	public void click_on_job_openings() throws Throwable {
		
		
		//*[@id="job_7896a0acdae878f9"]
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"filter-salary-estimate\"]")).click(); // filter by salary above $110,000
		driver.findElement(By.xpath("//*[@id=\"filter-salary-estimate-menu\"]/li[4]/a")).click(); 
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"filter-dateposted\"]/div[1]")).click(); // filter by salary above $110,000
		driver.findElement(By.xpath("//*[@id=\"filter-dateposted-menu\"]/li[4]/a")).click(); 
		Thread.sleep(5000);
		
		
		//*[@id="filter-salary-estimate"]/div[2]/svg
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
	
	@Then("^register for email alerts$")
	public void register_for_email_alerts() throws Throwable {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1550)", "");
		driver.findElement(By.xpath("//*[@id=\"DesktopSERPJobAlert-email\"]")).sendKeys("mauricesandersthefirst@gmail.com");
      
		
		driver.findElement(By.xpath("//*[@id=\"DesktopSERPJobAlertActivateButton\"]/span")).click();
		/**/
		alertValue = driver.findElement(By.xpath("//*[@id=\"jobalertActive\"]/div[2]/div/div")).getText();
		
		if (alertValue.equals(jobAlertCreated))
		{
			System.out.println("Job Alert Created");
		}
		else
		{
			throw new Exception("Job Alert Failed To Be Created");
		}
		//*[@id="job_7896a0acdae878f9"]
		//Thread.sleep(5000);

		//driver.findElement(By.xpath("//*[@id=\"filter-dateposted\"]/div[1]")).click(); // filter by salary above $110,000
		/* 
		 */
		/*Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"filter-srctype\"]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"filter-srctype-menu\"]/li[1]/a")).click();
		//*[@id="filter-dateposted"]
		//*[@id="filter-salary-estimate"]/div[2]/svg
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	     * */
	     
	}
	
	

}


	
	/*
	
	
	@Given("On indeed home page")
	public void on_indeed_home_page() throws Throwable {
		
/*
 

@Given("^On indeed home page$")
public void on_indeed_home_page() {
	/*System.out.println("First Step .. User is on login page");
	
	System.setProperty("webdriver.chrome.driver","Home⁩\\⁨Users⁩\\⁨ceo⁩\\⁨eclipse-workspace⁩\\⁨Indeed⁩\\⁨src⁩\\test⁩\\⁨resources\\chromeriver⁩");
	driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	driver.manage().window().maximize();

	// C:\QaTests\CarterAutomatedFramework\src\test\resources\chromedriver_win32

    // Write code here that turns the phrase above into concrete actions

}  


@When("^search for selenium jobs$")
public void search_for_selenium_jobs() {/*
		System.out.println("Second Step .. User enters username and password");
		driver.navigate().to("https://test-bellomyrc.bellomyonline.com/");
		driver.findElement(By.xpath("//*[@id=\"login_user_name\"]")).sendKeys("bellomyresearch\\sitester");   
		driver.findElement(By.xpath("//*[@id=\"login_password\"]")).sendKeys("lVE6T$y%485LW1i");


    // Write code here that turns the phrase above into concrete actions
  
}

@Then("^click on job openings$")
public void click_on_job_openings() throws Throwable {
	
	/*
	System.out.println("Fourth Step .. User clicks on login button");
	driver.findElement(By.xpath("//*[@id=\"login_contents\"]/fieldset/button")).click();

	// Write code here that turns the phrase above into concrete actions
  
}

 

}*/
