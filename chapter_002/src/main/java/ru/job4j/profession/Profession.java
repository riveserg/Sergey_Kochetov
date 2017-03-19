package ru.job4j.profession;

/**
 * Profession.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class Profession {
    /**
     *  Name.
     */
    private String name;
    /**
     *  Age.
     */
    private int age;

    /**
     * Human says text.
     * @param text - tezt
     * @return result
     */
    public String say(String text){
        return String.format("Say: %s", text);
    }

    /**
     *  Human says.
     * @return I am a student
     */
    public String say(){
        return String.format("Я студент");
    }

    /**
     *  Constructor.
     * @param name - name
     * @param age - age
     */
    public Profession(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     *  Getter name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter age.
     * @return age
     */
    public int getAge() {
        return age;
    }
}
