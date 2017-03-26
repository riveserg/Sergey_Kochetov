package kochetov.start;
/**
 * StartUI.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class StartUI{
    /**
     * Input.
     */
    private Input input;
    /**
     * Tracker.
     */
    private Tracker tracker;
    /**
     *  Constructor StartUI.
     * @param input - input
     * @param tracker - tracker
     */
    private int[] range = {0, 1, 2, 3, 4, 5, 6};

    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Method init.
     */
    public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        boolean isExit = true;
        menu.fillAction();
        do {
            if (!(this.input instanceof StubInput)) {
                menu.show();
            }
            int key = input.ask("Select: ", range);
            if (key != 6) {
                menu.select(key);
            } else {
                isExit = false;
            }
        } while (isExit);
    }
    /**
     * Main.
     * @param args - default
     */
    public static void main(String[] args) {
        Input input = new ValidateInput();
        Tracker tracker = new Tracker();
        new StartUI(input, tracker).init();
    }


}
