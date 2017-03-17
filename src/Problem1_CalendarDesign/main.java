package Problem1_CalendarDesign;

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
            for(Month month : Month.values()) {
                System.out.println(month);
                MonthBuilder monthBuild = new MonthBuilder(month, year);
                System.out.println(monthBuild);
            }
        }
    }
}
