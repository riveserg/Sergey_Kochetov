package kochetov.model;

/**
 * Account.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class Account {
    /**
     * How much money is in the account.
     */
    private double value;
    /**
     * Bank details.
     */
    private String requisites;

    /**
     * Constructor.
     * @param value - value
     * @param requisites - requisites
     */
    public Account(String requisites) {
        this.value = 0;
        this.requisites = requisites;
    }

    /**
     * Getter.
     * @return value
     */
    public double getValue() {
        return value;
    }

    /**
     * Getter.
     * @return requisites
     */
    public String getRequisites() {
        return requisites;
    }

    /**
     * Method to add money on account.
      * @param amount
     */
    public void addMoney(double amount) {
        this.value += amount;
    }

    /**
     * Method to write off money on account.
     * @param amount
     */
    public void writeOffMoney(double amount) {
        this.value -= amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        return requisites.equals(account.requisites);
    }

    @Override
    public int hashCode() {
        return requisites.hashCode();
    }

    /**
     * equals.
     * @param o - object
     * @return result
     */

    @Override
    public String toString() {
        return String.format("Account{value=%.2f, requisites='%s'", this.value, this.requisites);

    }
}
