package youtubeInterview;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaternConversion {
    public static void main(String[] args) {
      

        String input = "aa,bbb,cccc,dddd";
        String[] parts = input.split(",");
        StringBuilder result = new StringBuilder();
        int count = 2;

        for (String w : parts) {
            result.append(w.charAt(0)).append(count).append(",");
            count++;
        }
        result.deleteCharAt(result.length() - 1);

        System.out.println("Original String: " + input);
        System.out.println("Processed Output: " + result);

      
    }
}