package CC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question1 {

	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		
		driver.manage().window().maximize();

		driver.navigate().to("https://www.saucedemo.com/");
		WebElement username= driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement login= driver.findElement(By.id("login-button"));
		login.click();
		Thread.sleep(3000);
		WebElement add= driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
		add.click();
		WebElement view = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
		view.click();
		WebElement check = driver.findElement(By.id("checkout"));
		check.click();
		WebElement fname = driver.findElement(By.id("first-name"));
		fname.sendKeys("Priyanka");
		WebElement lname = driver.findElement(By.id("last-name"));
		lname.sendKeys("J");
		WebElement code = driver.findElement(By.id("postal-code"));
		code.sendKeys("638452");
		WebElement con = driver.findElement(By.id("continue"));
		con.click();
		
		WebElement product = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
		System.out.println("Product name "+product.getText());
		WebElement price = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]"));
		System.out.println(price.getText());
		
		String Exceptedtitle = "Swag Labs";
		String Actualtitle = driver.getTitle();
		if(Exceptedtitle.equals(Actualtitle))
		{
			System.out.println("Title is valid");
		}
		else
		{
			System.out.println("Title is not valid");
		}
		
		String Exceptedurl = "https://www.saucedemo.com/checkout-step-two.html";
		String Actualurl = driver.getCurrentUrl();
		if(Exceptedurl.equals(Actualurl))
		{
			System.out.println("Url is valid");
		}
		else
		{
			System.out.println("Url is not valid");
		}
		
		
		
		
}
}
