package kochetov;


/**
 * Created by Сергей on 05.04.2017.
 */
public class SimpleArray<E> {
    /**
     * Array objects.
     */
    private Object[] objects;
    /**
     * Index of last element.
     */
    private int index = 0;

    /**
     * Constructor.
     * @param size
     */
    public SimpleArray(int size) {
        if (size > 0) {
            this.objects = new Object[size];
        }else {
            throw new RuntimeException("Error create");
        }
    }

    /**
     * Adds new value to array objects.
     * @param value - value to add
     */
    public void add(E value) {
        if (index < objects.length) {
            this.objects[index++] = value;
        } else {
            throw new RuntimeException("Error add, there is no place");
        }
    }

    /**
     * Returns value of array objects by position.
     * @param position - position
     * @return value of array
     */
    public E get(int position) {
        if(position >= 0 && position < objects.length) {
            return (E) this.objects[position];
        } else {
            throw new RuntimeException("Error get");
        }

    }

    /**
     * Update value of array by position.
     * @param position - position
     * @param value - new value
     */
    public void update(int position, E value) {
        if(position>= 0 && position < index) {
            this.objects[position] = value;
        } else {
            throw new RuntimeException("Error update");
        }
    }

    /**
     * Delete value of array.
     * @param position - position
     */
    public void delete(int position) {
        if(position >= 0 && position < index) {
            System.arraycopy(objects, position + 1, objects, position, (objects.length - position - 1));
            index--;
        } else {
            throw new RuntimeException("Error delete");
        }
    }
}

