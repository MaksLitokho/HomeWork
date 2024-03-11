package HW13;

import java.util.Arrays;

/**
 * AIT-TR, cohort 42.1, Java Basic, Homework #13
 * @author Litokho Maksym
 * @version 5.03.24
 */
public class HomeWork13 {
    public static void main(String[] args) {
        // Creating an array of 100,000 random integers
        int[] array = new int[100_000_000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000); // Random number between 0 and 999
        }

        // Measuring the time taken to create the array
        long startTime = System.currentTimeMillis();

        // Performing linear search
        int target = 500; // Target number to search for
        linearSearch(array, target);

        // Measuring the time taken for linear search
        long linearSearchTime = System.currentTimeMillis() - startTime;
        System.out.println("Linear search time: " + linearSearchTime + " ms");

        // Sorting the array
        Arrays.sort(array);

        // Measuring the time taken for sorting
        long sortTime = System.currentTimeMillis() - startTime - linearSearchTime;
        System.out.println("Sort time: " + sortTime + " ms");

        // Performing binary search
        binarySearch(array, target);

        // Measuring the time taken for binary search
        long binarySearchTime = System.currentTimeMillis() - sortTime;
        System.out.println("Binary search time: " + binarySearchTime + " ms");
    }

    // Linear search
    public static void linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                // Found
                break;
            }
        }
    }

    //Binary search
    public static void binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == target) {
                //Found
                break;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }
}
