package kochetov;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * ReadFileTest.
 * Created by Сергей on 20.04.2017.
 */
public class ReadFileTest {
    /**
     * Test.
     */
    @Test
    public void whenRunTwoThreadThenPrintResult() {
       ReadFile read = new ReadFile("asddd asdasd asdasdsf dsf sdf sad fsdf sdfsadf sdfasdfs dfsadfsd fsadfsdfsd fsdfsdf sdfsdafsdf sadfsdgfdsg sadfgfdhg asdfgsdaf sdgfdsgsad fsdf sdf");
        read.main();

    }

}