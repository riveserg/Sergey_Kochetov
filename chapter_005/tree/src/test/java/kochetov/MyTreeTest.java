package kochetov;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * MyTreeTest
 * Created by Сергей on 13.04.2017.
 */
public class MyTreeTest {
    /**
     * Test.
     */
    @Test
    public void whenAddTwoElementThenSizeIsTwo() {
        MyTree tree = new MyTree();
        tree.addChild( "111");
        tree.addChild( "222");

        assertThat(tree.size(), is(2));
    }
    /**
     * Test.
     */
    @Test
    public void whenAddFourElementThenReturnListFourElement() {
        MyTree tree = new MyTree();
        tree.addChild( "111");
        tree.addChild( "222");
        tree.addChild( "333");
        tree.addChild( "444");

        assertThat(tree.getChildren(), is(Arrays.asList("111", "222", "444","333" )));
    }
    /**
     * Test.
     */
    @Test
    public void whenAddFourElementThenFindSecondElement() {
        MyTree tree = new MyTree();
        tree.addChild( "111");
        tree.addChild( "222");
        tree.addChild( "333");
        tree.addChild( "444");

        assertThat(tree.findElement("222").toString(), is("MyLeaf{222}"));
    }
    /**
     * Test.
     */
    @Test
    public void whenAddSevenElementAndCheckTreeIsBalanceThenTreeIsBalance() {
        MyTree tree = new MyTree();
        tree.addChild( "111");
        tree.addChild( "222");
        tree.addChild( "333");
        tree.addChild( "444");
        tree.addChild( "555");
        tree.addChild( "666");
        tree.addChild( "777");


        assertThat(tree.treeIsBalance(), is(true));
    }

    /**
     * Test.
     */
    @Test
    public void whenAddFourElementAndCheckTreeIsBalanceThenTreeIsNotBalance() {
        MyTree tree = new MyTree();
        tree.addChild( "111");
        tree.addChild( "222");
        tree.addChild( "333");
        tree.addChild( "444");

        assertThat(tree.treeIsBalance(), is(false));
    }

}