package HW6;

import java.util.Scanner;

/**
 *AIT-TR, cohort 42.1, Java Basic, hw #6
 * @author Litokho Maksym
 * @version 28.01
 */
public class HomeWork6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //task1
        System.out.println("Enter number: 1, 2, or 3.");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("You entered the digit: One");
                break;
            case 2:
                System.out.println("You entered the digit: Two");
                break;
            case 3:
                System.out.println("You entered the digit: Three");
                break;
            default:
                System.out.println("ERORE");
                break;
        }

        //task2
        System.out.println("Enter the number: 1 - 7;");
        int d = sc.nextInt();
        switch (d) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Thuesday");
                break;
            case 3:
                System.out.println("Wensday");
                break;
            case 4:
                System.out.println("Thuesday");
                break;
            case 5:
                System.out.println("Freiday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("There are only 7 days in the week.");
        }

        //task3
        int t = 1;
        while (t < 11) {
            System.out.println("Task" + t);
            t++;
        }

        //task4
        int z = 0;
        do {
            z++;
            if (z % 5 == 0){
                System.out.println(z);
            }
        }while (z <= 100);

        //task5
        String word = "Hallo";
        int attemps = 0;
        String user;

        do {
            System.out.println("Enter word: Hallo");
            user = sc.next();
            attemps++;
            if (user.equals(word)) {
                System.out.println("You spelled the word correctly!");
            } else {
                System.out.println("The written word is not correct!");
            }
        }while (!user.equals(word));
        System.out.println("Attemps - " + attemps);
    }
}
