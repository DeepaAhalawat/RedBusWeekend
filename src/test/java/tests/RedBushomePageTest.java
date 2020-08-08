package tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class RedBushomePageTest {
	
	@Test
	public void bookTicketForRedBus() {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver_windows.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
		
		
		//From
		driver.findElement(By.cssSelector("input#src")).sendKeys("Kash");
		List<WebElement> allOptions = driver.findElements(By.cssSelector("ul.autoFill>li"));
		
		
		
		for(WebElement e: allOptions) {
			if(e.getText().contains("Kashmiri Gate")) {
				e.click();
				break;
			}
		}
		
		
		
		
	}

}
