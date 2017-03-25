package kochetov.start;

/**
 * MenuTracker.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class MenuTracker {
    /**
     * input.
     */
    private  Input input;
    /**
     * Tracker.
     */
    private Tracker tracker;
    /**
     * Array actions.
     */
    private UserAction[] actions = new UserAction[7];
    /**
     * Position of the array.
     */
    private int position = 0;

    /**
     * Constructor.
     * @param input - input
     * @param tracker - tracer
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Add action.
     * @param action - action
     */
    public void addAction(UserAction action) {
        this.actions[position++] = action;
    }

    /**
     * Fill action.
     */
    public void fillAction() {
        System.out.println("-------------------------");
        System.out.println("-----------MENU----------");
        System.out.println("-------------------------");
        this.actions[position++] = new AddItem();
        this.actions[position++] = new ShowItem();
        this.actions[position++] = new EditItem();
        this.actions[position++] = new DelItem();
        this.actions[position++] = new FindItemById();
        this.actions[position++] = new FindItemByName();
        this.actions[position++] = new ExitProgram();
    }

    /**
     *  Select.
     * @param key - key
     */
    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }

    /**
     * Show.
     */
    public void show() {
        for (UserAction action : this.actions) {
            System.out.println(action.info());
        }
    }

    /**
     * AddItem.
     */
    private class AddItem implements UserAction {
        /**
         *  Return key.
         * @return - key
         */
        @Override
        public int key() {
            return 0;
        }

        /**
         *  Execute.
         * @param input - input
         * @param tracker - tracker
         */
        @Override
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("name : ");
            String desc = input.ask("desc : ");
            tracker.add(new Item(name, desc));
        }

        /**
         * Info.
         * @return tag
         */

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Add new Item");
        }
    }

    /**
     * ShowItem.
     */
    private class ShowItem implements UserAction {
        /**
         * Return key.
         * @return - key
         */
        @Override
        public int key() {
            return 1;
        }

        /**
         * Execute.
         * @param input - input
         * @param tracker - tracker
         */
        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("-------------------------");
            System.out.println("--------PRINT ITEM-------");
            System.out.println("-------------------------");
            for (Item item : tracker.findAll()) {
                System.out.println(String.format("id: %s name: %s desc: %s", item.getId(), item.getName(), item.getDesc()));
            }
            System.out.println("-------------------------");
        }

        /**
         * Info.
         * @return tag
         */
        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Show all items");
        }
    }

    /**
     * EditItem.
     */
    private class EditItem implements UserAction {
        /**
         * Return key.
         * @return key
         */
        @Override
        public int key() {
            return 2;
        }

        /**
         * Execute.
         * @param input - input
         * @param tracker - tracker
         */
        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("id : ");
            String name = input.ask("name : ");
            String desc = input.ask("desc : ");
            tracker.add(new Item(name, desc, id));
        }

        /**
         * Info.
         * @return tag
         */
        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Edit item");
        }
    }

    /**
     * DelItem.
     */
    private class DelItem implements UserAction {
        /**
         * Return key.
         * @return
         */
        @Override
        public int key() {
            return 3;
        }

        /**
         * Execute.
         * @param input - input
         * @param tracker - tracker
         */
        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("id : ");
            tracker.delete(new Item(id));
        }

        /**
         * Info.
         * @return tag
         */
        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Delete item");
        }
    }

    /**
     * FindItemById.
     */
    private class FindItemById implements UserAction {
        /**
         * Return key.
         * @return key
         */
        @Override
        public int key() {
            return 4;
        }

        /**
         * Execute.
         * @param input - input
         * @param tracker - tracker
         */
        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("id : ");
            System.out.println(tracker.findById(id).toString());
        }

        /**
         * Info.
         * @return
         */
        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Find item by Id");
        }
    }

    /**
     * FindItemByName.
     */
    private class FindItemByName implements UserAction {
        /**
         * Return key.
         * @return key
         */
        @Override
        public int key() {
            return 5;
        }

        /**
         * Execute.
         * @param input - input
         * @param tracker - tracker
         */
        @Override
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("name : ");
            for (Item item : tracker.findByName(name)) {
                System.out.println(item.toString());
            }
        }

        /**
         * Info.
         * @return tag
         */
        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Find items by name");
        }
    }

    /**
     * ExitProgram.
     */
    private class ExitProgram implements UserAction {
        /**
         * Return key.
         * @return - key
         */
        @Override
        public int key() {
            return 6;
        }

        /**
         * Execute.
         * @param input - input
         * @param tracker - tracker
         */
        @Override
        public void execute(Input input, Tracker tracker) {
            System.exit(0);
        }

        /**
         * Info.
         * @return tag
         */
        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Exit Program");
        }
    }

}
