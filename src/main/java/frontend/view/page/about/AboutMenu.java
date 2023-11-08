package frontend.view.page.about;

import frontend.Frontend;
import frontend.view.component.Menu;
import frontend.view.component.Page;

/**
 * The menu of the "About" page.
 */
public class AboutMenu extends Menu {

    public AboutMenu() {
        super(ActionType.GO_BACK);
    }

    @Override
    public void execute(ActionType action) {
        if (ActionType.GO_BACK == action) {
            Frontend.goTo(Page.Type.WELCOME);
        }
    }

}
