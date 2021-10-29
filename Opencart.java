

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;
	public class Opencart {
	

		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.opencart.com/index.php?route=account/register");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.id("input-username")).sendKeys("sam");
			driver.findElement(By.id("input-firstname")).sendKeys("samu");
			driver.findElement(By.id("input-lastname")).sendKeys("phoebe");
			driver.findElement(By.id("input-email")).sendKeys("samuelsiva1998@gmail.com");
			WebElement option1 = driver.findElement(By.id("input-country"));
			Select dropDown1 = new Select(option1);
			dropDown1.selectByIndex(99);
			driver.findElement(By.id("input-password")).sendKeys("878787");
			

		}

}
