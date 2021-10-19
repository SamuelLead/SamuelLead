import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class saleforce {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		WebElement ele2=driver.findElement(By.name("UserTitle"));
		Select dro=new Select (ele2);
		dro.selectByVisibleText("Sales Manager");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement obj1=driver.findElement(By.name("UserFirstName"));
		obj1.sendKeys("sam");
		WebElement obj2=driver.findElement(By.name("UserLastName"));
		obj2.sendKeys("raj");
		WebElement obj3=driver.findElement(By.name("UserEmail"));
		obj3.sendKeys("samraj26@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("phoebe");
		WebElement ele3=driver.findElement(By.name("CompanyEmployees"));
		Select drop=new Select (ele3);
		drop.selectByVisibleText("1 - 15 employees");
		driver.findElement(By.name("UserPhone")).sendKeys("9894379876");
		driver.findElement(By.className ("checkbox-ui")).click();
		driver.close();
		
		
	}
	}


