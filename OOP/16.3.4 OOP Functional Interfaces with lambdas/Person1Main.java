import java.util.*;
import java.text.SimpleDateFormat;

public class Person1Main{

public static void main(String[] args){
	
	List<Person> persons = new ArrayList<>();

	//ublic Person(Date dateOfBirth, String name, String surname){
  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
  Date dateOfBirth;

	persons.add(new Person(convertStringToDate("2004-12-01"),"Alice", "Johnson"));
	persons.add(new Person(sdf.parse("1990-10-10"),"A", "John"));
	persons.add(new Person(sdf.parse("1990-10-10"),"Ali", "son"));
	persons.add(new Person(sdf.parse("1990-10-10"),"ice", "John"));
	persons.add(new Person(sdf.parse("1990-10-10"),"lice", "Jon"));
	persons.add(new Person(sdf.parse("1990-10-10"),"Ali", "John"));
  
    for(Person a: persons){
    	System.out.println(persons);
    }

}
 public static Date convertStringToDate(String dateString) {
       
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
       
        Date date = null;
        
        try {
            
            date = dateFormat.parse(dateString);
        } catch (ParseException e) {
            
            System.err.println("Invalid date format: " + e.getMessage());
        }
        
        return date;
    }
}