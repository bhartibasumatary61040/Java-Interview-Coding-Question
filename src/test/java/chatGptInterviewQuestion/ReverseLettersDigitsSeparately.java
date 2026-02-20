package chatGptInterviewQuestion;

public class ReverseLettersDigitsSeparately {

	public static void main(String[] args) {
		  String str = "a1b2c3d4";
	        char[] arr = str.toCharArray();

	        StringBuilder letters = new StringBuilder();
	        StringBuilder digits = new StringBuilder();

	        // Step 1: extract letters & digits
	        for (char c : arr) {
	            if (Character.isLetter(c)) {
	                letters.append(c);
	            } else if (Character.isDigit(c)) {
	                digits.append(c);
	            }
	        }

	        // Step 2: reverse both
	        letters.reverse();
	        digits.reverse();

	        int li = 0, di = 0;

	        // Step 3: rebuild the output
	        for (int i = 0; i < arr.length; i++) {

	            if (Character.isLetter(arr[i])) {
	                arr[i] = letters.charAt(li++);
	            } else if (Character.isDigit(arr[i])) {
	                arr[i] = digits.charAt(di++);
	            }
	        }

	        System.out.println(String.valueOf(arr));
	    }

	}


