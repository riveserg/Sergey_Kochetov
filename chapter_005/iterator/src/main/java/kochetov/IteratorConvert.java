package kochetov;

import java.util.*;

/**
 * Created by Сергей on 03.04.2017.
 */
public class IteratorConvert implements Converter, Iterator<Integer> {
    /**
     * All iterators.
     */
    private Iterator<Iterator<Integer>> iterator;
    /**
     * Current iterator.
     */
    private Iterator<Integer> currentIterator;

    /**
     * Method returns a single iterator from multiple.
     * @param it  - iterator of iterators.
     * @return single iterator
     */
    @Override
    public Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
        this.iterator = it;
        if (this.iterator.hasNext()) {
            this.currentIterator = this.iterator.next();
        }
        return this;
    }

    /**
     * hasnNext.
     * @return result
     */
    @Override
    public boolean hasNext() {
        return this.currentIterator.hasNext() || this.iterator.hasNext();
    }

    /**
     * Method return next element in current iterator.
     * @return next number
     */
    @Override
    public Integer next() {
        Integer result;
        if (this.currentIterator.hasNext()) {
            result = this.currentIterator.next();
        } else if (this.iterator.hasNext()) {
            this.currentIterator = this.iterator.next();
            result = this.currentIterator.next();
        } else {
            throw new NoSuchElementException();
        }
        return result;
    }
}
