package kochetov;

/**
 * Teacher.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class Teacher extends Profession {

    /**
     *  Constructor.
     * @param name - name teacher
     * @param age - age teacher
     */
    public Teacher(String name, int age) {
        super(name, age);
        this.setExperience(getExperience() + 10);
    }

    /**
     *  Teacher teaches students.
     * @param course - curse
     * @param students - array students
     * @return return result string all students
     */
    public String  teach(String course, Profession... students) {
        StringBuilder sb = new StringBuilder();
        for (Profession student : students) {
            sb.append(String.format("Професор %s учит %s предмету %s", this.getName(), student.getName(), course));
            sb.append(System.getProperty("line.separator"));
            this.setExperience(getExperience() + 1);
        }
        return sb.toString();
    }

    /**
     *   Teacher says what he does.
     * @return
     */
    @Override
    public String say() {
        return String.format("Я учитель %s", this.getName());
    }


}
