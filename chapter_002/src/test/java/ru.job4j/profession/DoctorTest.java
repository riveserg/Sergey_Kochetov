package ru.job4j.profession;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * DoctorTest.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class DoctorTest {
    /**
     *  Test say().
     */
    @Test
    public void whenDoctorSayThenIsResult() {
        Profession doctor = new Doctor("name", 20);
        String result = doctor.say();
        String except = "Я доктор name";
        assertThat(result, is(except));
    }
    /**
     *  Test heal noname().
     */
    @Test
    public void whenDoctorHealNonameThenIsResult() {
        Doctor doctor = new Doctor("name", 20);
        Profession pacient = new Profession("noname", 22);
        String result = doctor.heal(pacient);
        int resultExperienceMedic = 1;
        int exceptExperienceMedic = doctor.getExperienceMedic();
        String except = String.format("Doctor %s heal %s", "name", "noname");
        assertThat(resultExperienceMedic, is(exceptExperienceMedic));
        assertThat(result, is(except));
    }
    /**
     *  Test heal doctor().
     */
    @Test
    public void whenDoctorHealDoctorThenIsResult() {
        Doctor doctor = new Doctor("doctor", 20);
        Doctor pacient = new Doctor("doctorPacient", 22);
        String result = doctor.heal(pacient);
        String except = String.format("Doctor %s heal %s", "doctor", "doctorPacient");
        int resultExperienceMedic = -1;
        int exceptExperienceMedic = doctor.getExperienceMedic();

        assertThat(resultExperienceMedic, is(exceptExperienceMedic));

    }


}
