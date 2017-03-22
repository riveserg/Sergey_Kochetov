package ru.job4j.tracker;
/**
 * StartUI.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class StartUI {


    /*
    private Input input;
    private Tracker tracker = new Tracker();

    public StartUI(Input input) {
        this.input = input;
    }

    public void init() {
            String name;
            String desc;
            String id;
            input.print("Print menu");
            switch (input.ask("Select: ")) {
                case "0":
                    name = input.ask("name :");
                    desc = input.ask("desc :");
                    id = input.ask("id : ");
                    tracker.add(new Item(name, desc, id));
                    break;
                case "1":
                    for (Item item : tracker.getAll()) {
                        System.out.println(item.toString());
                    }
                    System.out.println("------------------");
                    break;
                case "2":
                    name = input.ask("name :");
                    desc = input.ask("desc :");
                    id = input.ask("id : ");
                    tracker.update(new Item(name, desc, id));
                    break;
                case "3":
                    name = input.ask("name :");
                    desc = input.ask("desc :");
                    id = input.ask("id : ");
                    tracker.delete(new Item(name, desc, id));
                    break;
                case "4":
                    id = input.ask("id : ");
                    System.out.println(tracker.findById(id).toString());
                    break;
                case "5":
                    name = input.ask("name : ");
                    for (Item item : tracker.findByName(name)) {
                        System.out.println(item.toString());
                    }
                    System.out.println("------------------");
                    break;
                case "6":
                    System.exit(0);
            }
            init();

    }

    public static void main(String[] args) {
        //Input input = new StubInput(new String[] {"create stub task"});
        Input input = new ConsoleInput();
        new StartUI(input).init();
    }

*/




























}
