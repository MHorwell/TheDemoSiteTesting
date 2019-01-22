package demoSiteTest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoTest {
	
	WebElement element;
	WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@After
	public void teardown() {
		driver.quit();
	}
	
	@Ignore
	@Test
	public void FindDemoTest() throws InterruptedException  {
		String username = "testUser158";
		String password = "pass22";
		driver.manage().window().maximize();
		driver.get("http://www.thedemosite.co.uk/");
		driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]")).click();
		WebElement inputName = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));
		WebElement inputPass = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
		inputName.sendKeys(username);
		inputPass.sendKeys(password);
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input")).click();
		driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]")).click();
		WebElement loginNameInput = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"));
		WebElement loginPassInput = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"));
		loginNameInput.sendKeys(username);
		loginPassInput.sendKeys(password);
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input")).click();
		assertEquals("testUser or testPass wasn't recognised","**Successful Login**" ,driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")).getText());
	}

		
	}
	

