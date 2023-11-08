package frontend.view.page.contact;

import frontend.util.OutputPrinter;
import frontend.view.component.Body;

/**
 * The body of the "Contact" page.
 */
public class ContactBody extends Body {

    @Override
    public void display() {
        OutputPrinter.printEmpty(1);
        OutputPrinter.printTextCenter("No Content");
        OutputPrinter.printEmpty(1);
    }

}
