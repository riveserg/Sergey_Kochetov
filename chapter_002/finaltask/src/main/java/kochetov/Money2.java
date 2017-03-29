package kochetov;

/**
 * Money2.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class Money2 {
    /**
     * Array coins.
     */
    private  int[] coinsNom;

    /**
     *  Constructor.
     * @param coinsNom - coins
     */
    public Money2(int[] coinsNom) {
        this.coinsNom = coinsNom;
    }

    /**
     * Method returns the possible coin values.
     * @param money - money
     * @return oOo
     */
    public int getCountOfWays(int money) {
            return getCountOfWays(money, 4);
        }

    /**
     * Method returns the possible coin values.
     * @param money - money
     * @param indexOfCoin - index
     * @return oOOo
     */
        private int getCountOfWays(int money, int indexOfCoin) {
            if (money < 0 || indexOfCoin < 0) return 0;
            if (money == 0 || indexOfCoin == 0) return 1;
            return getCountOfWays(money, indexOfCoin - 1) + getCountOfWays(money - this.coinsNom[indexOfCoin], indexOfCoin);
        }

    /**
     * Main.
     * @param args - args
     */
    public static void main(String[] args) {
        Money2 coins2 = new Money2(new int[] {1, 2, 5, 10, 25, 50});
        System.out.println(coins2.getCountOfWays(1000));
    }
}
