package HW8;

import java.util.Arrays;

/**
 * AIT-TR, cohort 42.1, Java Basic, Home work   #8
 * @autor Litokho Maksym
 * @version 06.02
 */

public class HomeWork8 {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Task" + i);
        }

        // Task 2
        System.out.println("\nTask 2:");
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100); // Fill array with random integers
        }
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Numbers divisible by 5:");
        for (int num : array) {
            if (num % 5 == 0) {
                System.out.println(num);
            }
        }

        // Task 3
        System.out.println("\nTask 3:");
        String[] strings = {"One", "Two", "Twenty"};
        int maxLength = 0;
        for (String str : strings) {
            if (str.length() > maxLength) {
                maxLength = str.length();
            }
        }
        System.out.println("Characters from the longest string:");
        for (String str : strings) {
            if (str.length() == maxLength) {
                for (char ch : str.toCharArray()) {
                    System.out.println(ch);
                }
                break; // Only print characters from the first longest string
            }
        }

        // Task 4
        System.out.println("\nTask 4:");
        int[] numbers = {5, 10, 3, 8, 15}; // Example array
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            sum += num;
        }
        double average = (double) sum / numbers.length;
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Average: " + average);

        // Task 5
        System.out.println("\nTask 5:");
        String expression = "11+3-6+8";
        String[] elements = expression.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");
        System.out.println(Arrays.toString(elements));
    }
}