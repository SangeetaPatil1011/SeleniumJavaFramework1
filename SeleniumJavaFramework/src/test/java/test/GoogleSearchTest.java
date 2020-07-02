package test;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import pages.GoogleSearchPage;

public class GoogleSearchTest {
	static WebDriver driver = null;
public static void main(String[] args) {
	googleSearch();
}
public static void googleSearch()
{
	String projectPath = System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver.exe");
	 driver = new ChromeDriver();
	
	// go to google.com
	driver.get("https://google.com");
	
	//enter text in search textbox
	//driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
	GoogleSearchPage.textbox_search(driver).sendKeys("Autoamtion Step by Step");
	
	//click on search button 
	//driver.findElement(By.name("btnK")).click();
	//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	
	GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
    driver.close();
	System.out.println("Test Completed Successfully");
}
}

