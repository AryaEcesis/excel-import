package myproject;

import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumAutomate {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://44.235.10.63/");


WebElement teetimelink = driver.findElement(By.linkText("Tee time Booking"));
teetimelink.click();

WebElement categorybutton = driver.findElement(By.id("driving_range_btn"));
categorybutton.click();

driver.findElement(By.id("choosenDate")).click();
driver.findElement(By.xpath("//td[@data-date= '1708387200000']")).click();

//WebElement element = driver.findElement(By.id(("D_17:00")));
By elementLocator = By.cssSelector(".time_div.green-couch#D_11\\:00");

WebDriverWait wait = new WebDriverWait(driver, 10); 
WebElement visibleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
visibleElement.click();

driver.findElement(By.className("tee_book_now_button")).click();

//driver.implicitly_wait(10);
WebDriverWait wait1 = new WebDriverWait(driver, 10);
WebElement ModalElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginModal")));

// WebElement ModalElement = driver.findElement(By.id("loginModal"));
 
//By modalLocator = By.cssSelector(".your-modal-class#your-modal-id[role='dialog']");



ModalElement.findElement(By.id("Email")).sendKeys("arya.ecesis@gmail.com");		
ModalElement.findElement(By.id("Password")).sendKeys("Arya@123");

driver.findElement(By.xpath("//span[@class='toggle-password tp mt-2']")).click();

//driver.findElement(By.className("toggle-password tp mt-2")).click();
//driver.findElement(By.className("btn btn-dark btn-lg btn-block")).click();
driver.findElement(By.xpath("//button[@class='btn btn-dark btn-lg btn-block ']")).click();

WebElement Swalmodal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("swal2-popup")));
//WebElement Swalmodal = driver.findElement(By.xpath("//div[@class='swal2-popup swal2-modal swal2-show']"));

Swalmodal.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();

//WebElement Bookingmodal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("modal-dialog")));
//Bookingmodal.findElement(By.id("btnCheckout")).click();

WebElement Bookingmodal = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//div[@role='document'][contains(@class, 'modal-dialog ')]")));

/*-------------------------------------------- Use Coupon ---------------------------------------------

Bookingmodal.findElement(By.xpath("//button[@class='btn btn-sm btn-outline-primary pr-3 dis-btn']")).click();

WebElement CouponModal = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.id("couponmodal")));

int indexToClick = 0; // Change the index as needed
WebElement applyCodeButton = CouponModal.findElement(By.xpath("(//span[@id='cpnBtn'])[" + (indexToClick + 1) + "]"));
applyCodeButton.click();

------------------------------------------------------------------------------------------------------------*/

Bookingmodal.findElement(By.id("btnCheckout")).click();


/* Set<String> windowHandles = driver.getWindowHandles();

// Check if there are at least two handles before switching
if (windowHandles.size() >= 2) {
    // Switch to the new tab directly
    String newTab = (String) windowHandles.toArray()[1];
    driver.switchTo().window(newTab);

    // Locate the input field on the new page
    WebElement inputField = driver.findElement(By.id("yourInputFieldId"));

    // Send values to the input field
    inputField.sendKeys("Your desired value");

    // Optionally, perform other actions on the new page

    // Close the browser window
    driver.quit();
} else {
    System.out.println("There are not enough tabs to switch.");
    // Optionally, handle the case where there are not enough tabs
    // You might choose to stay on the original tab or take other actions.
}
   
 */





WebDriverWait wait4 = new WebDriverWait(driver, 10);
wait4.until(ExpectedConditions.numberOfWindowsToBe(2));

// Switch to the new tab
Set<String> windowHandles = driver.getWindowHandles();
for (String windowHandle : windowHandles) {
    driver.switchTo().window(windowHandle);
}
// Wait for the page title to contain a specific value
wait4.until(ExpectedConditions.titleContains("Smash Golf"));

// Get and print the page title
String pageTitle = driver.getTitle();
System.out.println("Page Title: " + pageTitle);

driver.findElement(By.id("cardNumber")).sendKeys("1234567898765627");
driver.findElement(By.id("cardholderName")).sendKeys("test");
driver.findElement(By.id("cvn")).sendKeys("123");

driver.findElement(By.id("rateBooking")).click();

WebElement wanttochangemodal = driver.findElement(By.id("bookModal"));
WebDriverWait wait5 = new WebDriverWait(driver, 20);
wait5.until(ExpectedConditions.elementToBeClickable(By.id("D_18:00"))).click();
driver.findElement(By.id("btnChange")).click();

driver.findElement(By.id("paymentbtn")).click();


//WebElement succespopup = driver.findElement(By.className("")
wait.until(ExpectedConditions.presenceOfElementLocated(By.className("swal2-popup")));
WebElement okaypopup = driver.findElement(By.className("swal2-popup"));

okaypopup.findElement(By.className("swal2-confirm")).click();




}
}
