package HW11;

import java.util.Random;
import java.util.Scanner;

/**
 * AIT-TR, Java Basic, Lesson #11
 *
 * @author Maksym_Litokho
 * @version 25.02.2024
 */

public class HomeWork11 {
    char[][] table = new char[3][3];
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    static final char CHAR_EMPTY = '.';
    static final char CHAR_X = 'x';
    static final char CHAR_O = 'o';

    public static void main(String[] args) {
        HomeWork11 method = new HomeWork11();
        // init table (.)
        method.initTable();
        // main game loop
        while (true) {
            // human turn (x)
            method.turnHuman();
            // is human win? yes - game over
            if (method.isWin(CHAR_X)) {
                System.out.println("YOU WON!");
                break;
            }
            // is table fill? yes - game over
            if (method.isTableFill()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            // AI turn (o)
            method.turnAI();
            // is AI win? yes - game over
            if (method.isWin(CHAR_O)) {
                System.out.println("AI WON!");
                break;
            }
            // is table fill? yes - game over
            if (method.isTableFill()) {
                System.out.println("Sorry, DRAW");
                break;
            }
            // print table
            method.printTable();
        }
        // print table
        method.printTable();
    }

    void initTable() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++){
                table[y][x] = CHAR_EMPTY;
            }
        }
    }

    void printTable() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++){
                System.out.print(table[y][x] + " ");
            }
            System.out.println();
        }
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.println("Enter x & y [0..2]:");
            x = scanner.nextInt();
            y = scanner.nextInt();
        } while (!isCellValid(x, y));
        table[y][x] = CHAR_X;
    }

    void turnAI() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[y][x] = CHAR_O;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return table[y][x]  == CHAR_EMPTY;
    }

    boolean isWin(char chr) {
        for (int i = 0; i < 3; i++) {
            if (table[i][0] == chr && table[i][1] == chr && table[i][2] == chr) return true;    // by X
            if (table[0][i] == chr && table[1][i] == chr && table[2][i] == chr) return true;        // by Y
        }
        // diagonals
        if (table[0][0] == chr && table[1][1] == chr && table[2][2] == chr) return true;
        if (table[2][0] == chr && table[1][1] == chr && table[0][2] == chr) return true;
        return false;
    }

    boolean isTableFill() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++){
                if (table[y][x] == CHAR_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}