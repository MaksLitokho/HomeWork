package HW9;

import java.util.Random;

/**
 * AIT-TR, cohort 42.1, Java Basic, Home work   #9
 * @autor Litokho_Maksym
 * @version 08.02
 */

public class HomeWork9 {



    public static void main(String[] args) {

        //Task #1
        task1(10);

        //Task #2
        listArrayBack(new int[]{1, 2, 3, 4, 5, 6});

        //Task #3
        listArrayBack(new int[]{1, 2, 3, 4, 5, 6}, false);
        listArrayBack(new int[]{1, 2, 3, 4, 5, 6}, true);
    }

    // Method task #1
    static void task1(int n) {
        for (int i = 1; i <=n; i++) {
            System.out.println("Task" + i);
        }
    }
    static void listArrayBack(int[] a) {
        for (int i = a.length - 1;i > -1; i--){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    static void listArrayBack(int[] a, boolean reversDirection){
        if (reversDirection) {
            listArrayBack(a);
        }else {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}