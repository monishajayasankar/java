
//package calendar;
import java.util.Calendar;

public class hours {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.print(cal.get(Calendar.HOUR_OF_DAY)); // gets hour in 24h format
        cal.get(Calendar.HOUR); // gets hour in 12h format
        cal.get(Calendar.MONTH);
        int hours = cal.get(Calendar.HOUR_OF_DAY);

        System.out.println("hours= " + cal.get(Calendar.HOUR));
        {
            if (hours <= 12) {
                System.out.println("good morning");
            } else if (hours > 12 && hours <= 14) {
                System.out.println("good afternoon");
            } else if (hours > 14 && hours <= 18) {
                System.out.println("good evening");
            } else {
                System.out.println("good night");
            }
        }
    }
}