package org.Sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {
	
	WebDriver driver;
	Actions a;
	Robot r;
	
	public void launchURL(String url, String browser) {
		
		switch(browser.toUpperCase()) {
		
		case "CHROME":
		System.setProperty("webdriver.chrome.driver", "./chrome/chromedriver.exe");
		driver = new ChromeDriver();
		break;
		
		case "FF":
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
			
		default:
			System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");
	        driver = new InternetExplorerDriver();  
	        break;
		
		}
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
		if(driver.getTitle().equals("Google") && driver.getCurrentUrl().equals("https://www.google.com/")){
			
			System.out.println("URL : " + driver.getCurrentUrl());
			System.out.println("Title : " + driver.getTitle());
		}
		
	
	}
	
	public void rightClickOperation() {
		a = new Actions(driver);
		WebElement gmail= driver.findElement(By.linkText("Gmail"));
		a.contextClick(gmail).perform();
		
	}
	
	public void keyboardOperation() {
		   
		try {
			r = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
	
	public static void main(String[] args) {
		
		Sample s = new Sample();
		s.launchURL("https://www.google.com","chrome");
		s.rightClickOperation();
		s.keyboardOperation();
	}

}
