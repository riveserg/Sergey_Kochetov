package kochetov;

/**
 * MyQueue.
 * Created by Сергей on 08.04.2017.
 */
public class MyQueue<E> extends MyLinkedList<E> {
    /**
     * Add element to MyQueue.
     * @param e - element.
     */
    public void offer(E e) {
        this.add(e);
    }
    /**
     * Get first element from MyQueue.
     * @return first element.
     */
    public E peek() {
        return this.get(0);
    }
    /**
     * Get first element from MyQueue and remove it.
     * @return first element.
     */
    public E poll() {
        E result = this.get(0);
        this.remove(0);
        return result;
    }
}
