package ru.job4j.tracker;
/**
 * StartUI.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class StartUI {
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

    /** Print.
     *  print the user menu Tracker
     * @param data
     */
    public void print(String data) {
        if (data.equals("Print menu")) {
            String[] textMenu = {"0. Add new Item", "1. Show all items",
                    "2. Edit item", "3. Delete item", "4. Find item by Id",
                    "5. Find items by name", "6. Exit Program"};
            for (String text : textMenu) {
                System.out.println(text);
            }
        } else {
            System.out.println(data);
        }
    }

    /**
     *  Method initial our tracer.
     */
    public void init() {
            String name;
            String desc;
            String id;
            boolean isWork = true;

            while (isWork) {
                this.print("Print menu");
                switch (input.ask("Select: ")) {
                    case "0":
                        name = input.ask("name : ");
                        desc = input.ask("desc : ");
                        tracker.add(new Item(name, desc));
                        break;
                    case "1":
                        for (Item item : tracker.findAll()) {
                            print(String.format("id: %s name: %s desc: %s", item.getId(), item.getName(), item.getDesc()));
                        }
                       print("------------------");
                        break;
                    case "2":
                        id = input.ask("id : ");
                        name = input.ask("name : ");
                        desc = input.ask("desc : ");
                        tracker.update(new Item(name, desc, id));
                        break;
                    case "3":
                        id = input.ask("id : ");
                        tracker.delete(new Item(id));
                        break;
                    case "4":
                        id = input.ask("id : ");
                        print(tracker.findById(id).toString());
                        break;
                    case "5":
                        name = input.ask("name : ");
                        for (Item item : tracker.findByName(name)) {
                            print(item.toString());
                        }
                        print("------------------");
                        break;
                    case "6":
                        isWork = false;
                }
            }


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
