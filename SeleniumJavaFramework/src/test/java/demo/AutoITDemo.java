package demo;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo {
	public static void main(String[] args) throws Exception {
		test();
	}
public static void test() throws Exception {
System.setProperty("webdriver.chrome.driver", "F:\\Projects\\Eclipse\\SeleniumJavaFramework\\drivers\\chromedriver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://tinyupload.com/");
driver.findElement(By.name("uploaded_file")).click();
Runtime.getRuntime().exec("C:\\Users\\Sangeeta\\Desktop\\2020_Share\\FileUploadScript.exe");
Thread.sleep(3000);
//driver.close();
}
}
