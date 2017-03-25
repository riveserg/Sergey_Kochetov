package kochetov;

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
        final String result = teacher.say();
        final String except = "Я учитель nameTeacher";
        assertThat(result, is(except));
    }
    /**
     *  Test teach().
     */
    @Test
    public void whenTeacherTeachesStudentsThenIsResult() {
        Teacher teacher = new Teacher("prof", 20);
        final String result = teacher.teach("Java", new Profession("student1", 19), new Profession("student2", 19));

        final String except = String.format("Професор prof учит student1 предмету Java%sПрофесор prof учит student2 предмету Java%s", System.getProperty("line.separator"), System.getProperty("line.separator"));

        assertThat(result, is(except));
    }
    /**
     *  Test teach().
     */
    @Test
    public void whenTeacherTeachesThenGainExperience() {
        Teacher teacher = new Teacher("prof", 20);
        final String result = teacher.teach("Java", new Profession("student1", 19), new Profession("student2", 19));
        final int resultExperienceTeacher = 12;
        final int exceptExperienceTeacher = teacher.getExperience();
        assertThat(resultExperienceTeacher, is(exceptExperienceTeacher));

    }
}
