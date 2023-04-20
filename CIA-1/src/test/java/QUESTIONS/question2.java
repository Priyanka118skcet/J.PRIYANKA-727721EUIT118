package QUESTIONS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class question2 {
	
	public static void main(String args[])
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver;
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--remote-allow-origin=*");
	driver=new ChromeDriver(co);
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement phone= driver.findElement(By.id("twotabsearchtextbox"));
	phone.sendKeys("phone");
	WebElement search= driver.findElement(By.id("nav-search-submit-button"));
	search.click();
	List<WebElement> li =  driver.findElements(By.xpath("//*[@class=\"a-size-medium a-color-base a-text-normal\"]"));
	for(WebElement l:li)
	System.out.println(l.getText()+" ");
	}

}
	












//	public static void main(String args[])
//	{
//		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver;
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("==remote=allow=origins=*");
//		
//		driver = new ChromeDriver(co);
//		driver.get("https://www.amazon.in/");
//        driver.manage().window().maximize();
//        System.out.println(driver.getTitle());
//        
//        String txt = driver.getTitle();
//        if(txt.equals(driver.getTitle()))
//        {
//        	System.out.println("PageTitle is Valid");
//        }
//        else
//        {
//        	System.out.println("PageTitle is Invalid");
//        }
//        WebElement textbox = driver.findElement(By.id("twotabsearchtextbox"));
//        textbox.sendKeys("laptop",Keys.ENTER);
//        WebElement sort =driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]"));
//        sort.click();
//        
//        List<WebElement> li =  driver.findElements(By.xpath("//*[@class=\"a-size-medium a-color-base a-text-normal\"]"));
//        for(WebElement l:li)
//        System.out.print(l.getText()+" ");
//        }



