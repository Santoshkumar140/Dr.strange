package trello;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	

public class TrelloExecution {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/qq393/chromedriver_linux64/chromedriver");

		//Open browser instance
		WebDriver driver = new ChromeDriver();
		driver.get("https://trello.com/");
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("user")).sendKeys("abhishek.das@qapitol.com");
	driver.findElement(By.id("login")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys("Abhi@2929");
	driver.findElement(By.id("login-submit")).click();
	Thread.sleep(3000);
	String actualTitle=driver.getTitle();
	String expectedTitle="Log in to continue - Log in with Atlassian account";
	
	driver.findElement(By.xpath("//p[text()=\"Create\"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()=\"Create board\"]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@placeholder=\"Add board title\"]")).click();
	driver.findElement(By.xpath("//input[@placeholder=\"Add board title\"]")).sendKeys("Goa trip preparation");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[text()=\"Create board\"]")).click();
	Thread.sleep(8000);
	driver.findElement(By.className("list-name-input")).click();
	driver.findElement(By.className("list-name-input")).sendKeys("To-do");
	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	Thread.sleep(1000);
	//driver.findElement(By.xpath("//button[text()=\"Create board\"]")).click();
    Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder=\"Enter list title…\"]")).sendKeys("doing");
	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	Thread.sleep(1000); 
	driver.findElement(By.xpath("//input[@placeholder=\"Enter list title…\"]")).sendKeys("Done");
	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	Thread.sleep(1000); 
	driver.findElement(By.xpath("(//span[text()=\"Add a card\"])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//textarea[@placeholder=\"Enter a title for this card…\"]")).click();
	driver.findElement(By.xpath("//textarea[@placeholder=\"Enter a title for this card…\"]")).sendKeys("Shopping");
	driver.findElement(By.xpath("//input[@type=\"submit\" and @value=\"Add card\"]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//textarea[@placeholder=\"Enter a title for this card…\"]")).click();
	driver.findElement(By.xpath("//textarea[@placeholder=\"Enter a title for this card…\"]")).sendKeys("Booking Tickets");
	driver.findElement(By.xpath("//input[@type=\"submit\" and @value=\"Add card\"]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//textarea[@placeholder=\"Enter a title for this card…\"]")).click();
	driver.findElement(By.xpath("//textarea[@placeholder=\"Enter a title for this card…\"]")).sendKeys("Booking Hotels");
	driver.findElement(By.xpath("//input[@type=\"submit\" and @value=\"Add card\"]")).click();
	Thread.sleep(3000);
	
	
	cardMover();
	
	
}
	
	
	public static void cardMover() throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/qq393/chromedriver_linux64/chromedriver");

				//Open browser instance
		WebDriver driver = new ChromeDriver();
		driver.get("https://trello.com/");
		driver.manage().window().maximize();
		
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("user")).sendKeys("abhishek.das@qapitol.com");
	driver.findElement(By.id("login")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("password")).sendKeys("Abhi@2929");
	driver.findElement(By.id("login-submit")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()=\"Goa trip preparation\"]")).click();
		
	Thread.sleep(3000);
	WebElement srcShooping = driver.findElement(By.xpath("//span[@class=\"list-card-title js-card-name\"]"));
	
	
	WebElement doingDest = driver.findElement(By.xpath("(//div[@class=\"list js-list-content\"])[2]"));
	
	Actions act = new Actions(driver);
	act.dragAndDrop(srcShooping, doingDest).perform();
	Thread.sleep(3000);
	WebElement srcBookingTicket = driver.findElement(By.xpath("//span[@class=\"list-card-title js-card-name\"]"));
	act.dragAndDrop(srcBookingTicket, doingDest).perform();
	Thread.sleep(3000);
	WebElement srcBookingHotels = driver.findElement(By.xpath("//span[@class=\"list-card-title js-card-name\"]"));
	act.dragAndDrop(srcBookingHotels, doingDest).perform();
	Thread.sleep(3000);
	
	
	WebElement srcShooping1 = driver.findElement(By.xpath("//span[@class=\"list-card-title js-card-name\"]"));
	WebElement doneDest = driver.findElement(By.xpath("(//div[@class=\"list js-list-content\"])[3]"));
	act.dragAndDrop(srcShooping1, doneDest).perform();
	Thread.sleep(3000);
	WebElement srcBookingTicket1 = driver.findElement(By.xpath("//span[@class=\"list-card-title js-card-name\"]"));
	act.dragAndDrop(srcBookingTicket1, doneDest).perform();
	Thread.sleep(3000);
	WebElement srcBookingHotels1 = driver.findElement(By.xpath("//span[@class=\"list-card-title js-card-name\"]"));
	act.dragAndDrop(srcBookingHotels1, doneDest).perform();
	
	
	}

}
