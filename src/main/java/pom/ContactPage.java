package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	 public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="recipient-email")
	private WebElement ContactEmailText;
	
	@FindBy(id="recipient-name")
	private WebElement ContactNameText;
	
	@FindBy(id="message-text")
	private WebElement ContactMessageText;
	
	@FindBy(linkText="//button[text()='Send message']")
	private WebElement SendMessageBtn;
	
	@FindBy(xpath="//ancestor::div[@class='modal fade show']/descendant::button[text()='Close' and @class='btn btn-secondary']")
	private WebElement CloseBtn;

	public WebElement getContactEmailText() {
		return ContactEmailText;
	}

	public WebElement getContactNameText() {
		return ContactNameText;
	}

	public WebElement getContactMessageText() {
		return ContactMessageText;
	}

	public WebElement getSendMessageBtn() {
		return SendMessageBtn;
	}

	public WebElement getCloseBtn() {
		return CloseBtn;
	}
	public void contactPage(String Email, String ContactName, String ContactMessage) {
		ContactEmailText.sendKeys(Email);
		ContactNameText.sendKeys(ContactName);
		SendMessageBtn.sendKeys(ContactMessage);
		SendMessageBtn.click();
		
	}
} 