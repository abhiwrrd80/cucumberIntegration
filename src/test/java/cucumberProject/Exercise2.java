package cucumberProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Exercise2 {
  public WebDriver driver;
	
	

	



	@Given("user logsin the app")
	public void user_logsin_the_app() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.05.01\\Desktop\\JAVA\\Day 3\\testMaven\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		 
		 Actions actions=new Actions(driver);
		 WebElement login=driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[1]/a"));
		 actions.moveToElement(login).click().perform();
		 WebElement uname=driver.findElement(By.xpath("//*[@id='userName']"));
			actions.sendKeys(uname,"lalitha").perform();
			WebElement pass=driver.findElement(By.xpath("//*[@id='password']"));
			 actions.sendKeys(pass,"password123").perform();
			 WebElement enterLogIn = driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]"));
			 actions.click(enterLogIn).perform();

	}

	@When("user searches for {string}")
	public void user_searches_for(String item) {
		driver.findElement(By.xpath("//*[@id='myInput']")).sendKeys(item);
		 driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}
	@Then("user logs out")
	public void user_logs_out() {
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/a")).click();
		driver.close();
	   
	}


}
