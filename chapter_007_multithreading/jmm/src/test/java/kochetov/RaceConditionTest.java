package kochetov;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * RaceConditionTest.
 * Created by Сергей on 23.04.2017.
 */
public class RaceConditionTest {
    /**
     * Test.
     */
    @Test
    public void whenRun() {
        RaceCondition rc = new RaceCondition();
        rc.execute();
    }

}