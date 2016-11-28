package alert;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new FirefoxDriver();

		driver.get("https://uploadfiles.io/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			Thread.sleep(60000);
			/*
			 * Alert alert = driver.switchTo().alert(); alert.dismiss();
			 */
			driver.findElement(By.xpath("//*[@id='at-cv-lightbox-close']"))
					.click();
		} catch (Throwable t) {
			System.out.println("nothing to do");
		}

		driver.findElement(By.xpath("//*[@id='upload-window']")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("G:\\java\\upload.exe");
		
	}

}
