package kochetov.start;

import java.util.ArrayList;
import java.util.List;

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
    private List<UserAction> actions = new ArrayList<>();

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
        this.actions.add(action);
    }

    /**
     * Fill action.
     */
    public void fillAction() {

        addAction(new AddItem("Add new Item", 0));
        addAction(new ShowItem("Show all items", 1));
        addAction(new EditItem("Edit item", 2));
        addAction(new DelItem("Delete item", 3));
        addAction(new FindItemById("Find item by Id", 4));
        addAction(new FindItemByName("Find items by name", 5));
        addAction(new ExitProgram("Exit Program", 6));

    }

    /**
     *  Select.
     * @param key - key
     */
    public void select(int key) {
        this.actions.get(key).execute(this.input, this.tracker);
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
    private class AddItem extends BaseAction {
        /**
         * Constructor.
         *
         * @param name - name
         */
        public AddItem(String name, int key) {
            super(name, key);
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
    }
    /**
     * ShowItem.
     */
    private class ShowItem extends BaseAction {

        /**
         * Constructor.
         *
         * @param name - name
         * @param key - key
         */
        public ShowItem(String name, int key) {
            super(name, key);
        }

        /**
         * Execute.
         * @param input - input
         * @param tracker - tracker
         */
        @Override
        public void execute(Input input, Tracker tracker) {

            for (Item item : tracker.findAll()) {
                System.out.println(String.format("id: %s name: %s desc: %s", item.getId(), item.getName(), item.getDesc()));
            }
        }
    }

    /**
     * EditItem.
     */
    private class EditItem extends BaseAction {

        /**
         * Constructor.
         *
         * @param name - name
         * @param key  - key
         */
        public EditItem(String name, int key) {
            super(name, key);
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
            tracker.update(new Item(name, desc, id));
        }
    }

    /**
     * DelItem.
     */
    private class DelItem extends BaseAction {

        /**
         * Constructor.
         *
         * @param name - name
         * @param key  - key
         */
        public DelItem(String name, int key) {
            super(name, key);
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

    }

    /**
     * FindItemById.
     */
    private class FindItemById extends BaseAction {

        /**
         * Constructor.
         *
         * @param name - name
         * @param key  - key
         */
        public FindItemById(String name, int key) {
            super(name, key);
        }

        /**
         * Execute.
         *
         * @param input   - input
         * @param tracker - tracker
         */
        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("id : ");
            System.out.println(tracker.findById(id).toString());
        }
    }

    /**
     * FindItemByName.
     */
    private class FindItemByName extends BaseAction {

        /**
         * Constructor.
         *
         * @param name - name
         * @param key  - key
         */
        public FindItemByName(String name, int key) {
            super(name, key);
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
    }

    /**
     * ExitProgram.
     */
    private class ExitProgram extends BaseAction {

        /**
         * Constructor.
         *
         * @param name - name
         * @param key  - key
         */
        public ExitProgram(String name, int key) {
            super(name, key);
        }

        /**
         * Execute.
         * @param input - input
         * @param tracker - tracker
         */
        @Override
        public void execute(Input input, Tracker tracker) {

        }

    }
}