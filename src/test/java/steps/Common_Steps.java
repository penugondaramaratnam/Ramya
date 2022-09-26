package steps;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Common_Steps {
	
	private WebDriver driver;
	//this common step class is common for project browser invoking and tear down
	//@before hook it will execute every secnario before
	//order means if we have two befores in project it will say which to exceute first
	//mostly before hook is used to setup and tear down the browser
	
	@Before(order = 0)
	public void setUp() {
		// System.setProperty("webdriver.chrome.driver", "C:\\Users\\rama.r\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		 System.out.println("Global Before Hook Executed");
	}
	//@after hook it will execute every secnario before
	//here i have added the screenshot code to take screen shot for failure cases
	
	@After(order = 1)
	public void tearDown(Scenario scenario) throws Exception {
		if(scenario.isFailed()) {
			//Take Screenshot
			final byte[] shot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			//Embed into Report
			scenario.attach(shot, "image/png", scenario.getName());
		}
		driver.quit();
		Thread.sleep(1000);
		System.out.println("Global After Hook Executed");
	}
	
	public WebDriver getDriver() {
		return driver;
	}
}