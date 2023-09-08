package Own;

import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Spotify {
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://open.spotify.com/");
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		
		driver.findElement(By.cssSelector("input[spellcheck='false']")).sendKeys("new york nagaram");
		Thread.sleep(3000);
		
		driver.findElement(By.className("iCQtmPqY0QvkumAOuCjr")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//button[@data-testid='play-button'])[2]")).click();
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		driver.findElement(By.id("login-username")).sendKeys("mahendar0503@gmail.com");
		
		driver.findElement(By.id("login-password")).sendKeys("Mahi@0503");
		
		driver.findElement(By.xpath("//span[text()='Log In']")).click();
		
	
		
	}

}
