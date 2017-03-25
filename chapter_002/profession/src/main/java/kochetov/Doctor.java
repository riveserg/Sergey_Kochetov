package kochetov;

/**
 * Doctor.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class Doctor extends Profession {

    /**
     *  Constructor.
     * @param name - name
     * @param age - age
     */
    public Doctor(String name, int age) {
        super(name, age);
        this.setExperience(0);
    }

    /**
     *  Doctor treats patients.
     * @param pacient - pacient
     * @return result
     */
    public String heal(Profession pacient) {
        if (pacient instanceof Doctor) {
            this.setExperience(getExperience() - 1);
        } else {
            this.setExperience(getExperience() + 1);
        }
        return String.format("Doctor %s heal %s", this.getName(), pacient.getName());
    }
    /**
     *   Doctor says what he does.
     * @return
     */
    @Override
    public String say() {
        return String.format("Я доктор %s", this.getName());
    }

}
