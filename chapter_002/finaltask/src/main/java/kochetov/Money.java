package kochetov;
/**
 * Money.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class Money {
    /**
     * Array coins.
     */
    private  int[] coinsNom;

    /**
     * Constructor.
     * @param coinsNom - array coins
     */

    public Money(int[] coinsNom) {
        this.coinsNom = coinsNom;
    }

    /**
     * Method returns the possible coin values.
     * @param money - money
     */
    public void getCountOfWays(int money) {
        getCountOfWays(money, 0, "");
    }

    /**
     * Method returns the possible coin values.
     * @param money - money
     * @param indexOfCoin - index array coins
     * @param str - transmitted string
     */
    private void getCountOfWays(int money, int indexOfCoin, String str) {
        if (money < 0) return;
        if (money == 0) {
            System.out.println(str);
            return;
        }
        for (int i = indexOfCoin; i <this.coinsNom.length; i++) {
            StringBuilder sb = new StringBuilder(str);
            getCountOfWays(money - this.coinsNom[i], i, sb.append(this.coinsNom[i]).toString());
        }
    }
    /**
     * Main.
     * @param args - args
     */
    public static void main(String[] args) {
        Money coins = new Money(new int[] {1, 2, 5, 10, 25, 50});
        coins.getCountOfWays(200);

    }

}