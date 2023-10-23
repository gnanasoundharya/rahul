package rahulshetty;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rahulshetty01 {
	WebDriver driver;
	@BeforeTest
	public void tc1() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(op);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
	    Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	@Test(enabled = true)
	public void radiobutton() throws InterruptedException, AWTException
	{		
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@value='radio1']")).click();
		driver.findElement(By.xpath("//*[@value='radio2']")).click();
		//driver.findElement(By.xpath("//*[@value='radio3']")).click();
		Thread.sleep(3000);
	    //driver.findElement(By.id("autocomplete")).sendKeys("India");
		//Select dropdown=new Select((web));
	    // dropdown.selectByVisibleText("India");
	    WebElement web=driver.findElement(By.id("autocomplete"));
	    Robot ro=new Robot();
	    ro.keyPress(KeyEvent.VK_SHIFT);
	    Thread.sleep(3000);
	    ro.keyPress(KeyEvent.VK_I);
	    Thread.sleep(3000);
	    ro.keyPress(KeyEvent.VK_N);
	    Thread.sleep(3000);
	    ro.keyPress(KeyEvent.VK_D);
	    Thread.sleep(3000);
	    ro.keyPress(KeyEvent.VK_I);
	    Thread.sleep(3000);
	    ro.keyPress(KeyEvent.VK_A);
	    Thread.sleep(3000);
	    ro.keyPress(KeyEvent.VK_DOWN);
	    Thread.sleep(3000);
	    ro.keyPress(KeyEvent.VK_DOWN);
	    Thread.sleep(3000);
	    ro.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(3000);
	  
	    
	    
	    
	    
	}
	
	
		
	

}

