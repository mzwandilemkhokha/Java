import java.time.LocalDate;
import java.time.Period;
import java.time.Month;

public class LocalDateTest1 {
    public static void main(String[] args) { 
         LocalDate currentDate = LocalDate.now();
         LocalDate birthday = LocalDate.of(1960, Month.JANUARY, 1);
		 Period p = Period.between(birthday, currentDate);
         Period p2 =Period.of(5,0,0);
         p=p.minus(p2);
        System.out.println("You are " + p.getYears() + " years, " + p.getMonths() +
                                                           " months, and " + p.getDays() + " days old."); 
    }
}
