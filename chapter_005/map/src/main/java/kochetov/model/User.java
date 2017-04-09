package kochetov.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

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

}
