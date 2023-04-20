package QUESTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class question3 {

	public static void main(String args[])
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("==remote=allow=origins=*");
		
		driver = new ChromeDriver(co);
		driver.get("https://www.amazon.in/");
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
        WebElement acc = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"));
        acc.click();
        
}
}
