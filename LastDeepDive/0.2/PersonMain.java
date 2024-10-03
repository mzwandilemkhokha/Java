import java.util.function.*;
import java.util.*;

public class PersonMain{
	public static void main(String[] args){

	List<Person> people= new ArrayList<Person> ();
	Person p1=new Person("mzwandile","mansu",45,'M',"Rustenburg");
	Person p2=new Person("Carlos","Kumi",9,'M',"Cape");
	Person p3=new Person("Boity","Rua",70,'F',"Valeu");
	Person p4=new Person("Tumi","Tuamko",78,'F', "Durban");
	people.add(p1);
	people.add(p2);
	people.add(p3);
	people.add(p4);

	Predicate<Person> elderlyPredicate=(Person p)->p.getAge()>50;
    List<Person> elderly= process(people,elderlyPredicate);
	
	Predicate<Person> malesPresicate=(Person p)->p.getGender()=='M';
	List<Person> males= process(people,malesPresicate);
	Predicate<Person> elderlyMalesPredicate=elderlyPredicate.and(malesPresicate);
	

	List<Person> elderlyMales= process(people,elderlyMalesPredicate);
	for (Person person: elderly) {
	System.out.println(person.getName()+" "+person.getSurname()+" "+person.getAge());
}

//the loop prints males
System.out.println("Males on lst");


for (Person person: males) {
	System.out.println("Name:"+person.getName()+" Surname:"+person.getSurname()+" Age:"+person.getAge()+" Gender:"+person.getGender());
}
	
	}

	public static List<Person> process(List<Person> people, Predicate<Person> predicate){
		List<Person> result=new ArrayList<Person>(); 
		for (Person person: people) {
			if(predicate.test(person))
				result.add(person);

		}
		return result;
	}



}