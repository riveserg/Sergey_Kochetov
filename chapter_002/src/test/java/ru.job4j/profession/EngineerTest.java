package ru.job4j.profession;

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
        String result = engineer.say();
        String except = "Я инженер nameEngineer";
        assertThat(result, is(except));
    }
    /**
     *  Test work().
     */
    @Test
    public void whenEngineerWorkThenIsResult() {
        Engineer engineer = new Engineer("nameEngineer", 40);
        String result = engineer.work("car");
        String except = "Инженер nameEngineer строит car";
        int resultExperienceEngineer = 11;
        int exceptExperienceEngineer = engineer.getExperienceEngineer();
        assertThat(result, is(except));
        assertThat(resultExperienceEngineer, is(exceptExperienceEngineer));
    }
}
