/*
* The "BoardFoot" program, just proves you can show print to terminal.
*
* @author  Haokai
*
* @version 1.0
*
* @since   2021-11-24
*
*/

import java.util.Scanner;

/**
* This is the standard "BoardFoot" program.
*/
final class BoardFoot {

    /**
    * One 144 variable.
    */
    public static final int EX = 144;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private BoardFoot() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting calculate function.
    *
    * @param width
    *
    * @param height
    *
    * @return calculate
    */

    static double calculate(final double width, final double height) {
        // calculate
        final double hMany = EX / (width * height);

        // return
        return hMany;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {
        // set
        double width = 0;
        double height = 0;

        System.out.println("This program figures out the length of a wooden"
            + " board that is 1 board foot in dimension."
            + "(1 board foot is 144 inches³ of wood.)");

        try {
            // input
            final Scanner input = new Scanner(System.in);
            System.out.print("Enter the width(inch): ");
            width = input.nextDouble();

            System.out.print("Enter the height(inch): ");
            height = input.nextDouble();

            final double answer = calculate(width, height);

            System.out.println("The wood should be " + answer
                + " inch(es) long.");
            System.out.println("");

        } catch (java.util.InputMismatchException errorCode) {
            System.out.println("Something was not a number.");
            System.out.println("");
        }
        System.out.println("\nDone.");
    }
}
