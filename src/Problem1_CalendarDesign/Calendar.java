package Problem1_CalendarDesign;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bradley Taniguchi
 * Creates a Calendar Year given a date
 */
public class Calendar {
    private int year;
    private List<MonthBuilder> months;
    
    public Calendar(int year){
        this.year = year;
        months = new ArrayList<>();
        for(Month month : Month.values()){
            months.add(new MonthBuilder(month, year));
        }
    }
    
    /*getters and setters*/
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<MonthBuilder> getMonths() {
        return months;
    }

    public void setMonths(List<MonthBuilder> months) {
        this.months = months;
    }
    
    
    
}
