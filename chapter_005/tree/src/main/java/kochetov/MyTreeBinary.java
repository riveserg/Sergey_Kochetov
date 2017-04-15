package kochetov;

/**
 * MyTreeBinary.
 * Created by Сергей on 15.04.2017.
 */
public class MyTreeBinary<E extends Comparable<E>> {
    /**
     * Value of tree.
     */
    private E value;
    /**
     * Left child.
     */
    private MyTreeBinary<E> left;
    /**
     * Right child.
     */
    private MyTreeBinary<E> right;

    /**
     * Constructor.
     * @param value - value
     */
    public MyTreeBinary(E value) {
        this.value = value;
    }

    /**
     * Add element to MyTreeBinary.
     * @param value - value
     */
    public void insert(E value) {
        if (value == null) {
            return;
        }
        MyTreeBinary<E> parent;
        MyTreeBinary<E> current = this;

       for (;;){
            parent = current;
            if (current.value.compareTo(value) > 0) {
                current = current.left;
                if (current == null) {
                    parent.left = new MyTreeBinary<E>(value);
                    break;
                }
            } else {
                current = current.right;
                if (current == null) {
                    parent.right = new MyTreeBinary<E>(value);
                    break;
                }
            }
        }
    }

    /**
     * Find element binary tree by value.
     * @param value - value
     * @return element or null if element not found
     */
    public MyTreeBinary<E> findByValue(E value) {
        MyTreeBinary<E> result = null;
        MyTreeBinary<E> current = this;
        while (current != null) {
            if (current.value == value) {
                result = current;
                break;
            } else if (current.value.compareTo(value) > 0) {
                current = current.left;
            } else if (current.value.compareTo(value) < 0) {
                current = current.right;
            }
        }
        return result;
    }

    /**
     * Method for test.
     * @return tag
     */
    @Override
    public String toString() {
        return String.format("MyTreeBinary{%s}", value);
    }
}
