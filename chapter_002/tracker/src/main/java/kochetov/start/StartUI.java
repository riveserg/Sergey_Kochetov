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
     * Ranges.
     */
    private int[] ranges = new int[] {0, 1, 2, 3, 4, 5, 6};
    /**
     * Input.
     */
    private Input input;
    /**
     * Tracker.
     */
    private Tracker tracker = new Tracker();
    /**
     *  Constructor StartUI.
     * @param input - input
     */
    public StartUI(Input input) {
        this.input = input;
    }

    /**
     * Method init.
     */
    public void init() {
        Tracker tracker = new Tracker();
        MenuTracker menu = new MenuTracker(this.input, tracker);
        menu.fillAction();
        UserAction deleteAction = new UserAction() {
            @Override
            public int key() {
                return 3;
            }
            @Override
            public void execute(Input input, Tracker tracker) {

            }

            @Override
            public String info() {
                return "Delete ";
            }
        };
        menu.addAction(deleteAction);
        do {
            menu.show();
            int key = Integer.valueOf(input.ask("Select: "));
            menu.select(key);
        } while (true);
    }
    /**
     * Main.
     * @param args - default
     */
    public static void main(String[] args) {
        //Input input = new StubInput(new String[] {"create stub task"});
        Input input = new ConsoleInput();
        new StartUI(input).init();
    }


}
