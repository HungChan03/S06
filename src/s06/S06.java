/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s06;

import MyLib.MyLib; // Assuming you are using a custom library named MyLib
import java.util.Scanner;

/**
 * Main class for running the program
 *
 * @author Admin
 */
public class S06 {

    /**
     * The main method
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Code code = new Code(); // Create an instance of the Code class
        Scanner scanner = new Scanner(System.in); // Create a scanner object for user input
        int choice = 0; // Variable to store user choice

        // Infinite loop to repeatedly show the menu and process user input
        while (true) {
            // Display the menu and get the user's choice
            choice = MyLib.getInt(
                    "1. Convert binary number to decimal number\n"
                    + "2. Convert octal number to decimal number\n"
                    + "3. Convert hexadecimal number to decimal number\n"
                    + "4. Exit\n"
                    + "Please choose number (1 – 4): ",
                    "The choice must be from 1 to 4",
                    "Invalid number, please enter an integer number",
                    1, 4);

            // Process the user's choice
            switch (choice) {
                case 1:
                    // Get a binary number from the user and convert it to decimal
                    String binary = MyLib.getString(
                            "Please enter binary number",
                            "The input is not a binary number",
                            "[01]+");
                    int binaryResult = code.binaryToDecimal(binary);
                    System.out.println("Binary to Decimal: " + binary + " -> " + binaryResult);
                    break;

                case 2:
                    // Get an octal number from the user and convert it to decimal
                    String octal = MyLib.getString(
                            "Please enter octal number",
                            "The input is not an octal number",
                            "[0-7]+");
                    int octalResult = code.octalToDecimal(octal);
                    System.out.println("Octal to Decimal: " + octal + " -> " + octalResult);
                    break;

                case 3:
                    // Get a hexadecimal number from the user and convert it to decimal
                    String hex = MyLib.getString(
                            "Please enter hexadecimal number",
                            "The input is not a hexadecimal number",
                            "[0-9A-Fa-f]+");
                    int hexResult = code.hexToDecimal(hex);
                    System.out.println("Hexadecimal to Decimal: " + hex + " -> " + hexResult);
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Exiting the program...");
                    scanner.close(); // Close the scanner
                    System.exit(0); // Exit the program
            }
        }
    }
}
