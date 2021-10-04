package com.Baseclass.org;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_class {

	public static WebDriver driver;

	public static WebDriver BrowserLaunch(String browser) throws Exception {
		try {
			if (browser.equalsIgnoreCase("Chrome")) {

				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\admin\\eclipse-workspace\\AdactinProject_cucumber\\driverfolder\\chromedriver.exe");
				driver = new ChromeDriver();

			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\admin\\eclipse-workspace\\MiniprojectAutomationPractice\\ Driver2\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
		} catch (Exception e) {
			throw new Exception("Invalid");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;

	}

	public static void LaunchtheBrowser(String url) {
		driver.get(url);
	}

	public static void ClosetheWebpage(WebDriver driver) {

		driver.close();
	}

	public static void ClosetheBrowser(WebDriver driver) {
		driver.quit();
	}

	public static void MoveToPage(WebDriver driver, String url) {
		driver.navigate().to(url);

	}

	public static void BackToWebPage(WebDriver driver) {
		driver.navigate().back();
	}

	public static void MoveToForwardPage(WebDriver driver) {
		driver.navigate().forward();
	}

	public static void RefreshPage(WebDriver driver) {
		driver.navigate().refresh();
	}

	public static void AcceptTheAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	public static void DismissTheAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	public static void TextOFAlert(WebDriver driver) {
		driver.switchTo().alert().getText();

	}

	public static void InputAlertData(WebDriver driver, String txt) {
		driver.switchTo().alert().sendKeys(txt);
	}

	public static void ClickElement(WebDriver driver, WebElement e ){
		Actions a = new Actions(driver);
		a.click(e).build().perform();

	}

	public static void RightClickElement(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.contextClick(ele).build().perform();
	}

	public static void DoubleClickElement(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.doubleClick(ele).build().perform();
	}

	public static void DragAndDropElement(WebDriver driver, WebElement Ele, WebElement e) {
		Actions a = new Actions(driver);
		a.dragAndDrop(Ele, e).build().perform();
	}

	public static void MouseOverElement(WebDriver driver, WebElement ele) {
		
		try {
			Actions a = new Actions(driver);
			a.moveToElement(ele).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void ButtonPress() throws Throwable {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void EnterIntoFrame(WebDriver driver, WebElement e) {
		driver.switchTo().frame(e);

	}

	public static void ExitFromFrame(WebDriver dri) {
		dri.switchTo().defaultContent();

	}

	public static void MoveToParentFrame(WebDriver dri, int index) {
		dri.switchTo().parentFrame();
	}

	public static void GetWindowTitle(WebDriver dri, String st) {
		String windowHandle = dri.getWindowHandle();
		System.out.println(windowHandle);
	}

	public static void GetAllWindowTitles(WebDriver dri, String str) {
		Set<String> windowHandles = dri.getWindowHandles();
		for (String st : windowHandles) {
			System.out.println(st);

		}
	}

	public static void inputdata(WebElement e, String st) {
		e.sendKeys(st);
	}

	public static void clickOnElement(WebElement e) {
		e.click();
	}

	public static void clearText(WebElement e) {
		e.clear();
	}

	public static void cssValueOfElement(WebElement e, String st) {
		e.getCssValue(st);

	}

	public static void TextOfElement(WebElement e, String st) {
		e.getText();

	}

	public static void AttributeOfElement(WebElement e, String st) {
		e.getAttribute(st);
	}

	public static void TagNameOfElement(WebElement e, String st) {
		e.getTagName();

	}

	public static void LocationOfElement(WebElement e) {
		e.getLocation();

	}

	public static void SizeOfElement(WebElement e) {
		e.getSize();

	}

	public static void ElementDisplayed(WebElement e) {
		e.isDisplayed();
	}

	public static void ElementEnabled(WebElement e) {
		e.isEnabled();

	}

	public static void ElementSelected(WebElement e) {
		e.isSelected();

	}

	public static void multipleDropdown(WebElement e) {

		Select s = new Select(e);
		s.isMultiple();
	}

	public static void SelectByIndex(WebElement e, int index) {
		Select s = new Select(e);
		s.selectByIndex(index);
	}

	public static void SelectByValue(WebElement e, String i) {
		Select s = new Select(e);
		s.selectByValue(i);

	}

	public static void SelectByVisibleText(WebElement e, String txt) {
		Select s = new Select(e);
		s.selectByVisibleText(txt);
	}

	public static void AllSelectedOptions(WebElement e) {
		Select s = new Select(e);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement we : allSelectedOptions) {
			String text = we.getText();
			System.out.println(text);
		}

	}

	public static void FirstSelectedOption(WebElement e) {
		Select s = new Select(e);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption);

	}

	public static void DeselectAlloptions(WebElement e) {
		Select s = new Select(e);
		s.deselectAll();
	}

	public static void DeselectByIndex(WebElement e, int index) {
		Select s = new Select(e);
		s.deselectByIndex(index);

	}

	public static void DeselectByValue(WebElement e, String val) {
		Select s = new Select(e);
		s.deselectByValue(val);
	}

	public static void ScreenshotOfPage(WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\admin\\eclipse-workspace\\AdactinProject_cucumber\\Screenshot\\hotelApp.png");
		FileUtils.copyFile(screenshotAs, dest);
	}

	public static void WaitImplicitly(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public static void WaitExplicitly(WebDriver driver, WebElement e) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(e));
	}

	public static void ScrollDownFunction(WebDriver dri) {
		JavascriptExecutor js = (JavascriptExecutor) dri;
		js.executeScript("window.scroll(0,800)", "");
	}

	public static void ScrollTOElement(WebDriver dri, WebElement e) {
		JavascriptExecutor j = (JavascriptExecutor) dri;
		j.executeScript("arguments[0].scrollIntoView(true)", e);
	}

	public static void ScrollUPFunction(WebDriver dri) {
		JavascriptExecutor j = (JavascriptExecutor) dri;
		j.executeScript("window.scroll(0,0)", "");
	}

	public static void MultipleDropdownOptions(WebElement e, String str) {
		Select s = new Select(e);
		List<WebElement> options = s.getOptions();
		for (WebElement webElement : options) {
			String text = webElement.getText();
			System.out.println(text);
		}

		int size = options.size();
		System.out.println(size);

		for (int i = 0; i < size; i++) {
			s.selectByIndex(i);
		}

	}
}
