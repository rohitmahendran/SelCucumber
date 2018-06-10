
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{
	
	public MyLeads() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleCreateLeads;
	
	public CreateLead clickCreateLead() {
		click(eleCreateLeads);
		return new CreateLead();
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	
	
	
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleCreateLead;
	

	
	
	
	
	

}
