package HW4;

/**
 * AIT-TR, Java-Basic, Cohort 42.1, HW#4
 * @Autor Litokho Maksym
 * Version 23.01.2024
 */
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" What is your name? ");
        String q = scanner.next();
        System.out.println(" What is your last name? ");
        String w = scanner.next();
        System.out.println(" In which town you live? ");
        String e = scanner.next();
        System.out.println(" How old are you? ");
        int r = scanner.nextInt();
        System.out.println(" What is your height? ");
        String t = scanner.next();
        System.out.println("My name is " + q + " " + w + ", " + "i live in " + e + ", " + "Im " + r + " years old," + " my height is " + t + " meters.");
    }
}