package chatGptInterviewQuestion;

public class ReverseOnlyWords {

	public static void main(String[] args) {
		
		   String str = "I am QA";
	        String[] words = str.split(" ");
	        String result = "";

	        for (int i = words.length - 1; i >= 0; i--) {
	            result += words[i] + " ";
	        }
	        System.out.println(result.trim());
	    }
	}
