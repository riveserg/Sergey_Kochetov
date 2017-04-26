package kochetov.count;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Сергей on 26.04.2017.
 */
public class CountTest {

    @Test
    public void whenRunMainMethodThenIsOk() {
        Count count = new Count();
        count.execute();
    }

}