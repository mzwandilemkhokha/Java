public class Person{

	public enum Gender{MALE, FEMALE}
	public enum City{PRETORIA, JOBURG, CAPETOWN, BLOEMFONTEIN}
	
	private String name;
	private String surname;
	private int age;
	private String gender;
	private String city;

	public Person(String name, String surname, int age, String gender, String city) {
    this.name = name;
    this.surname = surname;
    this.age = age;
    this.gender = gender;
    this.city = city;
}


    public void setName(String name) {
        this.name = name;
    }

    
    public String getSurname() {
        return surname;
    }

    
    public void setSurname(String surname) {
        this.surname = surname;
    }

    
    public int getAge() {
        return age;
    }

    
    public void setAge(int age) {
     
    }

    
    public String getGender() {
        return gender;
    }

    
    public void setGender(String gender) {
        this.gender = gender;
    }

    
    public String getCity() {
        return city;
    }

    
    public void setCity(String city) {
        this.city = city;
    }

    public String toString(){
    	String m=name+" "+surname+" "+gender+" "+age+" "+city;
    	return m;

    }



}