package ru.job4j.profession;

/**
 * Engineer.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class Engineer extends Profession {
    /**
     * Experience Engineer.
     */
    private int experienceEngineer;

    /**
     *  Constructor.
     * @param name - name engineer
     * @param age - age engineer
     */
    public Engineer(String name, int age) {
        super(name, age);
        this.experienceEngineer = this.getAge() < 30 ? 0 : 10;
    }

    /**
     * Engineer work.
     * @param component - working part
     * @return reports working engineer
     */
    public String work(String component) {
        experienceEngineer++;
        return String.format("Инженер %s строит %s", this.getName(), component);
    }
    /**
     * Engineer says what he does.
     * @return
     */
    @Override
    public String say() {
        return String.format("Я инженер %s", this.getName());
    }
    /**
     *  Getter experience engineer.
     * @return experience
     */
    public int getExperienceEngineer() {
        return experienceEngineer;
    }
}
