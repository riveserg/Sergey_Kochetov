package kochetov;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * MyTreeBinaryTest.
 * Created by Сергей on 15.04.2017.
 */
public class MyTreeBinaryTest {
    /**
     * Test.
     */
    @Test
    public void whenAddThreeElementAndFindSecondElementThenIsOk() {
        MyTreeBinary treeBinary = new MyTreeBinary("222");
        treeBinary.insert("111");
        treeBinary.insert("333");
        assertThat(treeBinary.findByValue("111").toString(), is("MyTreeBinary{111}"));
    }
}