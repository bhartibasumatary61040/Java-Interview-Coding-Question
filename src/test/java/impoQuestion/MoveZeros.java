package impoQuestion;

public class MoveZeros {

	public static void main(String[] args) {
		 int[] arr = {1, 0, 3, 0, 12};
	        int index = 0;

	        for (int n : arr) {
	            if (n != 0) {
	                arr[index++] = n;
	            }
	        }

	        while (index < arr.length) {
	            arr[index++] = 0;
	        }

	        for (int a : arr) {
	            System.out.print(a + " ");
	        }
	    
	}

}
