package SearchingFor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NBAChampionsSearch {
	
	WebDriver driver = null;

	@Given("Open google home page")
	public void open_google_home_page() {
		System.out.println("First Step .. User is on indeed home page");
		
		System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver"); // location of chromedriver

		driver = new ChromeDriver(); // instantiating Chrome driver

		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@When("^navigate wikipedia page$")
	public void navigate_wikipedia_page1() throws Throwable {
	

	driver.get("https://www.google.com"); // opening indeed.com
	
	//*[@id="twotabsearchtextbox"]
	/*
	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("pioneer double din radio"); // Will send job search to input field
	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(Keys.RETURN); // Will send job search to input field
	//driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_3\"]")).click(); // Will send job search to input field
	Thread.sleep(5000);
	//driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
	Thread.sleep(5000);
	//driver.findElement(By.xpath("//*[@id=\"p_72/1248879011\"]/span/a/section/span")).click();
*/
	}
	
	@Then("^navigate wikipedia page")
	public void navigate_wikipedia_page() throws Throwable {
	
/*
	Thread.sleep(5000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1700)", "");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"p_n_feature_twelve_browse-bin/38235617011\"]/span/a/div/label/i")).click(); 
	driver.findElement(By.xpath("//*[@id=\"p_n_feature_twelve_browse-bin/38235623011\"]/span/a/div/label/i")).click();
*/
	}
/*	
	@Then("^refine search by price")
	public void refine_search_by_price() throws Throwable {
/*	

	Thread.sleep(5000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,650)", "");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"low-price\"]")).sendKeys("250"); 
	driver.findElement(By.xpath("//*[@id=\"high-price\"]")).sendKeys("325"); 
	Thread.sleep(5000);
	System.out.println("before go");
	driver.findElement(By.xpath("//*[@id=\"a-autoid-1\"]/span/input")).click(); 
	System.out.println("after go");
*/	
//	}

	



}


