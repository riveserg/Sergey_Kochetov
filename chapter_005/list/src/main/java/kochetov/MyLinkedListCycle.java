package kochetov;

/**
 * MyLinkedListCycle.
 * Created by Сергей on 08.04.2017.
 */
public class MyLinkedListCycle<T> {
    /**
     * first.
     */
    Node first = new Node(1);
    /**
     * two.
     */
    Node two = new Node(2);
    /**
     * third.
     */
    Node third = new Node(3);
    /**
     * four.
     */
    Node four = new Node(4);

    /**
     * Method to determine the cyclical nature of our list.
     * @param first - element list
     * @return is cyclic or not (true/false)
     */
    public boolean hasCycle(Node first) {
        if (first != null) {
            return hasCycle(first.next, first);
        } else {
            return false;
        }
    }

    /**
     * Method to determine the cyclical nature of our list.
     * @param first - element list
     * @param next - recursive first element
     * @return is cyclic or not (true/false)
     */
    private boolean hasCycle(Node first, Node next) {
        boolean result = false;
        if (first != null) {
            if(next == first.next) {
                result = true;
            } else {
                result = hasCycle(first.next, next);
            }
        }
           return result;
    }

    /**
     * The method is initiated by valid data.
     */
     public void initValidData() {
        first.next = two;
        two.next = third;
        third.next = four;
        four.next = first;
    }
    /**
     * The method is initiated by not valid data.
     */
    public void initNotValidData() {
        first.next = two;
        two.next = third;
        third.next = four;
        //four.next = first;
    }

    /**
     * Class stores a value and a link to the next element.
     * @param <T> - value
     */
    private class Node<T> {
        /**
         * Value.
         */
        T value;
        /**
         * Next element.
         */
        Node<T> next;

        /**
         * Constructor.
         * @param value - value
         */
        public Node(T value) {
            this.value = value;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        MyLinkedListCycle list = new MyLinkedListCycle();
        System.out.println(list.hasCycle(list.first));
    }
}
