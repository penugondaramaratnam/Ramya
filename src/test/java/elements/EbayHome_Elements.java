package elements;

//All the web elements in the ebayhome is placed here this repositray of the ebay home page
//by creating object of this class we can use this repositary
//we have created parameterised constructor to use thes repositary
//we have to import this page where we want to use this class elemnts

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayHome_Elements {
	
	WebDriver driver;

	@FindBy(linkText = "Advanced") public WebElement advancedLink;
	@FindBy(xpath = "//input[@id='gh-ac']") public WebElement searchBox;
	@FindBy(xpath = "//input[@id='gh-btn']") public WebElement searchButton;
	@FindBy(css = "h1.srp-controls__count-heading>span.BOLD:first-child") public WebElement numOfItems;
	@FindBy(xpath = "//select[@id='gh-cat']/option']") public List<WebElement> catOptions;
	
	public EbayHome_Elements(WebDriver driver)//parameterised constructor
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
