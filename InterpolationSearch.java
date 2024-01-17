/**
 * Interpolation Search is an improvement over Binary Search for instances, 
 * where the values in a sorted array are uniformly distributed.
 * 
 * See video at https://www.youtube.com/watch?v=YSVS5GG1JuI&list=PLZPZq0r_RZON1eaqfafTnEexRzuHbfZX8&index=11 
 * 
 * interpolation search =  improvement over binary search best used for "uniformly" distributed data 
 * "guesses" where a value might be based on calculated probe results 
 * if probe is incorrect, search area is narrowed, and a new probe is calculated 
 * average case: O(log(log(n))) 
 * worst case: O(n) [values increase exponentially]
 * 
 */

public class InterpolationSearch {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = interpolationSearch(array, 6);

        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + index);
        }
    }


    private static int interpolationSearch(int[] array, int value) {
        if (array.length == 0) {
            return -1;
        }


        // determine the lower bound and upper bound values of our search range 
        int low = 0;
        int high = array.length - 1; // use array.length - 1 instead of array.length to avoid integer overflow error

        while (low <= high && value >= array[low] && value <= array[high]) {
            // calculate the position of the middle value
            int probe = low + (((high - low) / (array[high] - array[low])) * (value - array[low]));

            System.out.println("probe: " + probe);

            if (array[probe] == value) {
                return probe;
            } else if (array[probe] < value) {
                low = probe + 1;
            } else {
                high = probe - 1;
            }

        }

        return -1;
    }
    
}
