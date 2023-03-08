import java.util.Arrays;

public class BuggySearchAndSort {

    public static void main(String[] args) {
        int[] nums = {4, 3, 6, 9, 3, 9, 5, 4, 1, 9};
        System.out.print("The array is: ");
        printArray(nums);

        int target = 5;
        if (search(nums, target)) {
            System.out.println("This array DOES contain " + target + ".");
        } else {
            System.out.println("This array does NOT contain " + target + ".");
        }

        int[] numsCopy1 = Arrays.copyOf(nums, nums.length);
        Arrays.sort(numsCopy1);
        System.out.print("Sorted by Arrays.sort(): ");
        printArray(numsCopy1);

        int[] numsCopy2 = Arrays.copyOf(nums, nums.length);
        sweepSort(numsCopy2);
        System.out.print("Sorted by Sweep Sort: ");
        printArray(numsCopy2);

        int[] numsCopy3 = Arrays.copyOf(nums, nums.length);
        selectionSort(numsCopy3);
        System.out.print("Sorted by Selection Sort: ");
        printArray(numsCopy3);

        int[] numsCopy4 = Arrays.copyOf(nums, nums.length);
        insertionSort(numsCopy4);
        System.out.print("Sorted by Insertion Sort: ");
        printArray(numsCopy4);
    }

    public static boolean search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static void sweepSort(int[] nums) {
        boolean swapped = true;
        int i = 0;
        while (swapped) {
            swapped = false;
            i++;
            for (int j = 0; j < nums.length - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
        }
    }

    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
    }

    public static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int j = i - 1;
            int temp = nums[i];
            while (j >= 0 && nums[j] > temp) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = temp;
        }
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}

/*
Bug: search method always returns false
Fix: Change the return statement in the search method to return true when the number is found in the array.

Bug: sweepSort method gets stuck in an infinite loop when the array is already sorted
Fix: Add a flag to track whether or not any swaps have been made during a pass through the array, and break the loop if no swaps were made.

Bug: selectionSort method sorts the array in descending order instead of ascending order
Fix: Change the comparison operator in the inner loop of selectionSort from > to <.

Bug: insertionSort method throws an IndexOutOfBoundsException when the first element of the array is greater than any of the subsequent elements
Fix: Modify the condition in the inner loop of insertionSort to check if j >= 0 before comparing the current element to the next element.*/
