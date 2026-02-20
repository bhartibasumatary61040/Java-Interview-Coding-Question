package youtubeInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MonthDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();

	        // Step 2: Open your target webpage
	       // driver.get("https://example.com");  // Replace with your actual site URL

	        // Step 3: Locate the month dropdown
	        WebElement monthDropdown = driver.findElement(By.id("month"));
		 Select select = new Select(monthDropdown);

	        // Step 5: Select "June" from the dropdown
	        select.selectByVisibleText("June");

	        // Optional Step: Verify selected month
	        String selected = select.getFirstSelectedOption().getText();
	        System.out.println("Selected month is: " + selected);

	        // Step 6: Close the browser
	        driver.quit();
	}

}
