import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ext06629\\Documents\\Praveen\\TechM-Selenium-Course\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// driver.get("https://the-internet.herokuapp.com/nested_frames");
		// System.out.println(driver.findElements(By.tagName("frame")).size());
		//
		//
		// //frameset[@name='frameset-middle']
		// driver.switchTo().frame(driver.findElement(By.xpath("//frameset[@name='frameset-middle']")));
		// driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
		// System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());

		driver.get("http://the-internet.herokuapp.com/");

		driver.findElement(By.linkText("Nested Frames")).click();

		driver.switchTo().frame("frame-top");

		driver.switchTo().frame("frame-middle");

		System.out.println(driver.findElement(By.id("content")).getText());

	}

}
