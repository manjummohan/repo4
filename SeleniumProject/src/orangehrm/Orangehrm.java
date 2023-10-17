package orangehrm;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;



public class Orangehrm {
	
		public static void main(String[] args)throws InterruptedException {
			System.out.println("Launch Orangehrm page");
			System.setProperty("webdriver.gecko.driver","C:\\Users\\sandhya\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
			driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")).click();
			Thread.sleep(1000);
            driver.findElement(By.linkText("Add Employee")).click();
            Thread.sleep(2000);
			driver.findElement(By.name("firstName")).sendKeys("Manju");
			driver.findElement(By.name("middleName")).sendKeys("M");
			driver.findElement(By.name("lastName")).sendKeys("Mohan");
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
		    
		}
	}
	

