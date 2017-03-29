package kochetov;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 * PerformanceCollectionsTest.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class PerformanceCollectionsTest {
    /**
     * amount.
     */
    private final int  amount = 100_000;
    /**
     * Test add and remove for ArrayList.
     */
    @Test
    public void whenAddAndDeleteArrayList() {
        ArrayList<String> list = new ArrayList<String>();
        PerformanceCollections pc = new PerformanceCollections();
        long result = pc.add(list, "test", amount);
        System.out.println(String.format("Add to ArrayList: %d", result));
        result = pc.delete(list, amount);
        System.out.println(String.format("Remove from ArrayList: %d", result));
    }
    /**
     * Test add and remove for LinkedList.
     */
    @Test
    public void whenAddAndDeleteLinkedList() {
        LinkedList<String> list = new LinkedList<String>();
        PerformanceCollections pc = new PerformanceCollections();
        long result = pc.add(list, "test", amount);
        System.out.println(String.format("Add to LinkedList: %d", result));
        result = pc.delete(list, amount);
        System.out.println(String.format("Remove from LinkedList: %d", result));
    }
    /**
     * Test add and remove for TreeSet.
     */
    @Test
    public void whenAddAndDeleteTreeSet() {
        TreeSet<String> set = new TreeSet<String>();
        PerformanceCollections pc = new PerformanceCollections();
        long result = pc.add(set, "test", amount);
        System.out.println(String.format("Add to TreeSet: %d", result));
        result = pc.delete(set, amount);
        System.out.println(String.format("Remove from TreeSet: %d", result));
    }
}
