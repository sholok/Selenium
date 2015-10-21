package Pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class RegisterMercuryTours2 {
	@FindBy(xpath="html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")
	WebElement text;
	public boolean validateRegistration(String expText)
	{
		if(text.getText().contains(expText))
		{
			return true;
		}
		else
		{
			return false;
		}
	}


}
