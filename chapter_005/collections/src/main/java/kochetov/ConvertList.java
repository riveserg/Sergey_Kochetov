package kochetov;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * ConvertList.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class ConvertList {
    /**
     *  Method toList added arrays to list.
     * @param array - arrays
     * @return result list
     */
    public List<Integer> toList (int[][] array) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result.add(array[i][j]);
            }
        }
        return result;
    }

    /**
     *  Method toArray added list to arrays
     * @param list - list
     * @param rows - rows
     * @return result arrays
     */
    public int[][] toArray (List<Integer> list, int rows) {
        int[][] result = new int[rows][rows];
        Iterator<Integer> it = list.iterator();
        if (rows > 0) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < rows; j++) {
                    if (it.hasNext()) {
                        result[i][j] = it.next();
                    } else {
                        result[i][j] = 0;
                    }
                }
            }
        } else {
            throw new RuntimeException("No valid rows");
        }
        return result;
    }

    /**
     *  Method convert list arrays to one list
     * @param list - list
     * @return result list
     */
    public List<Integer> convert (List<int[]> list){
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int[] arrays = list.get(i);
            for (int array : arrays) {
                result.add(array);
            }
        }
        Collections.sort(result);
        return result;
    }
}
