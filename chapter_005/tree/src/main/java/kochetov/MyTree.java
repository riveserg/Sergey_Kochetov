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
     * List of children.
     */
    private List<MyTree<E>> children;
    /**
     * Size.
     */
    private int size = 0;

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
     } else if (parent != null) {
         if (parent.left == null) {
             parent.left = new MyLeaf<>(parent, value);
         } else if (parent.right == null) {
             parent.right = new MyLeaf<>(parent, value);
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

    private class MyLeaf<E> {
        /**
         * Parent.
         */
        private MyLeaf<E> parent;
        /**
         * Left.
         */
        private MyLeaf<E> left;
        /**
         * Right.
         */
        private MyLeaf<E> right;
        /**
         * Value.
         */
        private E value;
        /**
         * Constructor.
         * @param parent - parent leaf
         * @param value - value
         */
        public MyLeaf(MyLeaf<E> parent, E value) {
            this.parent = parent;
            this.value = value;
        }
    }
}
