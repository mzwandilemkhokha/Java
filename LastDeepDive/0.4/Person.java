public class Person{
	private String name;
	private String surname;
	private int age;
	private char gender;
	private String city;
public Person(String name, String surname, int age, char gender, String city){
	this.name=name;
	this.surname=surname;
	this.age=age;
	this.gender=gender;
	this.city=city;
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
	public char getGender(){
	return gender;
	}

	public String getCity(){
	return city;
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
	public void setGender(char gender){
	this.gender=gender;
	}
	public void setCity(String city){
	this.city=city;
	}
}