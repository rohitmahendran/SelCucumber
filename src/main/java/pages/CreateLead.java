
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	
	public CreateLead() {		
		PageFactory.initElements(driver,this);
	}	
	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	@And("Enter the Company Name as (.*)")
	public CreateLead enterCompanyName(String data) {
		type(eleCompanyName, data);
		return this;
	} 
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	
	@And("Enter the First Name as (.*)")
	public CreateLead enterFirstName(String data) {
		type(eleFirstName, data);
		return this;
	} 
	
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	
	@And("Enter the Last Name as (.*)")
	public CreateLead enterLasttName(String data) {
		type(eleLastName, data);
		return this;
	} 
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleCreateLead;
	
	@When("Click on Create Lead tab")
	public ViewLead ClickCreateLead() {
		click(eleCreateLead);
		return new ViewLead();
	}
	
	

	
	
	
	
	

}
