package myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booking_Cancel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://44.235.10.63/");

WebElement loginlink = driver.findElement(By.linkText("Login"));
loginlink.click();
driver.findElement(By.name("login_email")).sendKeys("arya.ecesis@gmail.com");
driver.findElement(By.name("Password_login")).sendKeys("Arya@123");
driver.findElement(By.cssSelector("button.loginbutton[type='submit']")).click();

//driver.findElement(By.)
String targetText = "My Bookings";
WebElement element = driver.findElement(By.xpath("//*[text()='" + targetText + "']"));
element.click();

//driver.findElement(By.id("cancelRequestBtn")).click();
int indexToClick = 0; // Change the index as needed
WebElement cancelbutton = driver.findElement(By.xpath("(//button[@id='cancelRequestBtn'])[" + (indexToClick + 1) + "]"));
cancelbutton.click();
WebElement cancelpopup = driver.findElement(By.className("swal2-popup"));
cancelpopup.findElement(By.id("swalSub")).click();





	}
	

}
