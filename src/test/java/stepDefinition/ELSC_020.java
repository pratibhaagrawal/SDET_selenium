package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ELSC_020 {
	public WebDriver driver;
	//WebDriverWait wait = new WebDriverWait(driver,15);
	@Given("User should launched the application")
	public void user_should_launched_the_application() {
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://elearning.upskills.in/");

	}

	@When("User should login with admin credential as {string} and {string}")
	public void user_should_login_with_admin_credential_as_and(String username, String password) {
		driver.findElement(By.id("login")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("form-login_submitAuth")).click();

	}
	@When("Click on Administration tab")
	public void click_on_administration_tab() {
		//driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[1]/li[7]/a")).click();
		driver.findElement(By.linkText("Administration")).click();

	}

	@When("click on Careers and promotions link")
	public void click_on_careers_and_promotions_link() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");	
		driver.findElement(By.linkText("Careers and promotions")).click();

	}

	@When("click on careers icon")
	public void click_on_careers_icon() {
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class=\"col-sm-12\"]/a[2]")));
		driver.findElement(By.xpath("//*[@class=\"col-sm-12\"]/a[2]")).click();

	}

	@When("click on Add icon")
	public void click_on_add_icon() {
		//wait.until(ExpectedConditions.visibilityOfElementLocated(null));
		driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/div[2]/a[2]")).click();

	}

	@When("enter valid credentials in Name textbox")
	public void enter_valid_credentials_in_name_textbox() {
		driver.findElement(By.id("career_name")).sendKeys("ABCDEF");
	}

	@When("Click on Add button")
	public void click_on_add_button() {
		driver.findElement(By.id("career_submit")).click();
	}

	@When("click on Promotions icon")
	public void click_on_promotions_icon() {
		driver.findElement(By.xpath("/html/body/main/section/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/div[1]/div/div/a[3]/img")).click();
		driver.findElement(By.xpath("/html/body/main/section/div/div[2]/a[2]/img")).click();

	}
	
	@When("enter valid promotion credentials in Name textbox")
	public void enter_valid_promotion_credentials_in_name_textbox() {
		driver.findElement(By.id("name")).sendKeys("QAforTester");
	}
	
	@When("Click on the Add button")
	public void click_on_the_add_button() {
		driver.findElement(By.id("promotion_submit")).click();
	}

	@When("click on subscribe sessions to promotion icon")
	public void click_on_subscribe_sessions_to_promotion_icon() {
		driver.findElement(By.xpath("/html/body/main/section/div/div[4]/div[3]/div[3]/div/table/tbody/tr[2]/td[4]/a[1]/img")).click();


	}

	@When("select session in Sessions not subscribed  window")
	public void select_session_in_sessions_not_subscribed_window() {
		Select objSelect =new Select(driver.findElement(By.id("session_not_in_promotion")));
		objSelect.selectByVisibleText("QAforTester");
	}

	@When("click on arrow")
	public void click_on_arrow() {
		driver.findElement(By.xpath("/html/body/main/section/div/form/table/tbody/tr[3]/td[2]/button[1]")).click();
	}

	@When("click on subscribe sessions in promotion window button")
	public void click_on_subscribe_sessions_in_promotion_window_button() {
		driver.findElement(By.xpath("/html/body/main/section/div/form/table/tbody/tr[4]/td/button")).click();
	}

	@Then("session should get added into promotion")
	public void session_should_get_added_into_promotion() {
		System.out.println("DONE"); 
		driver.quit();
	}


}
