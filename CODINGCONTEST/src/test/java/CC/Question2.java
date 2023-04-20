package CC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question2 {

	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		
		driver.manage().window().maximize();

		driver.manage().window().maximize();

		driver.navigate().to("https://www.saucedemo.com/");
		WebElement username= driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement login= driver.findElement(By.id("login-button"));
		login.click();
		
		WebElement drop = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
		drop.click();
		Select sel = new Select(drop);
		sel.selectByIndex(0);
		
		WebElement product1 = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
		System.out.println("Product1 name "+product1.getText());
		
		WebElement drop1 = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
		drop.click();
		Select sel1 = new Select(drop);
		sel1.selectByIndex(1);
		WebElement product2 = driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div"));
		System.out.println("Product2 name "+product2.getText());
		
		WebElement drop2 = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
		drop2.click();
		Select sel2 = new Select(drop);
		sel2.selectByIndex(2);
		WebElement product3 = driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div"));
		System.out.println("Product3 name "+product3.getText());
		
		WebElement drop3 = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
		drop3.click();
		Select sel3 = new Select(drop);
		sel3.selectByIndex(3);
		WebElement product4 = driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div"));
		System.out.println("Product4 name "+product4.getText());
		
}
}
