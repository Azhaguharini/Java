	package Day2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertionDemo {
	WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\FPCourses\\Selenium\\SeleniumArtifacts\\chromedriver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://10.82.180.36/Common/Login.aspx");// to load URL
		//driver.navigate().to("url");
		driver.manage().window().maximize();//to maximize window
	}

	@After
	public void tearDown() {
		driver.close();
	}

	@Test
	public void test() {
		driver.findElement(By.id("body_txtUserID")).sendKeys("donhere");
		driver.findElement(By.name("ctl00$body$txtPassword")).sendKeys("don@123");
		driver.findElement(By.id("body_btnLogin")).click();
		String expected="Welcome donhere";
		String actual=driver.findElement(By.xpath("//*[@id=\"divWelcome\"]")).getText();
		Assert.assertTrue(expected.equals(actual));
		//Assert.assertFalse(expected.equals(actual));
		//Assert.assertEquals(expected, actual);
		//System.out.println(driver.findElement(By.id("divWelcome")).isDisplayed());
		System.out.println("assertion");
		
	}

}
