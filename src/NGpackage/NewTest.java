package NGpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void VerifyTitle() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Wellington\\Softwares\\Selenium June 2019\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("http://www.google.com");
		String Actual = driver.getTitle();
		Assert.assertEquals(Actual, "Google");
  }
  
  public void Title() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Wellington\\Softwares\\Selenium June 2019\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("http://www.yahoo.com");
		String Actual = driver.getTitle();
		Assert.assertEquals(Actual, "yahoo");
  }
}
