package chatGptInterview;

public class RemoveSpecialChars {

	public static void main(String[] args) {

        String str = "a!b@c#123$%^";
        String clean = str.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println(clean);
    
	}

}
