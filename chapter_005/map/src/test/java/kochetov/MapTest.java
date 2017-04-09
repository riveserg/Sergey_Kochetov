package kochetov;

import kochetov.model.User;
import org.junit.Test;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/**
 * MapTest.
 * Created by Сергей on 09.04.2017.
 */
public class MapTest {
    /**
     * MapTest.
     */
    private Map<User, Object> mapTest = new HashMap<>();

    /**
     * Test.
     */
    @Test
    public void whenAddTwoUserAndPrintHiThem() {
        final User user1 = new User("name",1,new GregorianCalendar(2017,1,1));
        final User user2 = new User("name",1,new GregorianCalendar(2017,1,1));
        this.mapTest.put(user1, new Object());
        this.mapTest.put(user2,  new Object());

        mapTest.forEach((k, v) ->
                System.out.println(k + " hashCode = " + k.hashCode())
               );
        System.out.println(mapTest.get(user1).equals(user2));
        // Без переделки hashCode() и equals()
        //kochetov.model.User@51521cc1 hashCode = 1364335809
        //kochetov.model.User@1b4fb997 hashCode = 458209687
        //false

        // C переделкой hashCode() без переделки  equals()
        //kochetov.model.User@a7b6376e hashCode = -1481230482
        //kochetov.model.User@a7b6376e hashCode = -1481230482
        //false

        // C переделкой hashCode() и  equals()
        //kochetov.model.User@a7b6376e hashCode = -1481230482
        //false

    }
}
