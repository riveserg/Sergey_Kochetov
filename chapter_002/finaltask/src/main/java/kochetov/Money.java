import java.util.*;

public class Coins {
    /**
     * Coins.
     */
    private static int[] COINS_NOM = {1, 2, 5};

    /**
     * КАК ДО ТАКОГО ДОДУМАТЬСЯ???
     * @param money - money
     * @return result
     */
    public static int getCountOfWays(int money) {
        return getCountOfWays(money, 2);
    }

    /**
     * КАК ДО ТАКОГО ДОДУМАТЬСЯ???
     * @param money -money
     * @param indexOfCoin -index
     * @return result
     */
    private static int getCountOfWays(int money, int indexOfCoin) {
        if (money < 0 || indexOfCoin < 0) return 0;
        if (money == 0 || indexOfCoin == 0) return 1;
        int x1 = getCountOfWays(money, indexOfCoin - 1);
        int x2 = getCountOfWays(money - COINS_NOM[indexOfCoin], indexOfCoin);
        int x3 = x1 + x2;
        return x3;
    }

    /**
     *  Задумка.
     * @param money - money
     * @param index - index
     * @return result
     */
    public static String getCount (int money, int index) {
        if (money < 0 || index < 0) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = money; i >= COINS_NOM[index]; i-=COINS_NOM[index]) {
            sb.append(COINS_NOM[index]);
        }
        int total = money%COINS_NOM[index];
        if (total > 0) {
            sb.append(getCount(total, index - 1));
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    /**
     * rn.
     */
    static Random random = new Random();
    /**
     * set.
     */
    static Set<String> set = new HashSet<>();
    /**
     * list
     */
    static List<String> list;

    /**
     *  Рандом ))).
     * @param money - money
     * @param index - index
     */
    public static void getCount2(int money, int index) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<money; i++) {
            sb.append(1);
        }
        set.add(sb.toString());
        int count = 0;
        int temp;
        while (++count < 1_000_000) {
            sb = new StringBuilder();
            for (int i = money; i > 0; ) {
                temp = random.nextInt(3);
                if (COINS_NOM[temp] <= i) {
                    sb.append(COINS_NOM[temp]);
                    i -= COINS_NOM[temp];
                }
            }
            char[] str2 = sb.toString().toCharArray();
            Arrays.sort(str2);
            set.add(String.valueOf(str2));
        }
        list = new ArrayList<>(set);
        Collections.sort(list);
        for (String str : list) {
            System.out.println(str);
        }
        System.out.println("Test my = " + list.size());
    }

    /**
     * Main.
     * @param args - args
     */
    public static void main(String[] args) {
        getCount2(20, 2);

        System.out.println("Test by inet = " + getCountOfWays(20));
    }

}