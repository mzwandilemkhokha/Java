//LocalDate.parse("2021-01-07") String name, String surname, LocalDate dateOfBirth
import java.util.function.*;
import java.util.*;
import java.time.*;

 class LambdaSort{
	public static void Main(String[] args){

	List<Person> people= new ArrayList<Person> ();
	Person p1=new Person("mzwandile","mansu",LocalDate.parse("1995-02-01"));
	Person p2=new Person("Carlos","Kumi",LocalDate.parse("1995-08-01"));
	Person p3=new Person("Boity","Rua",LocalDate.parse("1997-02-01"));
	Person p4=new Person("Tumi","Tuamko",LocalDate.parse("1965-02-01"));
	people.add(p1);
	people.add(p2);
	people.add(p3);
	people.add(p4); 
	//Collections.sort(people, Collections.naturalOrder());
	for (Person p:people) {
		System.out.println(p.getName()+" "+p.getAge());
	}

	}
	}
	class b{}