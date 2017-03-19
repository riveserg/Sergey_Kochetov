package ru.job4j.profession;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * TeacherTest.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class TeacherTest {
    /**
     *  Test say().
     */
    @Test
    public void whenTeacherSayThenIsResult() {
        Profession teacher = new Teacher("nameTeacher", 20);
        String result = teacher.say();
        String except = "Я учитель nameTeacher";
        assertThat(result, is(except));
    }
    /**
     *  Test teach().
     */
    @Test
    public void whenDoctorHealNonameThenIsResult() {
        Teacher teacher = new Teacher("prof", 20);
        String result = teacher.teach("Java", new Profession("student1", 19), new Profession("student2", 19));
        int resultExperienceTeacher = 12;
        int exceptExperienceTeacher = teacher.getExperienceTeacher();
        String except = String.format("Професор prof учит student1 предмету Java%sПрофесор prof учит student2 предмету Java%s", System.getProperty("line.separator"), System.getProperty("line.separator"));
        assertThat(resultExperienceTeacher, is(exceptExperienceTeacher));
        assertThat(result, is(except));
    }
}
