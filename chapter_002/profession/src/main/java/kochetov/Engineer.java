package kochetov;

/**
 * Engineer.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class Engineer extends Profession {

    /**
     *  Constructor.
     * @param name - name engineer
     * @param age - age engineer
     */
    public Engineer(String name, int age) {
        super(name, age);
        this.setExperience(age < 30 ? 0 : 10);
    }

    /**
     * Engineer work.
     * @param component - working part
     * @return reports working engineer
     */
    public String work(String component) {
        this.setExperience(this.getExperience() + 1);
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

}
