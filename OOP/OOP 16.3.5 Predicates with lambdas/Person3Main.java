import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class Person3Main{

public static void main(String[] args){
	List<Person> persons = new ArrayList<>();
	persons.add(new Person("Alice", "Johnson", 9, "Female", "Pretoria"));
	persons.add(new Person("A", "John", 49, "Female", "Joburg"));
	persons.add(new Person("Ali", "son", 65, "Female", "Bloemfontein"));
	persons.add(new Person("ice", "John", 53, "Male", "Pretoria"));
	persons.add(new Person("lice", "Jon", 51, "Female ", "Bloemfontein"));
	persons.add(new Person("Ali", "John", 25, "Male", "Durban"));
    persons.add(new Person("bice", "Johny", 53, "Male", "Rustenburg"));
	persons.add(new Person("Alice", "Joni", 51, "Female ", "Cape town"));
	persons.add(new Person("Alie", "John", 60, "Male", "Pretoria"));
    Predicate<Person> isOlderThan50 = person -> person.getAge() > 50;
 System.out.println("Full list");
     for (Person person : persons) {
            System.out.println(person);
        }
    //System.out.println(predicateCity);

    persons.removeIf(((Predicate<Person>)person -> person.getCity().equals("Pretoria")).negate());
    System.out.println("");
    System.out.println("Pretoria negate");
    System.out.println("");
 for (Person person : persons) {
            System.out.println(person);
        }
    //System.out.println(predicateCity);
}

}

