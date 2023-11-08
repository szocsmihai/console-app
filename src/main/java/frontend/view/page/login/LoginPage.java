package frontend.view.page.login;

import frontend.view.component.Page;
import frontend.view.component.Title;

/**
 * The "Login" page.
 */
public class LoginPage extends Page {

    public LoginPage() {
        super(Page.Type.LOGIN, new Title(Page.Type.LOGIN), new LoginBody(), new LoginMenu());
    }

    // Should ask for credentials and send them to the controller. Should set the user login reference in the frontend.

    @Override
    public void reset() {
        // Body should be reset here.
        // Menu should be reset here.
    }

}
