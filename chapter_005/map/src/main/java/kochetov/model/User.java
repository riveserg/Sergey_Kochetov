package kochetov.model;

import java.util.Calendar;

/**
 * User.
 * Created by Сергей on 09.04.2017.
 */
public class User {
    /**
     * Name.
     */
    private final String name;
    /**
     * Children.
     */
    private final int children;
    /**
     * Birthday.
     */
    private final Calendar birthday;

    /**
     * Constructor.
     * @param name - name
     * @param children - children
     * @param birthday - birthday
     */
    public User(final String name, final int children, final Calendar birthday) {
        this.name = name;
        this.children = children;
        this.birthday = birthday;
    }

    /**
     * Getter.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter.
     * @return children
     */
    public int getChildren() {
        return children;
    }

    /**
     * Getter.
     * @return birthday
     */
    public Calendar getBirthday() {
        return birthday;
    }

    /**
     * hashCode.
     * @return hashcode.
     */
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + children;
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        return result;
    }

    /**
     * Equals.
     * @param o - object
     * @return o == this?
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (children != user.children) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        return birthday != null ? birthday.equals(user.birthday) : user.birthday == null;
    }
}
