/**
 * 
 * See video at https://www.youtube.com/watch?v=246V51AWwZM&list=PLZPZq0r_RZON1eaqfafTnEexRzuHbfZX8&index=9 
 * 
 * Linear Search = Iterate through a collection one element at a time
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 
 * Disadvantages: 
 *      slow for large data sets
 * 
 * Advantages:
 *      fast for searches of small to medium data sets 
 *      does not need to be sorted 
 *      useful for data structures that do not allow random access (e.g. linked lists)
 */


public class LinearSearch {
    
    public static void main(String args[]){   
    	
    	// linear search = Iterate through a collection one element at a time
    	
    	int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
    	
    	int index = linearSearch(array, 5);
    	
    	if(index != -1) {
    		System.out.println("Element found at index: " + index);
    	}
    	else {
    		System.out.println("Element not found");
    	}
    		
    }

	private static int linearSearch(int[] array, int value) {
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == value) {
				return i;
			}
		}
		
		return -1;
	}

}
