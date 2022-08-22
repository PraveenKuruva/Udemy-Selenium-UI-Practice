import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		//Invoking Browser

		//Chrome - ChromeDriver exten->Methods close get

		//Firefox- FirefoxDriver ->methods close get

		// WebDriver  close  get

		//WebDriver methods + class methods

		// Chrome

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prave\\OneDrive\\Documents\\Praveen\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();



		//Firefox

//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ext06629\\Documents\\Praveen\\TechM-Selenium-Course\\Driver\\geckodriver.exe");
//
//		WebDriver driver = new FirefoxDriver();

		//Microsoft Edge

//		System.setProperty("webdriver.edge.driver", "C:\\Users\\prave\\Documents\\Praveen\\Driver\\msedgedriver.exe");
//
//		WebDriver driver = new EdgeDriver();

		driver.get("https://rahulshettyacademy.com");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		driver.close();

		//driver.quit();


		
	}

}
