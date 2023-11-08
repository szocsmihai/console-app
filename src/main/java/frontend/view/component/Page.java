package frontend.view.component;

import frontend.view.attribute.Displayable;

/**
 * An element that represents a page, and is composed of its title, body and menu.
 */
public abstract class Page implements Displayable {

    /**
     * The specific type of this page.
     */
    protected final Page.Type type;

    /**
     * The page's title element.
     */
    protected final Title title;

    /**
     * The page's body element.
     */
    protected final Body body;

    /**
     * The page's menu element.
     */
    protected final Menu menu;

    /**
     * A globally-accessible setting for the page width.
     */
    public static final int WIDTH = 120;

    public Page(Page.Type type, Title title, Body body, Menu menu) {
        this.type = type;
        this.title = title;
        this.body = body;
        this.menu = menu;
    }

    /**
     * Should revert the page's components to their initial, logged-out, state.
     */
    public abstract void reset();

    @Override
    public void display() {
        this.title.display();
        this.body.display();
        this.menu.display();
    }

    public Page.Type getType() {
        return type;
    }

    public Title getTitle() {
        return this.title;
    }

    public Body getBody() {
        return this.body;
    }

    public Menu getMenu() {
        return this.menu;
    }

    /**
     * A centralized grouping of all available page types. Their description also represents their title.
     */
    public enum Type {

        WELCOME("Welcome Page"),
        ABOUT("About Page"),
        CONTACT("Contact Page"),
        LOGIN("Login Page");

        /**
         * A description of the specific page type, which also acts as its title.
         */
        private final String description;

        Type(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }

    }

}
