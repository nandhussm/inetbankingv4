package genericUtility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebDriverUtility {

		/**@author Nandhu
		 * This method wait for 20 sec  for page loading
		 *@param driver
		 */

		public void waitUntilPageLoad(WebDriver driver) {
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		}
		/**
		 * This method wait for the element to be visible
		 * @param driver
		 * @param element
		 */
		public void waitForElementVisibility(WebDriver driver, WebElement elemnet) {
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOf(elemnet));
		}
		/**
		 * This method wait for the element to be clicked
		 * @param element
		 * @throws InterruptedException 
		 * @throws throwable
		 * 
		 */
		public void wiatAndClick(WebElement element) throws InterruptedException {
			int count =0;
			while(count<40) {
				try {
					element.click();
					break;
				}
				catch(Throwable e)
				{
					Thread.sleep(3000);
					count++;

				}

			}
		}
		/**
		 * This method will perform mouse over action
		 * @param driver
		 * @param elemnet
		 */
		public void mouseOver(WebDriver driver, WebElement elemnet) {
			Actions act= new Actions(driver);
			act.moveToElement(elemnet).perform();
		}
		/**
		 * This method will perform right click operation
		 * @param driver
		 * @param element
		 */
		public void rightClick(WebDriver driver, WebElement element) {
			Actions act = new Actions(driver);
			act.contextClick(element).perform();
		}
		/**
		 * 
		 * This method helps to switch from one window to another
		 * @param driver
		 * @param partialWinTitle
		 * @return 
		 */
		public void  switchToWindow(WebDriver driver,String partialWindowTitle) {
			Set<String> set = driver.getWindowHandles();
			Iterator<String> it = set.iterator();
			while(it.hasNext()) {
				String wid = it.next();
				driver.switchTo().window(wid);
				String currentWindowTitle = driver.getTitle();
				if(currentWindowTitle.contains("partialWindowTitle")) {
					break;
				}
			}
		}m1998-
		/**
		 * Accept alert
		 * @param driver
		 * 
		 * 
		 */
		
		public void acceptAlert(WebDriver driver) {
			driver.switchTo().alert().accept();
		}
		/**
		 * Accept cancel
		 * @param driver
		 */
		public void cancelAlert(WebDriver driver) {
			driver.switchTo().alert().dismiss();
		}
		/**
		 * This method used for scrolling action in a webpage
		 * @param driver
		 * @param element
		 */
		public void scroolToWebElement(WebDriver driver, WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			int y=element.getLocation().getY();
			js.executeScript("window.scrollBy(0,"+y+")", element);
		}
		public void switchFrame(WebDriver driver, int index) {
			driver.switchTo().frame(index);
		}
		public void switchFrame(WebDriver driver, WebElement element) {
			driver.switchTo().frame(element);
		}
		public void switchFrame(WebDriver driver, String idOrName) {
	 		driver.switchTo().frame(idOrName)	;
		}
		
		public String takeScreenShot(WebDriver driver, String screenshotName) throws Throwable {
			String screenshotPath="./screenshot/"+screenshotName+".PNG";
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(screenshotPath);
			Files.copy(src, dest);
			return screenshotPath;
		}
		public void pressEnterKey() throws AWTException {
			Robot rc = new Robot();
			rc.keyPress(KeyEvent.VK_ENTER);
			
			rc.keyRelease(KeyEvent.VK_ENTER);
		}

	}

