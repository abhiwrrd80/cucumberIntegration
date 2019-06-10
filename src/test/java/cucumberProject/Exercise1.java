package cucumberProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.drivers.Drivers;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Exercise1 {
	public WebDriver driver;
	@Given("user opens testmeapp")
	public void user_opens_testmeapp() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.05.01\\Desktop\\JAVA\\Day 3\\testMaven\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		 
		 Actions actions=new Actions(driver);
		 WebElement login=driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[1]/a"));
		 actions.moveToElement(login).click().perform();
	    
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String un) {
		
		Actions actions=new Actions(driver);
		WebElement uname=driver.findElement(By.xpath("//*[@id='userName']"));
		actions.sendKeys(uname,un).perform();
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String pswd) {
		
		WebElement pass=driver.findElement(By.xpath("//*[@id='password']"));
		 Actions actions=new Actions(driver);
		 actions.sendKeys(pass,pswd).perform();
	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
		 
		 Actions actions=new Actions(driver);
		 WebElement enterLogIn = driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]"));
		 actions.click(enterLogIn).perform();
	}

	@When("verify login success")
	public void verify_login_success() {
		 
		 
	}

	@Then("close testmeapp")
	public void close_testmeapp() {
		
		 driver.close();
	}



}
