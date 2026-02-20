package youtubeInterview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.stream.Collectors;

public class ReverseString2 {
    public static void main(String[] args) {
       

        String s = "test12pop90java989pyt767$test";

        // Reverse only alphabets (short approach)
        String letters = s.chars()
                          .filter(Character::isLetter)
                          .mapToObj(c -> String.valueOf((char) c))
                          .collect(Collectors.joining());
        String reversedLetters = new StringBuilder(letters).reverse().toString();

        int[] index = {0};
        String result = s.chars()
                .mapToObj(c -> Character.isLetter((char) c) 
                        ? String.valueOf(reversedLetters.charAt(index[0]++)) 
                        : String.valueOf((char) c))
                .collect(Collectors.joining());

        System.out.println("Original String: " + s);
        System.out.println("Processed String: " + result);

      
    }
}