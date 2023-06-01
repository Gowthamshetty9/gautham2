package Sample2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Myp4Test {
	public WebDriver driver;
@Test
	public void m5()
	{
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}else if(BROWSER.equalsIgnoreCase("edge") )
		{
			driver=new EdgeDriver();
		}
		driver.get(URL);
	}
}
