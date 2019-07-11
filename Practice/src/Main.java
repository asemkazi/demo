import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asem Kazi\\eclipse-workspace\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https:\\www.google.com");
	driver.manage().window().maximize();
	Thread.sleep(30000);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.quit();
	}

}
