package kochetov;

import java.util.*;

/**
 * MyTree.
 * Created by Сергей on 13.04.2017.
 */
public class MyTree<E> {
    /**
     * Root.
     */
    private MyLeaf<E> root;

    /**
     * Size.
     */
    private int size = 0;
    /**
     * Elements tree.
     */
    private List<MyLeaf<E>> elements = new LinkedList<>();

    /**
     * Add to root.
     * @param value - value
     */
    public void addChild(E value) {
        this.size++;
        this.addChild(root, value);
    }

    /**
     * Getter size.
     * @return size length tree
     */
    public int size() {
        return this.size;
    }

    /**
     * Add to root.
     * @param parent - root
     * @param value - value
     */
    private void addChild(MyLeaf<E> parent, E value) {
     if (this.root == null) {
         this.root = new MyLeaf<>(null, value);
         this.elements.add(this.root);
     } else if (parent != null) {
         if (parent.left == null) {
             parent.left = new MyLeaf<>(parent, value);
             this.elements.add(parent.left);
         } else if (parent.right == null) {
             parent.right = new MyLeaf<>(parent, value);
             this.elements.add(parent.left);
         } else if (this.size % 2 == 0) {
             addChild(parent.left, value);
         } else {
             addChild(parent.right, value);
         }
     }
    }
    /**
     * Get all children for root.
     * @return children list
     */
    public List<E> getChildren() {
        return this.getList(this.root);

    }
    /**
     * Get all children for leaf.
     * @param leaf starting MyLeaf
     * @return children list
     */
    private List<E> getList(MyLeaf<E> leaf) {
        List<E> result = new ArrayList<E>();
        result.add(leaf.value);
        if (leaf.left != null) {
            result.addAll(this.getList(leaf.left));
        }
        if (leaf.right != null) {
            result.addAll(this.getList(leaf.right));
        }
        return result;
    }

    /**
     * Find element tree by value.
     * @param value - value
     * @return element
     */
    public MyLeaf<E> findElement(E value) {
        MyLeaf<E> result = null;
        if (value != null && this.root != null) {
           result = this.findElement(this.root, value);
        }
        return result;
    }

    /**
     * Recursive method for find element by MyTree.
     * @param parent - parent
     * @param value - value
     * @return
     */
    private MyLeaf<E> findElement(MyLeaf parent, E value) {
        MyLeaf<E> result = null;
        if (parent.value.equals(value)) {
            result = parent;
        } else {
            if (parent.left != null) {
                result = this.findElement(parent.left, value);
            }
            if (parent.right != null && parent.left == null) {
                result = this.findElement(parent.right, value);
            }
        }
        return result;

    }


    /**
     * tree is balance?
     * @return true or false
     */
    public boolean treeIsBalance() {
        return this.treeIsBalance(this.root);
    }

    /**
     * Recursive method for tree is balance.
     * @param leaf - leaf
     * @return result
     */
    private boolean treeIsBalance(MyLeaf<E> leaf) {
        boolean result = true;
            if (leaf != null) {

                if ((leaf.left != null && leaf.right == null) ||
                        (leaf.right != null && leaf.left == null)) {
                    return false;
                }
                result = (treeIsBalance(leaf.left) & treeIsBalance(leaf.right));
            }
        return result;
    }

    /**
     * MyLeaf.
     * @param <E> generic
     */
   class MyLeaf<E> {
        /**
         * Parent.
         */
        MyLeaf<E> parent;
        /**
         * Left.
         */
        MyLeaf<E> left;
        /**
         * Right.
         */
        MyLeaf<E> right;
        /**
         * Value.
         */
        E value;
        /**
         * Constructor.
         * @param parent - parent leaf
         * @param value - value
         */
        public MyLeaf(MyLeaf<E> parent, E value) {
            this.parent = parent;
            this.value = value;
        }

       /**
        * toString.
        * @return string
        */
       @Override
       public String toString() {
           return String.format("MyLeaf{%s}", value);
       }
   }
}
