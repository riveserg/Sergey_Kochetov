package kochetov;

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
        final String result = doctor.say();
        final String except = "Я доктор name";
        assertThat(result, is(except));
    }
    /**
     *  Test heal noname().
     */
    @Test
    public void whenDoctorHealNonameThenIsResultTag() {
        Doctor doctor = new Doctor("name", 20);
        final String result = doctor.heal(new Profession("noname", 22));
        final String except = String.format("Doctor %s heal %s", "name", "noname");
        assertThat(result, is(except));
    }
    /**
     *  Test heal noname().
     */
    @Test
    public void whenDoctorHealNonameThenGainExperience() {
        Doctor doctor = new Doctor("name", 20);
        final String result = doctor.heal(new Profession("noname", 22));
        final int resultExperienceMedic = 1;
        final int exceptExperienceMedic = doctor.getExperience();
        assertThat(resultExperienceMedic, is(exceptExperienceMedic));
    }

    /**
     *  Test heal doctor treats the doctor.
     */
    @Test
    public void whenDoctorHealDoctorThenReductionExperience() {
        Doctor doctor = new Doctor("doctor", 20);
        final String result = doctor.heal(new Doctor("doctorPacient", 22));
        final int resultExperienceMedic = -1;
        final int exceptExperienceMedic = doctor.getExperience();
        assertThat(resultExperienceMedic, is(exceptExperienceMedic));
    }
}
