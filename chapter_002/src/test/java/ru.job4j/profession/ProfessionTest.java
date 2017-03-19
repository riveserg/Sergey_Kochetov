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
public class ProfessionTest {
    @Test
    public void whenThirdNumberIsGreaterThenTrue() {
        Max max = new Max();
        int result = max.max(10, 5, 15);
        int expected = 15;
        assertThat(result, is(expected));
    }

}

