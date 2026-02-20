package chatGptInterviewQuestion;

import java.util.HashSet;

public class DuplicateArray {

	public static void main(String[] args) {
		
		   int[] arr = {1,2,3,4,2,3,5};
	        HashSet<Integer> set = new HashSet<>();

	        for (int num : arr) {
	            if(!set.add(num)) {
	                System.out.println("Duplicate: " + num);
	            }
	        }
	    }

	}


