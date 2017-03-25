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
public class ProfessionTest {
    /**
     *  Test say().
     */
    @Test
    public void whenProfessionSayThenIsResult() {
        Profession profession = new Profession("name", 20);
        final String result = profession.say();
        final String except = "Я студент";
        assertThat(result, is(except));
    }
    /**
     *  Test say(text).
     */
    @Test
    public void whenProfessionSayTextThenTextIs() {
        Profession profession = new Profession("name", 20);
        final String result = profession.say("test");
        final String except = "Say: test";
        assertThat(result, is(except));
    }

}

