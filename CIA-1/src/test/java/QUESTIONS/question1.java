package QUESTIONS;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class question1 {

	public static void main(String args[])
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("==remote=allow=origins=*");
		
		driver = new ChromeDriver(co);
		driver.get("https://www.amazon.in/Redmi-Mystique-AMOLED-Snapdragon%C2%AE-Triple/dp/B0BQ3PJJDQ/ref=sr_1_2_sspa?crid=2E978AD8MM31G&keywords=mobile&qid=1681289215&sprefix=mobile%2Caps%2C518&sr=8-2-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        
        String txt = driver.getTitle();
        if(txt.equals(driver.getTitle()))
        {
        	System.out.println("PageTitle is Valid");
        }
        else
        {
        	System.out.println("PageTitle is Invalid");
        }
        
        WebElement addcart = driver.findElement(By.id("add-to-cart-button"));
        addcart.click();
        
        WebElement cart = driver.findElement(By.className("a-button-input"));
        cart.click();
      
//        driver.navigate().to("https://https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
        
//       WebElement delete = driver.findElement(By.xpath("//*[@id=\"sc-active-a36a6b26-ab9f-49a3-af9b-4a5ac4a80377\"]/div[4]/div/div[2]/div[1]/span[2]/span/input"));
//       delete.click();
        
        
		
	}
}
