
/*public class HelloWorld {

	public static void main (String[] args)
	{
		System.out.println("Hello World");
	}
}
*/

 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.testng.annotations.Test;
public class HelloWorld {
 

	public static void main (String[] args){
		System.setProperty("webdriver.chrome.driver", "E:\\Wellington\\Softwares\\Selenium June 2019\\chromedriver_win32\\chromedriver.exe");
 
// Initialize browser
WebDriver driver=new ChromeDriver();
 
// Open Google
driver.get("http://www.google.com");
 
// Close browser
//driver.close();
}
 
}