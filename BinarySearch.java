/**
 * See video at https://www.youtube.com/watch?v=xrMppTpoqdw&list=PLZPZq0r_RZON1eaqfafTnEexRzuHbfZX8&index=10 
 * 
 * Binary search = Search algorithm that finds the position of a target value within a sorted array. 
 * Half of the array is eliminated during each "step".
 * 
 */

public class BinarySearch {

    public static void main(String[] args) {
		
		// original code in the video 
		/*
		int array[] = new int[1000000]; // one MILLION elemetns muhuhahahaha
		int target = 777777;

		// populate array with numbers 0 to 999999
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		*/

        // a more simple example I created to test the algorithm
		int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9}; 
        int target = 6;        
		
		//int index = Arrays.binarySearch(array, target); // Java's built-in binary search
		int index = binarySearch(array, target);
		
		if (index == -1) {
			System.out.println(target + " not found");
		} else {
			System.out.println("Element found at index: " + index);
		}
		
	}

	private static int binarySearch(int[] array, int target) {
		
		int low = 0;
		int high = array.length - 1;	
		
		System.out.println("start value of low: " + low);
		System.out.println("start value of high: " + high);
		
		while (low <= high) {

			System.out.println("new value of low: " + low);
			System.out.println("new value of high: " + high);
			
			int middle = low + (high - low) / 2; // avoids potential integer overflow in Java for large arrays
			int value = array[middle];
			
			System.out.println("middle position: " + middle);
			System.out.println("value at array middle position: " + value);
			
			if (value < target) {
                low = middle + 1; // we need to search to the right of middle
            } else if (value > target) { 
                high = middle - 1; // we need to search to the left of middle
            } else { 
                return middle; //target found
            }
		}
		
		return -1;
	}
    
}
