/* import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTest {

	
	WebDriver driver = new EdgeDriver(); 
	
	String THEWEBSITE = "https://www.saucedemo.com/";

	String UserName = "standard_user";
	String Password = "secret_sauce";
	@BeforeTest
	public void mySetup() {
		
		driver.manage().window().maximize();
		
		driver.get(THEWEBSITE);
		
	}
	
	
	@Test(priority = 1)
	public void login() throws InterruptedException {
		
	WebElement UsernameInput = 	driver.findElement(By.id("user-name"));
	WebElement PasswordInput =  driver.findElement(By.id("password"));
	WebElement logIn = driver.findElement(By.id("login-button"));
		
	UsernameInput.sendKeys(UserName);	
	PasswordInput.sendKeys(Password);
	logIn.click();
		
		
		
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
	    //driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		//Thread.sleep(2000);
		//driver.findElement(By.id("login-button")).click();
		// driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	}
	
	@Test(priority = 2)
	public void addItemToThecart() throws InterruptedException {
		
		WebElement backbagadd = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		backbagadd.click();
		//driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		//Thread.sleep(2000);
	}
	 
	@Test(priority = 3)
	public void removeItemFromTheCart() {
		WebElement backbagremove = driver.findElement(By.id("remove-sauce-labs-backpack"));
		backbagremove.click();
		//driver.findElement(By.id("remove-sauce-labs-backpack")).click();
	}
	@Test(priority = 4)
	public void logOut() throws InterruptedException {
		WebElement BurgerMenu = driver.findElement(By.id("remove-sauce-labs-backpack"));
		BurgerMenu.click();
		Thread.sleep(2000); 
		//driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		WebElement logout = driver.findElement(By.id("logout_sidebar_link"));
		logout.click();

		//driver.findElement(By.id("logout_sidebar_link")).click();
		
		WebElement MainLogo = driver.findElement(By.id("login_logo"));
		System.out.println(MainLogo.getText());
		 
	} 
	
	
	
	@AfterTest
	public void myAfterTest() {
		
	//driver.quit();
	}

}*/
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTest {

	WebDriver driver = new EdgeDriver();

	String THEWEBSITE = "https://www.saucedemo.com/";

	String UserName = "standard_user";
	String Password = "secret_sauce";

	@BeforeTest
	public void mySetup() {

		driver.manage().window().maximize();

		driver.get(THEWEBSITE);

	}

	@Test(priority = 1)
	public void login() throws InterruptedException {

		WebElement UserNameInput = driver.findElement(By.id("user-name"));

		WebElement PasswordInput = driver.findElement(By.id("password"));

		WebElement LoginButton = driver.findElement(By.id("login-button"));

		UserNameInput.sendKeys(UserName);
		PasswordInput.sendKeys(Password);
		LoginButton.click();

	}

	@Test(priority = 2)
	public void AddAllItems() throws InterruptedException {
		
		List<WebElement> AddToCartButtons = driver.findElements(By.className("btn"));
		
		for(int i = 0 ; i<AddToCartButtons.size();i++) {
			AddToCartButtons.get(i).click();
		}

	}
	 
	@Test(priority = 3)
	
	public void RemoveAllItems() throws InterruptedException {
		
		Thread.sleep(2000);
	List <WebElement> RemoveButtons = 	driver.findElements(By.className("btn_secondary"));
	
	for(int i = 0 ; i<RemoveButtons.size();i++) {
		RemoveButtons.get(i).click();
	}

	}
	///// The Task
	@Test (priority = 4)
	public void Task () {
		List<WebElement> letters = driver.findElements(By.className("inventory_item_name"));
for(int i =0 ;i< letters.size();i=i+2) {
	String lett = letters.get(i).getText();
	//letters.get(3).getText();
	//System.out.println(lett.charAt(0));
//	if(lett.startsWith("S")) {
//		continue ;
//	} else {
System.out.println(lett);
	}
//}
//	
}
////////////////
	@Test(priority = 3,enabled = false)
	public void removeItemFromTheCart() {
		WebElement BackPackRemoveButton = driver.findElement(By.id("remove-sauce-labs-backpack"));
		BackPackRemoveButton.click();
	}

	@Test(priority = 5,enabled = false)
	public void Logout() throws InterruptedException {

		WebElement BurgerMenu = driver.findElement(By.id("react-burger-menu-btn"));
		BurgerMenu.click();
		Thread.sleep(1000);
		WebElement LogOutButton = driver.findElement(By.id("logout_sidebar_link"));
		LogOutButton.click();

		Thread.sleep(1000);

		WebElement MainLogo = driver.findElement(By.className("login_logo"));
		System.out.println(MainLogo.getText());

		WebElement UserNames = driver.findElement(By.id("login_credentials"));
		System.out.println(UserNames.getText());
	}

	//@AfterTest
	//public void myAfterTest() {

	//driver.quit();
	}

//}
