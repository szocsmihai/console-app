package frontend.view.page.welcome;

import frontend.util.OutputPrinter;
import frontend.view.component.Body;

/**
 * The body of the "Welcome" page.
 */
public class WelcomeBody extends Body {

    @Override
    public void display() {
        OutputPrinter.printEmpty(1);
        OutputPrinter.printTextCenter("Welcome to our website");
        OutputPrinter.printEmpty(1);
        OutputPrinter.printTextCenter("Select actions by typing their number");
        OutputPrinter.printTextCenter("Type \"exit\" when you are done browsing");
        OutputPrinter.printEmpty(1);
    }

}
