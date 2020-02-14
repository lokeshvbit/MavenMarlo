package MavenMarloTest.MavenMarloTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class marloTest {
	
	 @Test
	  public void Malro() throws InterruptedException
	  {

			WebDriver driver = new ChromeDriver();
			

			driver.get("https://qa.marlo.online/");
			Thread.sleep(20000);
			driver.findElement(By.xpath("//*[@id=\"frameModalTopInfoDemo\"]/div/div/div/div/div[2]/button")).click();
			driver.manage().window().maximize();
	  }
		
		
	
	
	
}
