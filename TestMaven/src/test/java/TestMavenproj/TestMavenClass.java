package TestMavenproj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMavenClass {

	@Test
	public void testHello()
	{
		System.out.println("Welcome to the World of Maven.........");
		System.setProperty("webdriver.chrome.driver", "E:\\Suman\\Softwares\\Cell\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.google.com");
		System.out.println("The page title is : " + dr.getTitle()+" got it man........????");
	}
}
