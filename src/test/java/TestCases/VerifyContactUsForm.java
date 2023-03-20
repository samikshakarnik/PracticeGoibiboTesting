package TestCases;

import PageObjectModel.ContactUsForm;
import Resources.BaseClass;

public class VerifyContactUsForm extends BaseClass{
	
	public void contactUsForm() {
		
		ContactUsForm obj = new ContactUsForm(driver);
		obj.contactUs().click();
		obj.name().sendKeys("Suman Kulkarni");
		obj.email().sendKeys("sumanKulkarni@gmail.com");
		obj.enquiry().sendKeys("When will the Product will be Delivered?");
		obj.submitBT().click();	
	}

}
