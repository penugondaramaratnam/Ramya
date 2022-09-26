package elements;

import org.openqa.selenium.WebDriver;
//All the web elements in the ebayhomeadvance search is placed here this repositray of the ebay home page
//by creating object of this class we can use this repositary
//we have created parameterised constructor to use thes repositary
//we have to import this page where we want to use this class elemnts
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EabyAdvancedSearch_Elements {
	
	WebDriver driver;
	
	@FindBy(xpath = "//a[@id='gh-la']") public WebElement ebayLogo;
	@FindBy(xpath = "//input[@id='_nkw']") public WebElement searchString;
	@FindBy(xpath = "//input[@id='_ex_kw']") public WebElement excludeString;
	@FindBy(xpath = "//input[@name='_udlo']") public WebElement minPrice;
	@FindBy(xpath = "//input[@name='_udhi']") public WebElement maxPrice;
	@FindBy(xpath = "//button[@id='searchBtnLowerLnk']") public WebElement srchBtn;
	
	public EabyAdvancedSearch_Elements(WebDriver driver)//parameterisd constructor
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}

