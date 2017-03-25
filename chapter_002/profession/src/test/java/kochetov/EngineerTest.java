package kochetov;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * EngineerTest.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class EngineerTest {
    /**
     *  Test say().
     */
    @Test
    public void whenEngineerSayThenIsResult() {
        Profession engineer = new Engineer("nameEngineer", 20);
        final String result = engineer.say();
        final String except = "Я инженер nameEngineer";
        assertThat(result, is(except));
    }
    /**
     *  Test work().
     */
    @Test
    public void whenEngineerBuildCarThenIsResult() {
        Engineer engineer = new Engineer("nameEngineer", 40);
        final String result = engineer.work("car");
        final String except = "Инженер nameEngineer строит car";
        assertThat(result, is(except));

    }
    /**
     *  Test worker gain experience.
     */
    @Test
    public void whenEngineerWorkThenGainExperience() {
        Engineer engineer = new Engineer("nameEngineer", 40);
        final String result = engineer.work("car");
        final int resultExperienceEngineer = 11;
        final int exceptExperienceEngineer = engineer.getExperience();
        assertThat(resultExperienceEngineer, is(exceptExperienceEngineer));
    }
}
