package framesDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./lib2/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/");
		WebElement Framelk = driver.findElement(By.linkText("Frame"));
		Framelk.click();
		driver.switchTo().frame(0);
		WebElement clickfr = driver.findElement(By.id("Click"));
		clickfr.click();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		//driver.switchTo().frame(0);
		//driver.switchTo().frame(0);

		WebElement clickinfr = driver.findElement(By.id("Click1"));
		clickinfr.click();
  driver.close();
	}
}
 