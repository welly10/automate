package Testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class RegistrationTest {
	@Test //This is TestNG annotation

	public void testRegister()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Wellington\\Softwares\\Selenium June 2019\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("http://newtours.demoaut.com/");

		driver.findElement(By.linkText("REGISTER")).click();
		

		driver.findElement(By.name("firstName")).sendKeys("User1");

		driver.findElement(By.name("lastName")).sendKeys("Surname1");

		/*driver.findElement(By.name(�phone�)).sendKeys(�123456789�);

		driver.findElement(By.name(�userName�)).sendKeys(�user1@test.com�);

		driver.findElement(By.name(�address1�)).sendKeys(�Test Address�);

		driver.findElement(By.name(�city�)).sendKeys(�Test City�);

		Select select = new Select(driver.findElement(By.name(�country�)));

		       select.selectByVisibleText(�ANGOLA�);

		driver.findElement(By.name(�email�)).sendKeys(�user1@test.com�);

		driver.findElement(By.name(�password�)).sendKeys(�user1�);

		driver.findElement(By.name(�confirmPassword�)).sendKeys(�user1�);

		driver.findElement(By.name(�register�)).click();

		driver.close();

		driver.quit();
		*/

		}

		}

