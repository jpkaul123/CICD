import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jsexcute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://manage.qa2.dotbricks.net/adminp");
		
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("login_username")).sendKeys("jaiprakash@racknap.com");
		driver.findElement(By.id("login_password")).sendKeys("abcd1234");
		driver.findElement(By.id("kt_login_signin_submit_form")).click();
		Thread.sleep(2000);
		driver.get("https://manage.qa2.dotbricks.net/adminp/orders/orders-list");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		
	List<WebElement> values = driver.findElements(By.cssSelector("tr:nth-child(2) > td:nth-child(3)"));
	
	for (int i=0;i<=values.size();i++) {
		
		System.out.print(Integer.parseInt(values.get(i).getText().split("-")[1].trim()));
	}
//		js.executeScript("document.querySelector('.thead-light').scrollTop=500");
	}

}
