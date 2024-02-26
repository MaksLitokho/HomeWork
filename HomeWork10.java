package HW10;

import java.util.HashMap;
import java.util.Scanner;

/**
 * AIT-TR, cohort 42.1, Java Basic, HomeWork   #10
 *
 * @autor Maksym Litokho
 * @version 12.02.2024
 */


public class HomeWork10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character, Integer> variables = new HashMap<>();

        while (true) {
            String input = scanner.nextLine().trim();

            // Split the input line into words by spaces
            String[] words = input.split("\\s+");

            // Check if the input contains at least one word
            if (words.length == 0) {
                System.out.println("Error: empty input");
                continue;
            }

            // Get the first word which is the command
            String command = words[0];

            // Exit the program
            if (command.equals("exit")) {
                break;
            }

            // Print the content of a variable
            if (command.equals("print")) {
                // Check if variable name is provided
                if (words.length < 2) {
                    System.out.println("Error: missing variable name");
                    continue;
                }

                // Get the variable name
                char variableName = words[1].charAt(0);

                // Check if variable exists
                if (!variables.containsKey(variableName)) {
                    System.out.println("Error: variable '" + variableName + "' not found");
                    continue;
                }

                // Print the variable value
                System.out.println(variables.get(variableName));
                continue;
            }

            // Execute an assignment operation
            if (command.length() == 1 && Character.isLetter(command.charAt(0))) {
                // Check if variable name and '=' sign are provided
                if (words.length < 3 || !words[1].equals("=")) {
                    System.out.println("Error: invalid assignment syntax");
                    continue;
                }

                // Get variable name and value
                char variableName = command.charAt(0);
                int value;
                try {
                    value = Integer.parseInt(words[2]);
                } catch (NumberFormatException e) {
                    System.out.println("Error: invalid integer value");
                    continue;
                }

                // Store the variable value
                variables.put(variableName, value);
                continue;
            }

            // Print error message for unknown command
            System.out.println("Error: unknown command");
        }
        scanner.close();
    }
}