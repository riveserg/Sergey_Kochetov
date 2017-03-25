package kochetov;

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
     *  Universal experience.
     */
    private int experience;

    /**
     * Human says text.
     * @param text - tezt
     * @return result
     */
    public String say(String text) {
        return String.format("Say: %s", text);
    }

    /**
     *  Human says.
     * @return I am a student
     */
    public String say() {
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
        this.experience = 0;
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

    /**
     * Getter experience.
     * @return experience
     */
    public int getExperience() {
        return experience;
    }

    /**
     * Setter experience.
     * @param experience - experience
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }
}
