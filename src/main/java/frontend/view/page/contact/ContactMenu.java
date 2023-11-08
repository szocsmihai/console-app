package frontend.view.page.contact;

import frontend.Frontend;
import frontend.view.component.Menu;
import frontend.view.component.Page;

/**
 * The menu of the "Contact" page.
 */
public class ContactMenu extends Menu {

    public ContactMenu() {
        super(ActionType.GO_BACK);
    }

    @Override
    public void execute(ActionType action) {
        if (ActionType.GO_BACK == action) {
            Frontend.goTo(Page.Type.WELCOME);
        }
    }

}
