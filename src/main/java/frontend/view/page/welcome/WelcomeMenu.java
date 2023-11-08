package frontend.view.page.welcome;

import frontend.Frontend;
import frontend.util.OutputPrinter;
import frontend.view.component.Menu;
import frontend.view.component.Page;

/**
 * The menu of the "Welcome" page.
 */
public class WelcomeMenu extends Menu {

    public WelcomeMenu() {
        super(ActionType.GO_TO_ABOUT, ActionType.GO_TO_CONTACT, ActionType.LOG_IN);
    }

    @Override
    public void execute(ActionType action) {
        switch (action) {
            case GO_TO_ABOUT:
                Frontend.goTo(Page.Type.ABOUT);
                break;
            case GO_TO_CONTACT:
                Frontend.goTo(Page.Type.CONTACT);
                break;
            case LOG_IN:
                Frontend.logIn();
                break;
            case LOG_OUT:
                Frontend.logOut();
                break;
            default:
                OutputPrinter.printFeedback("Missing option. Please contact our support team");
                System.exit(-1);
        }
    }

}
