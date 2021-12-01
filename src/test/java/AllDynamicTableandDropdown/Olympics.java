package AllDynamicTableandDropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Olympics {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver( );
				driver.get("https://olympics.com/en");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElement(By.xpath("//button[text( )='Yes, I am happy']")).click();
				driver.findElement(By.xpath("//button[@class='b2p-nav__item extra__hamburger-menu-trigger']")).click();
				driver.findElement(By.xpath("( //span[text( )='Results & Medals'])[1]")).click();
				
	}

}
