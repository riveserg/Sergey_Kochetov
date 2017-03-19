package ru.job4j.profession;

/**
 * Doctor.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class Doctor extends Profession {
    /**
     * Experience medic.
     */
    private int experienceMedic;

    /**
     *  Constructor.
     * @param name - name
     * @param age - age
     */
    public Doctor(String name, int age) {
        super(name, age);
        this.experienceMedic = 0;
    }

    /**
     *  Doctor treats patients.
     * @param pacient - pacient
     * @return result
     */
    public String heal(Profession pacient) {
        if (pacient instanceof Doctor) {
            experienceMedic--;
        } else {
            experienceMedic++;
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

    /**
     *  Getter experience medic.
     * @return experience
     */
    public int getExperienceMedic() {
        return experienceMedic;
    }
}
