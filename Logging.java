import java.util.Scanner;

/**
* Java program to demonstrate working Logging in Java.
*
* @author Navin
* @version 1.0
* @since 2023-02-14
*/

public final class Logging {
    /**
    * Main lines of code.
    *
    *
    * @exception IllegalStateException Utility Class
    * @see IllegalStateException
    */
    private Logging() {
        throw new IllegalStateException("Utility Class");
    }

    /**
    * Main lines of code.
    *
    *
    * @param args placeholder
    */
    public static void main(final String[] args) {

        // Using Scanner for Getting Input from User
        System.out.println("Enter the length of your logs: ");

        final Scanner scanner = new Scanner(System.in);

        // get the radius as a string
        final String lengthString = scanner.nextLine();

        try {
            // Convert the string to a double
            final double length = Double.parseDouble(lengthString);

            // check if negative
            if (length == 0.25 || length == 0.5 || length == 1) {
                // Calculate
                final double weight = length * 20;
                final double logNum = 1100 / weight;

                System.out.print("The number of logs is ");
                System.out.println(logNum);
            } else {
                System.out.println("This is an invalid input");
            }
        } catch (NumberFormatException error) {
            System.out.println("Please enter a valid log. "
                + error.getMessage());
        }

        // Closing Scanner
        scanner.close();
    }
}

