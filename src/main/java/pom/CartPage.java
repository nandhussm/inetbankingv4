package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

		public CartPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		@FindBy(linkText="Place Order")
		private WebElement PlaceOrderBtn;
		
		public WebElement getPlaceOrderBtn() {
			return PlaceOrderBtn;
		}
		
		public void cartPage() {
			PlaceOrderBtn.click();
		}
}
