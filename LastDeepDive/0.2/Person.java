import java.util.*;
import java.time.*;
public class Person {
	private String name;
	private String surname;
	private LocalDate dateOfBirth;
	private int age;
	private LocalDate today=LocalDate.now();
public Person(String name, String surname, LocalDate dateOfBirth){
	  Period period = Period.between(dateOfBirth, today);
	this.name=name;
	this.surname=surname;
	this.age=period.getYears();
	
}
	public String getName(){
	return name;
	}
	public String getSurname(){
	return surname;
	}
	public int getAge(){
return age;
	}
	

	public void setName(String name){
	this.name=name;
	}
	public void setSurname(String surname){
	this.surname=surname;

	}

	public void setAge(int age){
	this.age=age;
	}
	public int hashcode(){
return this.age;
	}

}