package impoQuestion;

public class LongestWords {

	public static void main(String[] args) {
		String str = "I am learning automation testing";
        String[] words = str.split(" ");

        String longest = "";

        for (String w : words) {
            if (w.length() > longest.length()) {
                longest = w;
            }
        }

        System.out.println("Longest word: " + longest);
    

	}

}
