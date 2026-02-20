package chatGptInterviewQuestion;

public class ReverseOnlyLetter {

	public static void main(String[] args) {
    
		 String str = "a1b2c3";
	        char[] arr = str.toCharArray();

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

	        System.out.println(String.valueOf(arr));
	    }
}
