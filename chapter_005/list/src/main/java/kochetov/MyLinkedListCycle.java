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
     * @param node - element list
     * @param first - recursive first element
     * @return is cyclic or not (true/false)
     */
    private boolean hasCycle(Node node, Node first) {
        boolean result = false;
        if (node != null) {
            if(first == node.next) {
                result = true;
            } else {
                result = hasCycle(node.next, first);
            }
        }
           return result;
    }

    /**
     * Class stores a value and a link to the next element.
     * @param <T> - value
     */
    class Node<T> {
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
}
