import java.util.*;
import java.lang.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class tester{
 
   

public static void main(String[] args){

 LocalDate date1=LocalDate.of(2018,11,4);
 LocalTime time=LocalTime.of(1,59,59);
 ZonedDateTime dt=ZonedDateTime.of(date1,time, ZoneId.of("America/New_York"));
 dt=dt.plusSeconds(1);
 //Duration d= Duration.ofDays(1);
 System.out.println(dt.getHour()+":"+dt.getMinute()+":"+dt.getSecond());

LocalDate valDay=LocalDate.of(2018,2,14);
DateTimeFormatter formatter=DateTimeFormatter.ofPattern("DD-MM-uuuu");
System.out.println(valDay.format(formatter));

}
static void m1(){
   System.out.println("m1 Starts");
   throw new IndexOutOfBoundsException("Big bang");
}

}

