package frontend.view.component;

import frontend.util.OutputPrinter;
import frontend.view.attribute.Displayable;

/**
 * Am element displayed above a page's body and menu. Uses the page type's description as its value.
 */
public class Title implements Displayable {

    /**
     * The page type that this title belongs to.
     */
    private final Page.Type pageType;

    public Title(Page.Type pageType) {
        this.pageType = pageType;
    }

    @Override
    public void display() {
        OutputPrinter.printEmpty(1);
        OutputPrinter.printBorder('/');
        OutputPrinter.printTextCenter(this.pageType.getDescription());
        OutputPrinter.printBorder('\\');
        OutputPrinter.printEmpty(1);
    }

}
