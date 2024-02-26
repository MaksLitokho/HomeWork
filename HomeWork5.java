package HW5;

import java.util.Random;
import java.util.Scanner;
/**
 * AIT-TR, Java Basic, Cohort42.1, HW #5
 * @author Litokho Maksym
 * @version 27.01.24
 */
public class HomeWork5 {
    public static void main(String[] args) {

        //Task 1

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int q = scanner.nextInt();
        System.out.println("Enter second number: ");
        int w = scanner.nextInt();
        boolean a = q % 2 == 0;
        boolean s = w % 2 == 0;
        boolean d = q % 3 == 0;
        boolean f = w % 3 == 0;
        boolean g = a && d;
        boolean h = s && f;
        System.out.println("Number: " + q + " even: " + a + "; multiple 3: "  + d + "; even and multiple 3: " + g);
        System.out.println("Number: " + w + " even: " + s + "; multiple 3: "  + f + "; even and multiple 3: " + h);

        //Task 2

        System.out.println("Enter a number (1, 2, or 3): ");
        int number = scanner.nextInt();
        String result;
        if (number == 1) {
            result = "one";
        } else if (number == 2) {
            result = "two";
        } else if (number == 3) {
            result = "three";
        } else {
            result = "invalid number";
        }
        System.out.println("You entered: " + result);

        //Task 3

        Random random = new Random();
        int z = random.nextInt(101);
        int x = random.nextInt(101);
        int c = random.nextInt(101);
        int v = random.nextInt(101);
        System.out.println("Generated numbers: " + z + ", " + x + ", " + c + ", " + v + ";");
        int b = z;
        if (x > b) {
            b = c;
        }
        if (z > b) {
            b = x;
        }
        if (v > b) {
            b = v;
        }
        System.out.println("The MAX number is: " + b);
    }
}