package kochetov.model;

/**
 * User.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class User implements Comparable<User> {
    /**
     * Name.
     */
    private String name;
    /**
     * Age.
     */
    private int age;

    /**
     * Constructor.
     * @param name - name
     * @param age - age
     */
    public User(String name, int age) {
        this.name = name;
        this.age = age;
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
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * toString.
     * @return string
     */
    @Override
    public String toString() {
        return String.format("User{name %s, age %d}", name, age);
    }

    @Override
    public int compareTo(User o) {
        return this.age - o.getAge();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        User user = (User) o;

        if (age != user.age) {
            return false;
        }
        return name != null ? name.equals(user.name) : user.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
