package AllDynamicTableandDropdown;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lenskart
{

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.lenskart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	//driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).click();
		Thread.sleep(3000);
    List<WebElement> NoOfOptions = driver.findElements(By.xpath("//ul[@class='trending_list menu-link']/li"));
		for(int i=0;i<=NoOfOptions.size()-1;i++)
		{
			String AllOptions = NoOfOptions.get(i).getText();
			System.out.println(AllOptions);
		}
		
//		WebElement ele=driver.findElement(By.xpath("//h4[text( )='BUY IT YOUR WAY']"));
//		
//		Point loc=ele.getLocation();
//		
//		JavascriptExecutor jse=  (JavascriptExecutor ) driver;
//		jse.executeScript("window.scrollBy"+loc);
//		
		
	}

	}


