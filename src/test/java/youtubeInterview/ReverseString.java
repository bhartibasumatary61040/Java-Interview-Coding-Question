package youtubeInterview;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReverseString {
    public static void main(String[] args) {
        // Step 1: Initialize WebDriver (Example purpose)
//        WebDriver driver = new ChromeDriver();

        // Step 2: Original string (in real case, you could get it from a web element)
        String original = "test12pop90java989pyt767$test";

        // Step 3: Reverse only alphabets, keep digits and symbols same
        String output = reverseOnlyAlphabets(original);

        // Step 4: Print results
        System.out.println("Original String: " + original);
        System.out.println("Processed String: " + output);

        // Step 5: Close browser
//        driver.quit();
    }

    // Method to reverse only alphabetic characters
    public static String reverseOnlyAlphabets(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (!Character.isLetter(arr[left])) {
                left++;
            } else if (!Character.isLetter(arr[right])) {
                right--;
            } else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}