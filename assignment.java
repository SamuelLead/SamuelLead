import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	
	WebElement obj=driver.findElement(By.id("username"));
	obj.sendKeys("Demosalesmanager");
	WebElement obj1=driver.findElement(By.id("password"));
	obj1.sendKeys("crmsfa");
	WebElement obj2=driver.findElement(By.className("decorativeSubmit"));
	obj2.click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	
	WebElement obj3=driver.findElement(By.id("createLeadForm_companyName"));
	obj3.sendKeys("phoebe");
	WebElement obj4=driver.findElement(By.id("createLeadForm_firstName"));
	obj4.sendKeys("sam");
	WebElement obj5=driver.findElement(By.id("createLeadForm_lastName"));
	obj5.sendKeys("raj");
	WebElement obj6=driver.findElement(By.id("createLeadForm_firstNameLocal"));
	obj6.sendKeys("beni");
	WebElement obj7=driver.findElement(By.id("createLeadForm_lastNameLocal"));
	obj7.sendKeys("umesh");
	WebElement obj8=driver.findElement(By.id("createLeadForm_personalTitle"));
	obj8.sendKeys("siva");
	WebElement obj9=driver.findElement(By.id("createLeadForm_departmentName"));
	obj9.sendKeys("arul");
	WebElement obj10=driver.findElement(By.id("createLeadForm_annualRevenue"));
	obj10.sendKeys("10000000");
	WebElement obj11=driver.findElement(By.id("createLeadForm_birthDate"));
	obj11.sendKeys("07/26/1998");
	WebElement obj12=driver.findElement(By.id("createLeadForm_numberEmployees"));
	obj12.sendKeys("214");
	WebElement obj13=driver.findElement(By.id("createLeadForm_sicCode"));
	obj13.sendKeys("607303");
	
	
	WebElement obj16=driver.findElement(By.id("createLeadForm_tickerSymbol"));
	obj16.sendKeys("yes");
	WebElement obj14=driver.findElement(By.id("createLeadForm_description"));
	obj14.sendKeys("samuel");
	WebElement obj15=driver.findElement(By.id("createLeadForm_importantNote"));
	obj15.sendKeys("usha");
	WebElement obj17=driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
	obj17.sendKeys("91");
	WebElement obj18=driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode"));
	obj18.sendKeys("807");
	WebElement obj32=driver.findElement(By.id("createLeadForm_primaryPhoneNumber"));
	obj32.sendKeys("8072324480");
	WebElement obj19=driver.findElement(By.id("createLeadForm_primaryPhoneExtension"));
	obj19.sendKeys("123");
	WebElement obj22=driver.findElement(By.id("createLeadForm_primaryPhoneAskForName"));
	obj22.sendKeys("rajan");
		WebElement obj21=driver.findElement(By.id("createLeadForm_primaryEmail"));
	obj21.sendKeys("sam198@gmail.com");
	WebElement obj23=driver.findElement(By.id("createLeadForm_primaryWebUrl"));
	obj23.sendKeys("https://");
	WebElement obj24=driver.findElement(By.id("createLeadForm_generalToName"));
	obj24.sendKeys("thanku");
	
	WebElement obj25=driver.findElement(By.id("createLeadForm_generalAttnName"));
	obj25.sendKeys("thanku");
	WebElement obj26=driver.findElement(By.id("createLeadForm_generalAddress1"));
	obj26.sendKeys("no 75 opr plot");
	WebElement obj27=driver.findElement(By.id("createLeadForm_generalAddress2"));
	obj27.sendKeys("vivekanadhr street");
	WebElement obj28=driver.findElement(By.id("createLeadForm_generalCity"));
	obj28.sendKeys("chennai");
	
	WebElement obj29=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	obj29.sendKeys("TN");
	WebElement obj31=driver.findElement(By.id("createLeadForm_generalPostalCode"));
	obj31.sendKeys("223");
	WebElement obj34=driver.findElement(By.id("createLeadForm_generalPostalCodeExt"));
	obj34.sendKeys("600013");
		
	WebElement obj30=driver.findElement(By.className("smallSubmit"));
	obj30.click();
}
}
