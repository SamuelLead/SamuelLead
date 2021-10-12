import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebok {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	driver.findElement(By.linkText("Create New Account")).click();
	
	WebElement obj3=driver.findElement(By.name("firstname"));
	obj3.sendKeys("sam");
	WebElement obj4=driver.findElement(By.name("lastname"));
	obj4.sendKeys("phoebe");
	WebElement obj5=driver.findElement(By.name("reg_email__"));
	obj5.sendKeys("sam@gmail.com");
	WebElement obj6=driver.findElement(By.name("reg_email_confirmation__"));
	obj6.sendKeys("sam@gmail.com");
	WebElement obj7=driver.findElement(By.id("password_step_input"));
	obj7.sendKeys("umeshbeni");
	WebElement ele=driver.findElement(By.id("day"));
	ele.sendKeys("15");
	WebElement ele2=driver.findElement(By.id("month"));
	ele2.sendKeys("jul");
	
	WebElement ele3=driver.findElement(By.id("year"));
	ele3.sendKeys("1998");
	
	WebElement obj2=driver.findElement(By.name("sex"));
	obj2.click();
	
}
}

