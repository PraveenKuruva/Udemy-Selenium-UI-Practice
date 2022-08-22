import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment_UI_All {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prave\\OneDrive\\Documents\\Praveen\\Driver\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();

		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		Thread.sleep(2000L);

		driver.findElement(By.name("name")).sendKeys("rahul");

		driver.findElement(By.name("email")).sendKeys("hello@abc.com");

		driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");

		driver.findElement(By.id("exampleCheck1")).click();

		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));

		Select abc = new Select(dropdown);

		abc.selectByVisibleText("Female");

		driver.findElement(By.id("inlineRadio1")).click();

		driver.findElement(By.name("bday")).sendKeys("02/02/1992");

		driver.findElement(By.cssSelector(".btn-success")).click();

		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		driver.close();
		
		
		//--------------------------------------------------------
//		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
//
//		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
//
//		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
//
//		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
//
//		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
//
//		{
//
//		System.out.println("its enabled");
//
//		Assert.assertTrue(true);
//
//		}
//
//		else
//
//		{
//
//		Assert.assertTrue(false);
//
//		}

	}

}
