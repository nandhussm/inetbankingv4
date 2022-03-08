package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	WebDriver driver;
	public SignUpPage(WebDriver driver) {
	this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="sign-username")
	private WebElement UsernameText;
	
	@FindBy(id="sign-password")
	private WebElement PasswordText;
	
	@FindBy(xpath="//button[contains(text(),'Sign up')]")
	private WebElement  SignButton;
	
	@FindBy(xpath="//ancestor::div[@class='modal fade show']/descendant::button[text()='Close' and @class='btn btn-secondary']")
	private WebElement CloseButton;
	
	public WebElement getSingUpText() {
		return UsernameText;
	}

	public WebElement getPasswordText() {
		return PasswordText;
	}

	public WebElement getSignButton() {
		return SignButton;
	}

	public WebElement getCloseButton() {
		return CloseButton;
	}

	public void signUpPage(String username,String Password) {
		UsernameText.sendKeys(username);
		PasswordText.sendKeys(Password);
		SignButton.click();
		
	}
}
