package impoQuestion;

public class CountWords {

	public static void main(String[] args) {
		   String str = "I am learning automation";
	        int count = 0;

	        boolean isWord = false;

	        for (int i = 0; i < str.length(); i++) {

	            if (str.charAt(i) != ' ') {
	                if (!isWord) {
	                    count++;
	                    isWord = true;
	                }
	            } else {
	                isWord = false;
	            }
	        }

	        System.out.println("Word count: " + count);
	    

	}

}
