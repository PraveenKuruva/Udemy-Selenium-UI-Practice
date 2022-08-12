import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WIndowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ext06629\\Documents\\Praveen\\TechM-Selenium-Course\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");

		driver.findElement(By.cssSelector(".blinkingText")).click();

		Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]

		Iterator<String>it = windows.iterator();

		String parentId = it.next();

		String childId = it.next();

		driver.switchTo().window(childId);

		//System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		
		//li[text()=' contact@rahulshettyacademy.com']
		System.out.println(driver.findElement(By.xpath("//li[text()=' contact@rahulshettyacademy.com']")).getText());

		//driver.findElement(By.cssSelector(".im-para.red")).getText();
		driver.findElement(By.xpath("//li[text()=' contact@rahulshettyacademy.com']")).getText();

		//String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		String emailId = driver.findElement(By.xpath("//li[text()=' contact@rahulshettyacademy.com']")).getText().trim();
		
		driver.switchTo().window(parentId);

		driver.findElement(By.id("username")).sendKeys(emailId);
		
	}

}
