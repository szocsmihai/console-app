package frontend.util;

import frontend.view.component.Page;

/**
 * A utility class for printing elements on screen.
 */
public class OutputPrinter {

    /**
     * Prints the given amount of empty lines.
     */
    public static void printEmpty(int lines) {
        if (lines >= 1) {
            for (int i = 1; i <= lines; i++) {
                System.out.println();
            }
        }
    }

    /**
     * Prints a horizontal line across the entire view width, composed of the given dot character.
     */
    public static void printBorder(char dot) {
        System.out.println(String.valueOf(dot).repeat(Page.WIDTH));
    }

    /**
     * Prints the given text aligned to the left of the view.
     */
    public static void printTextLeft(String text) {
        System.out.println(text.toUpperCase());
    }

    /**
     * Prints the given text aligned to the center of the view.
     */
    public static void printTextCenter(String text) {
        int remainingWidth = Page.WIDTH - text.length();
        int indent = 0;

        if (remainingWidth >= 2) {
            indent = remainingWidth / 2;
        }

        System.out.println(" ".repeat(indent) + text.toUpperCase());
    }

    /**
     * Prints the given text aligned to the right of the view.
     */
    public static void printTextRight(String text) {
        int indent = Page.WIDTH - text.length();
        System.out.println(indent + text.toUpperCase());
    }

    /**
     * Prints a prompt for the user to provide input.
     */
    public static void printPrompt() {
        System.out.print("Your Input: ".toUpperCase());
    }

    /**
     * Prints the given text as feedback for the user.
     */
    public static void printFeedback(String text) {
        int remainingWidth = Page.WIDTH - text.length();
        int indent = 0;

        if (remainingWidth >= 2) {
            indent = remainingWidth / 2;
        }

        StringBuilder line = new StringBuilder()
                .append(">".repeat(indent - 1))
                .append(" ")
                .append(text.toUpperCase())
                .append(" ")
                .append("<".repeat(indent - 1));

        if (line.length() < Page.WIDTH) {
            line.insert(0, ">");
        }

        System.out.println();
        System.out.println(line);
        System.out.println();
    }

}
