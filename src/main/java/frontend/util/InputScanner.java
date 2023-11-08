package frontend.util;

import java.util.Scanner;

/**
 * A utility class for reading user keyboard inputs.
 */
public class InputScanner {

    /**
     * A globally-accessible setting for the exit command.
     */
    public static final String EXIT_COMMAND = "Exit";

    /**
     * The scanner used to read the user's keyboard input.
     */
    private static final Scanner keyboardScanner = new Scanner(System.in);

    /**
     * Prompts the user for input and initializes the reading process.
     */
    public static int getInput() {
        OutputPrinter.printPrompt();

        String input = keyboardScanner.nextLine();
        if (EXIT_COMMAND.equalsIgnoreCase(input)) {
            OutputPrinter.printFeedback("Goodbye");
            System.exit(0);
        }

        int number;
        try {
            number = Integer.parseInt(input);
        } catch (NumberFormatException ex) {
            OutputPrinter.printFeedback("Invalid Input. Try again");
            number = getInput();
        }

        return number;
    }

}
