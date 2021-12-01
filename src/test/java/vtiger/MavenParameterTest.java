package vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenParameterTest
{
   @Test
   
   public void parameter( )
   {
	  WebDriver driver= new ChromeDriver( );
	  driver.get("https://www.amazon.in");
	  driver.manage().window().maximize();
	  String url= driver.getCurrentUrl();
	  System.getProperty(url);
			  
	  
	  
   }
	
	
	

}
