package Problem1_CalendarDesign;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Bradley Taniguchi
 * This class is used to map the number of days for a given year to the days
 * in said month.
 */
public class MonthMap {
    private Map<Month, Integer> map;
    public MonthMap(int year) {
        this.map = new HashMap<>();
        this.map.put(Month.JANUARY, 31);
        if(isLeapYear(year)) map.put(Month.FEBRUARY, 29);
        else map.put(Month.FEBRUARY, 28);
        this.map.put(Month.MARCH, 31);
        this.map.put(Month.APRIL, 30);
        this.map.put(Month.MAY, 31);
        this.map.put(Month.JUNE, 30);
        this.map.put(Month.JULY, 31);
        this.map.put(Month.AUGUST, 31);
        this.map.put(Month.SEPTEMBER, 30);
        this.map.put(Month.OCTOBER, 31);
        this.map.put(Month.NOVEMBER, 30);
        this.map.put(Month.DECEMBER, 31);
    }
    
    /**
     * Utility function to determine if the given year is a leap year.
     * @param year
     * @return 
     */
    private static boolean isLeapYear(int year) {
        return ((year % 4 == 0 ) || (year % 100 == 0) && (year % 400 == 0));
    }
    public Map<Month, Integer> getMap() {
        return this.map;
    }    
}
