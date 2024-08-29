import java.time.LocalTime;

public class LocalDateTest {
    public static void main(String[] args) {
   		 LocalTime currentTime =LocalTime.now();   		 
   		 System.out.println("The current hour is : " +currentTime.getHour());
   		 System.out.println("LocalTime from a specific hour(23) and minute(30): " +currentTime.of(23,30));
    }
}
