package chatGptInterviewQuestion;

import java.util.HashMap;

public class CharCount {

	public static void main(String[] args) {
		
		  String str = "testing";
	        HashMap<Character, Integer> map = new HashMap<>();

	        for (char c : str.toCharArray()) {
	            map.put(c, map.getOrDefault(c, 0) + 1);
	        }

	        System.out.println(map);
	    }

	}


