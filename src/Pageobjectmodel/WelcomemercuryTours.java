package Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomemercuryTours {
public Menu menu=null;
public WelcomemercuryTours(WebDriver driver)
{
	menu=PageFactory.initElements(driver, Menu.class);
}

@FindBy(name="userName")
WebElement userName;
@FindBy(name="password")
WebElement Password;
@FindBy(name="login")
WebElement Signin;
public void findAflight(String u,String p)
{
	userName.sendKeys(u);
	Password.sendKeys(p);
    Signin.click();
    
}

@FindBy(linkText="your destination")
WebElement destinations;
public void destinations()
{
	destinations.click();
}

@FindBy(linkText="featured vacation destinations")
WebElement vacations;
public void vacations()
{
	vacations.click();
}

@FindBy(linkText="Register here")
WebElement register;
public void register()
{
	register.click();
}





}
