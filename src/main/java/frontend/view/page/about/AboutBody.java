package frontend.view.page.about;

import frontend.util.OutputPrinter;
import frontend.view.component.Body;

/**
 * The body of the "About" page.
 */
public class AboutBody extends Body {

    @Override
    public void display() {
        OutputPrinter.printEmpty(1);
        OutputPrinter.printTextCenter("No Content");
        OutputPrinter.printEmpty(1);
    }

}
