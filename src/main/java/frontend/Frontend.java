package frontend;

import frontend.util.InputScanner;
import frontend.view.component.Page;
import frontend.view.page.about.AboutPage;
import frontend.view.page.contact.ContactPage;
import frontend.view.page.login.LoginPage;
import frontend.view.page.welcome.WelcomePage;

import java.util.HashMap;
import java.util.Map;

/**
 * A very high-level representation of a frontend module or application, which controls the available pages, is aware of
 * the currently logged-in user (if any) and communicates with the backend via controllers. Shows static (non-sensitive)
 * information to the user independently, collects user inputs, forms requests based on user inputs and sends the
 * requests to controllers (which process them and produce responses), then shows the responses to the user.
 */
public class Frontend {

    /**
     * A collection of all the pages used by the frontend.
     */
    private static final Map<Page.Type, Page> availablePages = new HashMap<>() {{
        put(Page.Type.WELCOME, new WelcomePage());
        put(Page.Type.ABOUT, new AboutPage());
        put(Page.Type.CONTACT, new ContactPage());
        put(Page.Type.LOGIN, new LoginPage());
    }};

    // A reference to the currently logged-in user should be saved here.

    /**
     * A reference to the most recently printed page.
     */
    private static Page currentPage = null;

    /**
     * The starting point of the fronted flow.
     */
    public static void start() {
        logOut();
    }

    /**
     * The flow that checks user credentials and adapts (if necessary) page contents accordingly.
     */
    public static void logIn() {
        currentPage = availablePages.get(Page.Type.LOGIN);
        currentPage.display();
        initiateSelection();
    }

    /**
     * The flow that removes the currently logged-in user reference and adapts (if necessary) page contents accordingly.
     */
    public static void logOut() {
        // Currently logged-in user should be set null here.
        for (Map.Entry<Page.Type, Page> pair : availablePages.entrySet()) {
            pair.getValue().reset();
        }
        currentPage = availablePages.get(Page.Type.WELCOME);
        currentPage.display();
        initiateSelection();
    }

    /**
     * Displays a specific page, identified by its unique type.
     */
    public static void goTo(Page.Type page) {
        currentPage = availablePages.get(page);
        currentPage.display();
        initiateSelection();
    }

    /**
     * Aks the user to select an option based on the current page's menu and executes the selected option.
     */
    private static void initiateSelection() {
        int userInput = InputScanner.getInput();
        currentPage.getMenu().initiate(userInput);
    }

}
