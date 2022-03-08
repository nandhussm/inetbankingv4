package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

		public LoginPage(WebDriver driver ) {
			PageFactory.initElements(driver, this);
		}
		@FindBy(id="loginusername")
		private WebElement UsernameText;
		
		@FindBy(id="loginpassword")
		private WebElement PasswordText;
		
		@FindBy(xpath="//button[text()='Log in']")
		private WebElement LoginButton;
		
		@FindBy(xpath="//ancestor::div[@class='modal fade show']/descendant::button[text()='Close' and @class='btn btn-secondary']")
		private WebElement CloseButton;

		public WebElement getUsernameText() {
			return UsernameText;
		}

		public WebElement getPasswordText() {
			return PasswordText;
		}

		public WebElement getLoginButton() {
			return LoginButton;
		}

		public WebElement getCloseButton() {
			return CloseButton;
		}
}
