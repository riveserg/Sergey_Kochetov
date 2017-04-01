package kochetov.model;

/**
 * User.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class User {
    /**
     * Name user.
     */
    private String name;
    /**
     * Passport user.
     */
    private String passport;

    /**
     * Constructor
     * @param name - name
     * @param passport - passport
     */
    public User(String name, String passport) {
        this.name = name;
        this.passport = passport;
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
     * @return passport
     */
    public String getPassport() {
        return passport;
    }

    /**
     * equals.
     * @param o - object
     * @return result
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        User user = (User) o;

        if (name != null ? !name.equals(user.name) : user.name != null) {
            return false;
        }
        return passport != null ? passport.equals(user.passport) : user.passport == null;
    }

    /**
     * hashCode.
     * @return result int
     */
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (passport != null ? passport.hashCode() : 0);
        return result;
    }
}
