package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestApp {
	
	@Test
	public void Test1() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.easyfootwear.shop");
		driver.manage().window().maximize();
	}
	String ExpProdId = "AX00125"; // Exp product Id
	String productId = "AX00125"; // Acc product Id
	
	@Test
	public void ResponseProductId() {
		
		Assert.assertTrue(productId == ExpProdId);
		
	}
	
	@Test
	public void ResponseProductIdFalse() {
		
		Assert.assertFalse(productId != ExpProdId);
	}

}
