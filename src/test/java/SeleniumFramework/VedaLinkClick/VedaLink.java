package SeleniumFramework.VedaLinkClick;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class VedaLink {
	
		public void ClickLink() throws InterruptedException
		{
			System.setProperty("webdriver.chrom.driver", "E:\\Heena _Training\\Java_Installation\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://cutebabyphotocontest.in/january-2023/?contest=photo-detail&photo_id=32501");
			Thread.sleep(2000L);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,2500)");
			driver.findElement(By.cssSelector(".pc-image-info-box-button-btn-text")).click();
			driver.close();
		}
		
		
	
}
