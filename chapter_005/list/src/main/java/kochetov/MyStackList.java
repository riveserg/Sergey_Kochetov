package kochetov;

/**
 * MyStackList.
 * Created by Сергей on 08.04.2017.
 */
public class MyStackList<E> extends MyLinkedList<E> {
    /**
     * Return last element.
     * @return
     */
    public E peek() {
        return this.get(this.size() - 1);
    }

    /**
     * Delete last element and return it.
     * @return last element
     */
    public E pop() {
        E result = this.get(this.size() - 1);
        this.remove(this.size() - 1);
        return result;
    }

    /**
     * Add element for stack.
     * @param e - element
     */
    public void push(E e) {
        this.add(e);
    }
}
