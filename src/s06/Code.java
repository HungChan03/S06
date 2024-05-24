/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s06;

import MyLib.MyLib; // Assuming you are using a custom library named MyLib

/**
 *
 * @author Admin
 */
public class Code {

    /**
     * Converts a binary string to its decimal equivalent.
     *
     * @param binary The binary string
     * @return The decimal value
     */
    public int binaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();
        for (int i = 0; i < length; i++) {
            // Get the character at the current position from the end
            char digit = binary.charAt(length - 1 - i);
            // If the character is '1', add the corresponding power of 2 to the decimal value
            if (digit == '1') {
                decimal += Math.pow(2, i);
            }
        }
        return decimal;
    }

    /**
     * Converts an octal string to its decimal equivalent.
     *
     * @param octal The octal string
     * @return The decimal value
     */
    public int octalToDecimal(String octal) {
        int decimal = 0;
        int length = octal.length();
        for (int i = 0; i < length; i++) {
            // Get the character at the current position from the end
            char digit = octal.charAt(length - 1 - i);
            // Convert the character to a digit and add the corresponding power of 8 to the decimal value
            decimal += (digit - '0') * Math.pow(8, i);
        }
        return decimal;
    }

    /**
     * Converts a hexadecimal string to its decimal equivalent.
     *
     * @param hex The hexadecimal string
     * @return The decimal value
     */
    public int hexToDecimal(String hex) {
        int decimal = 0;
        int length = hex.length();
        for (int i = 0; i < length; i++) {
            // Get the character at the current position from the end
            char digit = hex.charAt(length - 1 - i);
            // If the character is between '0' and '9'
            if (digit >= '0' && digit <= '9') {
                decimal += (digit - '0') * Math.pow(16, i);
                // If the character is between 'A' and 'F'
            } else if (digit >= 'A' && digit <= 'F') {
                decimal += (digit - 'A' + 10) * Math.pow(16, i);
                // If the character is between 'a' and 'f'
            } else if (digit >= 'a' && digit <= 'f') {
                decimal += (digit - 'a' + 10) * Math.pow(16, i);
            }
        }
        return decimal;
    }
}
