import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class Person2Main{

public static void main(String[] args){
	List<Person> persons = new ArrayList<>();
	persons.add(new Person("Alice", "Johnson", 9, "Female", "New York"));
	persons.add(new Person("A", "John", 49, "Female", "New York"));
	persons.add(new Person("Ali", "son", 65, "Female", "New York"));
	persons.add(new Person("ice", "John", 53, "Male", "New York"));
	persons.add(new Person("lice", "Jon", 51, "Female ", "New York"));
	persons.add(new Person("Ali", "John", 25, "Male", "New York"));
    persons.add(new Person("bice", "Johny", 53, "Male", "New York"));
	persons.add(new Person("Alice", "Joni", 51, "Female ", "New York"));
	persons.add(new Person("Alie", "John", 60, "Male", "New York"));
    Predicate<Person> isOlderThan50 = person -> person.getAge() > 50;
   
             persons.stream()
            .filter(person ->person.getGender().equals("Male"))
            .filter(person ->person.getAge()>50)
            .forEach(System.out::println);
}

}

