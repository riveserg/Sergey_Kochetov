package kochetov;

import kochetov.model.User;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Сергей on 04.04.2017.
 */
public class Bank {
    /**
     * SimpleDateFormat.
     */
    private final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    /**
     * Stores the time of entry and exit.
     */
    public Map<String, Boolean> timeVisiting = new TreeMap<>();
    /**
     * List users.
     */
    private List<User> bankCustomers = new ArrayList<User>();

    /**
     * records the time of login of the user.
     * @param user - user
     */
    public void enterBank(User user) {
        if (user == null || this.bankCustomers.contains(user)) {
            System.out.println("+");
            return;
        }
        Date currentDate = new Date();
        if (currentDate.getHours()> 8 && currentDate.getHours() < 23) {
            this.bankCustomers.add(user);
            this.timeVisiting.put(sdf.format(currentDate), true);
        }
    }

    /**
     * records the exit time of the user.
     * @param user - user
     */
    public void exitBank(User user) {
        if (user == null && !this.bankCustomers.contains(user)) {
            return;
        }
        Date currentDate = new Date();
            this.timeVisiting.put(sdf.format(currentDate), false);
    }

    /**
     * The maximum period of time the number of users.
     * @return result period.
     */
    public String periodOfMaxAttendance() {

        int counterMaxAttendance = 0;
        int count = 0;
        String timeStart = "";
        String timeEnd = "";
        for (Map.Entry<String, Boolean> p : this.timeVisiting.entrySet()) {
            if (p.getValue()) {
                count++;
            } else {
                count--;
            }
            if (count > counterMaxAttendance) {
                counterMaxAttendance = count;
                timeStart = p.getKey();
            }
            if (count == counterMaxAttendance){
                timeEnd = p.getKey();
            }
        }
      if (isLastTimeMore(timeStart, timeEnd)) {
          timeEnd = sdf.format(new Date());
      }

        return String.format("%s - %s - %d", timeStart, timeEnd, counterMaxAttendance);
    }

    /**
     * if max users now.
     * @param start - start
     * @param end - end
     * @return result
     */
    private boolean isLastTimeMore(String start, String end) {
        String[] startArr = start.split(":");
        String[] endArr = end.split(":");
        return (Integer.valueOf(startArr[0]) < Integer.valueOf(endArr[0]) ||
                (startArr[0].equals(endArr[0]) &&
                        Integer.valueOf(startArr[1]) < Integer.valueOf(endArr[1])) ||
                (startArr[1].equals(endArr[1]) &&
                        Integer.valueOf(startArr[2]) < Integer.valueOf(endArr[2])));
    }
}
