package frontend.view.component;

import frontend.util.InputScanner;
import frontend.util.OutputPrinter;
import frontend.view.attribute.Displayable;

import java.util.HashMap;
import java.util.Map;

/**
 * Am element displayed below a page's title and body. Contains the page's selectable action options.
 */
public abstract class Menu implements Displayable {

    /**
     * The menu's action options, grouped by the index shown to the user for selection.
     */
    protected final Map<Integer, ActionType> actions = new HashMap<>();

    public Menu(ActionType... orderedActions) {
        setActions(orderedActions);
    }

    @Override
    public void display() {
        OutputPrinter.printEmpty(1);
        OutputPrinter.printBorder('-');
        OutputPrinter.printTextCenter(stringifyActions());
        OutputPrinter.printBorder('-');
        OutputPrinter.printEmpty(1);
    }

    /**
     * Validates and executes an action by its number.
     */
    public void initiate(int actionNumber) {
        if (actions.containsKey(actionNumber)) {
            execute(this.actions.get(actionNumber));
        } else {
            OutputPrinter.printFeedback("Invalid Option. Try again");
            initiate(InputScanner.getInput());
        }
    }

    /**
     * Executes an action.
     */
    protected abstract void execute(ActionType action);

    public Map<Integer, ActionType> getActions() {
        return actions;
    }

    /**
     * Executes an action option.
     */
    public void setActions(ActionType... orderedActions) {
        actions.clear();

        int index = 0;
        for (ActionType action : orderedActions) {
            if (ActionType.GO_BACK == action) {
                actions.put(0, action);
            } else {
                actions.put(++index, action);
            }
        }
    }

    /**
     * Joins this menu's items into a single printable string.
     */
    private String stringifyActions() {
        String separator = " | ";

        StringBuilder menuBuilder = new StringBuilder();

        for (int i = 1; i <= actions.size(); i++) {
            if (actions.containsKey(i)) {
                menuBuilder
                        .append(i)
                        .append(". ")
                        .append(actions.get(i).getDescription());

                if (i < actions.size()) {
                    menuBuilder.append(separator);
                }
            }
        }

        if (actions.containsKey(0)) {
            menuBuilder
                    .append("0. ")
                    .append(actions.get(0));
        }

        return menuBuilder.toString();
    }

    /**
     * A centralized grouping of all available menu action types. Their descriptions are printed in menus. Actual action
     * implementations are defined in the execute method of menus.
     */
    public enum ActionType {

        GO_TO_ABOUT("About"),
        GO_TO_CONTACT("Contact"),
        GO_HOME("Home"),
        GO_BACK("Back"),
        LOG_IN("Login"),
        LOG_OUT("Logout");

        /**
         * A description of the specific action, which is printed in the menu.
         */
        private final String description;

        ActionType(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }

    }

}
