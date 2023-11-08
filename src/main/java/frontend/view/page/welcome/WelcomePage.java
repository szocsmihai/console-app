package frontend.view.page.welcome;

import frontend.view.component.Page;
import frontend.view.component.Title;

/**
 * The "Welcome" page.
 */
public class WelcomePage extends Page {

    public WelcomePage() {
        super(Page.Type.WELCOME, new Title(Page.Type.WELCOME), new WelcomeBody(), new WelcomeMenu());
    }

    @Override
    public void reset() {
        // Body should be reset here.
        // Menu should be reset here.
    }

}
