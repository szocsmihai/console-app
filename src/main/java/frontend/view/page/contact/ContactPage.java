package frontend.view.page.contact;

import frontend.view.component.Page;
import frontend.view.component.Title;

/**
 * The "Contact" page.
 */
public class ContactPage extends Page {

    public ContactPage() {
        super(Page.Type.CONTACT, new Title(Page.Type.CONTACT), new ContactBody(), new ContactMenu());
    }

    @Override
    public void reset() {
        // Body should be reset here.
        // Menu should be reset here.
    }

}
