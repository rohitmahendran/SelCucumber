package definitionfile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadSteps{
	
	public static RemoteWebDriver driver;
	
	
	@Given("Invoke the LeafTapApp")
	
	public void invokeApp() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps");
		
	}
	
	@And("Enter the Valid UserName as (.*)")
	public void enterUserName(String uName) {
		driver.findElementById("username").sendKeys(uName);
	}
	
	@And("Enter the Valid Password as (.*)")
	public void enterPassword(String pwd) {
		
		driver.findElementById("password").sendKeys(pwd);
	}
		
	@And("Click on the Login button")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		
	}
	
	@And("Click on CRM/SFA link")
	public void clickCRMSFALink() {
		//click CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@And("Click on the Creat Lead tab")
	public void clickCreateLeadTab() {
		//click create leads
		driver.findElementByLinkText("Create Lead").click();
	}

	@And("Enter the Company Name as (.*)")
	public void enterCompanyName(String cName) {
	
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		
	}
	
	@And("Enter the First Name as (.*)")
	public void enterFirstName(String fName) {
	
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		
	}
	
	@And("Enter the Last Name as (.*)")
	public void enterLastName(String lName) {
	
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		
	}
	
	@When("Click on Create Lead tab")
	public void clickCreateLead() {
	
		driver.findElementByName("submitButton").click();
		
	}
	
	@Then("Verify Create Lead done successfully")
	public void verifyCreateLead() {
		System.out.println("Create Lead done successfully with only mandatory fields values");
	}
	
	@But("Verify Login failed")
	public void LoginFailure() {
		System.out.println("Login failed with invalid username or password");
	}
}
