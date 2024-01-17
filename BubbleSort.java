// Video at https://www.youtube.com/watch?v=Dv4qLJcxus8&list=PLZPZq0r_RZON1eaqfafTnEexRzuHbfZX8&index=12

// bubble sort = pairs of adjacent elements are compared, and the elements
//		         swapped if they are not in order.

//				 Quadratic time O(n^2)
//				 small data set = okay-ish
//				 large data set = BAD (plz don't)

public class BubbleSort {
    static int[] nums = {9, 1, 8, 2, 6, 4, 5, 7, 0, 3};

    public static void main(String[] args) {   
        System.out.print("before sorting: ");
        for (int i : nums) {
            System.out.print(i);
        }

        bubbleSort(nums);

        System.out.println("");
        System.out.print("after sorting: ");
        for (int i : nums) {
            System.out.print(i);
        }
    }

    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                //if (nums[j] < nums[j + 1]) { // sort in descending order
                if (nums[j] > nums[j + 1]) { // sort in ascending order
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}