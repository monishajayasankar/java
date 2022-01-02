package calendar;
import java.util.Calendar;
public class hours{
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        int hours=cal.get(Calendar.HOUR);
        System.out.println("hours= "+cal.get(Calendar.HOUR));{
            if( hours<=12){
                System.out.println("good morning");}
            else if(hours>12 && hours<=16){
                System.out.println("good afternoon");}
            else if(hours>16 && hours<=21){
                  System.out.println("good evening");}
            else{
              System.out.println("good night");
            }    
    }    
}
}