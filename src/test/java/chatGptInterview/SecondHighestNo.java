package chatGptInterview;

public class SecondHighestNo {

	public static void main(String[] args) {

        int[] arr = {5, 9, 3, 7, 1, 9};

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        int lowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;

        for (int n : arr) {

            // Highest
            if (n > highest) {
                secondHighest = highest;
                highest = n;
            } else if (n > secondHighest && n != highest) {
                secondHighest = n;
            }

            // Lowest
            if (n < lowest) {
                secondLowest = lowest;
                lowest = n;
            } else if (n < secondLowest && n != lowest) {
                secondLowest = n;
            }
        }

        System.out.println("Second Highest: " + secondHighest);
        System.out.println("Second Lowest: " + secondLowest);
    
	}

}
