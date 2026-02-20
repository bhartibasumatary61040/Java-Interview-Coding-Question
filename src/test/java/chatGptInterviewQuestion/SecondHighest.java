package chatGptInterviewQuestion;

public class SecondHighest {

	public static void main(String[] args) {
		int[] arr = {5, 9, 3, 7, 1};
        int highest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int n : arr) {
            if (n > highest) {
                second = highest;
                highest = n;
            } else if (n > second && n != highest) {
                second = n;
            }
        }
        System.out.println("Second Highest: " + second);
    }
	}


