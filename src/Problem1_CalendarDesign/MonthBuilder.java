package Problem1_CalendarDesign;

/**
 *
 * @author Bradley Taniguchi
 * 3/16/17
 */
public class MonthBuilder {
    private Month month;
    private int[][] graph;
       
    public MonthBuilder(Month month, int year) {
        this.month = month;
        this.graph = buildDays(month, year);
    }
    
    public MonthBuilder(int year) {
        this(Month.JANUARY, year);
    }
        
    /**
     * Does the hard math to create the graph for the date.
     */    
    private int[][] buildDays(Month month, int year) {
        int[][] graph = new int[7][5];
        int day = zeller(month.ordinal(), year);
//        System.out.println("test buildDays: " + day);
        
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
        return "month:";
    }
}
