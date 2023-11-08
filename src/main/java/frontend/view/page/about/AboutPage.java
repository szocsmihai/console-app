package frontend.view.page.about;

import frontend.view.component.Page;
import frontend.view.component.Title;

/**
 * The "About" page.
 */
public class AboutPage extends Page {

    public AboutPage() {
        super(Page.Type.ABOUT, new Title(Page.Type.ABOUT), new AboutBody(), new AboutMenu());
    }

    @Override
    public void reset() {
        // Body should be reset here.
        // Menu should be reset here.
    }

}
