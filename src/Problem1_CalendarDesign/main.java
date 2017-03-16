package Problem1_CalendarDesign;

import java.time.DayOfWeek;
import java.util.Calendar;

/**
 *
 * @author brad
 */
public class main {

    public static void main(String args[]) {
        int year;
        if (args.length == 0) {
            System.out.println("No year given as an argument!");
        } else {
            year = Integer.parseInt(args[0]);
            System.out.println("Date parsed: " + year);
        }
    }

}
