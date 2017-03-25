package ru.job4j.paint;


/**
 * Paint.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class Paint {
    /**
     *  Draw Triangle or Square.
     * @param shape - shape
     */
    public void draw(Shape shape) {
        System.out.print(shape.pic());
    }


}
