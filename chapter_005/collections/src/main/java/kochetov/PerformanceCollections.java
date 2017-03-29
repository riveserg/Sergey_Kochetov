package kochetov;

import java.util.Collection;
import java.util.Iterator;
/**
 * PerformanceCollections.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class PerformanceCollections {
    /**
     * Method add amount elements.
     * @param collection - collection
     * @param line - data
     * @param amount - amount
     * @return execution time im ms
     */
    public long add(Collection<String> collection, String line, int amount) {
        final long startTime = System.currentTimeMillis();
        for (int i = 0; i < amount; i++) {
            collection.add(String.format("%s + %d",line, i));
        }
        return (System.currentTimeMillis() - startTime);
    }
    /**
     * Method delete amount elements.
     * @param collection - collection
     * @param line - data
     * @param amount - amount
     * @return execution time in ms
     */
    public long delete(Collection<String> collection, int amount) {
        final long startTime = System.currentTimeMillis();
        Iterator<String> it = collection.iterator();
        for (int i = 0; i < amount; i++) {
            if (it.hasNext()) {
                it.next();
                it.remove();
            }
        }
        return (System.currentTimeMillis() - startTime);
    }
}
