package frontend.view.page.login;

import frontend.Frontend;
import frontend.view.component.Menu;
import frontend.view.component.Page;

/**
 * The menu of the "Login" page.
 */
public class LoginMenu extends Menu {

    public LoginMenu() {
        super(ActionType.GO_BACK);
    }

    @Override
    public void execute(ActionType action) {
        if (ActionType.GO_BACK == action) {
            Frontend.goTo(Page.Type.WELCOME);
        }
    }

}
