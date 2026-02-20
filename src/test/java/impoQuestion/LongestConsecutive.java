package impoQuestion;

import java.util.HashSet;

public class LongestConsecutive {

	public static void main(String[] args) {
		int[] arr = {100, 4, 200, 1, 3, 2};
        HashSet<Integer> set = new HashSet<>();

        for (int n : arr) set.add(n);

        int longest = 0;

        for (int n : arr) {

            if (!set.contains(n - 1)) {
                int current = n;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        System.out.println("Longest sequence length: " + longest);
    
	}

}
