package basic_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import dev.failsafe.Timeout;

public class WebTable {
static String url="https://itest.squad1.tech//login";
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhishek\\Desktop\\Jmeter\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
    	options.addArguments("--remote-allow-origins=*");
    	WebDriver driver = new ChromeDriver(options);
		
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder=\"Email ID\"]")).sendKeys("abhishek.yadav@talakunchi.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("Admin@12345");
		Thread.sleep(1000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(10000);

		Actions nav = new Actions(driver);
		nav.moveToElement(driver.findElement(By.xpath("//li[@id=\"5\"]"))).perform();
		Thread.sleep(3000);

		nav.moveToElement(driver.findElement(By.xpath("//li[@id=\"5\"]/div/ul/li[2]/a"))).click().perform();
		Thread.sleep(3000);
		List<WebElement> ch = driver.findElements(By.xpath("//tbody[@id=\"tbody_TicketView\"]//tr//td[3]"));
		System.out.println("hiii");
		Thread.sleep(2000);
		for (int i = 1; i < ch.size(); i++) {
			Thread.sleep(3000);
			System.out.println(ch.get(i).getText());
			Thread.sleep(3000);
			if ((ch.get(i).getText()).equalsIgnoreCase("ssss")) {
				System.out.println("gyg" + ch.get(i).getText());
				System.out.println(i);
				Thread.sleep(3000);
				int g=i+1;
				System.out.println(i);
				Actions s = new Actions(driver);
				Thread.sleep(2000);

				s.moveToElement(
						driver.findElement(By.xpath("//*[@id=\"tbody_TicketView\"]/tr[" + g + "]/td[7]/div/div/a[1]")))
						.perform();
				Thread.sleep(1000);
				
				
				driver.findElement(By.xpath("//*[@id=\"tbody_TicketView\"]/tr["+g+"]/td[7]/div/div/a")).click();
				Thread.sleep(2000);
				break;
			}

		}
	}

}
