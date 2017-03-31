package kochetov;

/**
 * User.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class User {
    /**
     * id.
     */
    private int id;
    /**
     * name.
     */
    private String name;
    /**
     * city.
     */
    private String city;

    /**
     * Constructor.
     * @param id - id
     * @param name - name
     * @param city - city
     */
    public User(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    /**
     *  Getter.
     * @return id
     */
    public int getId() {
        return id;
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
     * @return city
     */
    public String getCity() {
        return city;
    }
}
