package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	 public class PlaceorderPage {

			public PlaceorderPage(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}
			
			@FindBy(id="name")
		    private WebElement NameTextBox;
			
			@FindBy(id="country")
			private WebElement CountryTextBox;
			
			@FindBy(id="city")
			private WebElement CityTextBox;
			
			@FindBy(id="card")
			private WebElement CreditcardTextBox;
			
			@FindBy(id="month")
			private WebElement MonthTextBox;
			
			@FindBy(id="year")
			private WebElement YearTextBox;
			
			@FindBy(linkText="Purchase")
			private WebElement PurchaseBtn;
			
			@FindBy(xpath="//ancestor::div[@class='modal fade show']/descendant::button[text()='Close']")
			private WebElement CloseBtn;

			public WebElement getNameTextBox() {
				return NameTextBox;
			}

			public WebElement getCountryTextBox() {
				return CountryTextBox;
			}

			public WebElement getCityTextBox() {
				return CityTextBox;
			}

			
			public WebElement getCreditcardTextBox() {
				return CreditcardTextBox;
			}

			public WebElement getMonthTextBox() {
				return MonthTextBox;
			}

			public WebElement getYearTextBox() {
				return YearTextBox;
			}

			public WebElement getPurchaseBtn() {
				return PurchaseBtn;
			}

			public WebElement getCloseBtn() {
				return CloseBtn;
			}
			public void PlaceorderPage(String Name,String Country, String Creditcard, String Month, String Year) {
				NameTextBox.sendKeys(Name);
				CountryTextBox.sendKeys(Country);
				CreditcardTextBox.sendKeys(Creditcard);
				MonthTextBox.sendKeys(Month);
				YearTextBox.sendKeys(Year);
				PurchaseBtn.click();
			}
		}


