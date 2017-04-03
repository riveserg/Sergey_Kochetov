package kochetov;

import java.util.Iterator;

/**
 * Created by Сергей on 03.04.2017.
 */
public interface Converter {
    /**
     * Method convert multiple iterators to one iterator.
     * @param it  - iterator of iterators.
     * @return result iterator.
     */
    Iterator<Integer> convert(Iterator<Iterator<Integer>> it);
}
