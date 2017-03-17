package Problem1_CalendarDesign;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author Bradley Taniguchi
 * 3/16/17
 */
public class MonthBuilder {
    private Month month;
    private int year;
    private int[][] graph;
    private Map<Month, Integer> monthMap;
    
    public MonthBuilder(Month month, int year) {
        this.month = month;
        this.year = year;
        this.graph = buildDays(month, year);
    }
    
    public MonthBuilder(int month, int year) {
        this(Month.values()[month], year);
    }
    
    public MonthBuilder(int year) {
        this(Month.JANUARY, year);
    } 
    /**
     * Does the hard math to create the graph for the date.
     */    
    private int[][] buildDays(Month month, int year) {
        int[][] graph = new int[7][6];
        int offset = zeller(month.ordinal(), year);
        
        MonthMap map = new MonthMap(year);
        int maxDays = map.getMap().get(month); //number of total days
        int days = 0; //day counter
        for(int week = 0; week < 6; week++) { //for 5 weeks
            for(int day = 0; day < 7; day++) {//get day
                /*handle first week, offset the start day*/
                if(week == 0 && offset > 0) {
                    //System.out.println("Offset: " + offset);
                    offset--; //subtract the offset
                } else {
                    graph[day][week] = days+1;
                    days++;
                }
                /*handle the last day*/
                if(maxDays == days) break;
            }
            if(maxDays == days) break;
        }
        return graph;
    }

    /**
     * Implementation of Zeller's congruence
     * http://helpdesk.objects.com.au/java/zellers-congruence-in-java
     * @return 
     */
    private int zeller(int month, int year) {
        month = month + 1; //the algorithm needs a month + 1; doesnt work with 0
        if (month < 3) {
            month += 12;
            year -= 1;
        }
        int day = 0;
        int k = year % 100;
        int j = year / 100;

        // 0 = Saturday, 1 = Sunday, ...
        return ((day + (((month + 1) * 26) / 10) + 
           k + (k / 4) + (j / 4)) + (5 * j)) % 7;
    }
    
    @Override
    public String toString(){
        StringBuilder string = new StringBuilder();
        for(int week = 0; week < 6; week++) { //for 5 weeks
            for(int day = 0; day < 7; day++) {//get day
                //String.format("%05d", yournumber);
                //if (this.graph[day][week] != 0)
                string.append(" "+String.format("%2d",this.graph[day][week])+ " ");
            }
            string.append("\n");
        }
        return string.toString();
    }
}
