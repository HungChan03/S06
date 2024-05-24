/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLib;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * MyLib class provides utility methods for user input validation. Includes
 * methods for getting valid integers, doubles, strings, and dates within
 * specified constraints. The class uses a private constructor to prevent
 * instantiation and a static Scanner instance for user input. * Author:
 * Hungnhcce180150 V01 luckygame
 */
public class MyLib {

    private static final Scanner SCANNER = new Scanner(System.in);

    // Private constructor to prevent instantiation
    private MyLib() {

    }

    /**
     * Prompts the user to input an integer within a specified range. Repeats
     * the prompt until a valid integer within the range is entered.
     *
     * @param messageInfo Message displayed to prompt the user for input.
     * @param messsageErrorOutOfRange Message displayed if the input is out of
     * the specified range.
     * @param messageErrorNumber Message displayed if the input is not a valid
     * integer.
     * @param min Minimum acceptable value (inclusive).
     * @param max Maximum acceptable value (inclusive).
     * @return The valid integer input by the user.
     */
    public static int getInt(String messageInfo, String messsageErrorOutOfRange,
            String messageErrorNumber, int min, int max) {
        do {
            try {
                System.out.print(messageInfo);
                int number = Integer.parseInt(SCANNER.nextLine());
                if (number >= min && number <= max) {
                    return number;
                } else {
                    System.out.println(messsageErrorOutOfRange);
                }
            } catch (NumberFormatException e) {
                System.out.println(messageErrorNumber);
            }
        } while (true);
    }

    /**
     * Prompts the user to input a double within a specified range. Repeats the
     * prompt until a valid double within the range is entered.
     *
     * @param messageInfo Message displayed to prompt the user for input.
     * @param messsageErrorOutOfRange Message displayed if the input is out of
     * the specified range.
     * @param messageErrorNumber Message displayed if the input is not a valid
     * double.
     * @param min Minimum acceptable value (inclusive).
     * @param max Maximum acceptable value (inclusive).
     * @return The valid double input by the user.
     */
    public static double getDouble(String messageInfo, String messsageErrorOutOfRange,
            String messageErrorNumber, Double min, Double max) {
        do {
            try {
                System.out.print(messageInfo);
                double number = Double.parseDouble(SCANNER.nextLine());
                if (number >= min && number <= max) {
                    return number;
                } else {
                    System.out.println(messsageErrorOutOfRange);
                }
            } catch (NumberFormatException e) {
                System.out.println(messageErrorNumber);
            }
        } while (true);
    }

    /**
     * Prompts the user to input a string that matches a specified regular
     * expression. Repeats the prompt until a valid string matching the regex is
     * entered.
     *
     * @param messageInfo Message displayed to prompt the user for input.
     * @param messageError Message displayed if the input does not match the
     * regex.
     * @param REGEX Regular expression that the input must match.
     * @return The valid string input by the user.
     */
    public static String getString(String messageInfo, String messageError, final String REGEX) {
        do {
            System.out.println(messageInfo);
            String str = SCANNER.nextLine();
            if (str.matches(REGEX)) {
                return str;
            } else {
                System.out.println(messageError);
            }
        } while (true);
    }

    /**
     * Prompts the user to input a date within a specified range. Repeats the
     * prompt until a valid date within the range is entered.
     *
     * @param messageInfo Message displayed to prompt the user for input.
     * @param messsageErrorOutOfRange Message displayed if the input date is out
     * of the specified range.
     * @param messageErrorDate Message displayed if the input is not a valid
     * date.
     * @param min Minimum acceptable date (inclusive).
     * @param max Maximum acceptable date (inclusive).
     * @param REGEX Date format the input must match.
     * @return The valid date input by the user.
     */
    public static Date getDate(String messageInfo, String messsageErrorOutOfRange,
            String messageErrorDate, Date min, Date max, final String REGEX) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(REGEX);
        dateFormat.setLenient(false);  // Strict date parsing
        do {
            System.out.println(messageInfo);
            try {
                Date date = dateFormat.parse(SCANNER.nextLine());
                if (date.compareTo(min) >= 0 && date.compareTo(max) <= 0) {
                    return date;
                }
                System.out.println(messsageErrorOutOfRange);
            } catch (Exception e) {
                System.out.println(messageErrorDate);
            }
        } while (true);
    }
}
