import java.util.Calendar;
import java.util.Date;
public class Person{
    private Date dateOfBirth;
    private int age;
    private String name;
    private String surname;
//ublic Person(Date dateOfBirth, String name, String surname){
    public Person(Date dateOfBirth, String name, String surname){
      this.dateOfBirth=dateOfBirth;
      this.name=name;
      this.surname=surname;

      

          // Get the current date
        Calendar today = Calendar.getInstance();
        Calendar birthDate = Calendar.getInstance();
        birthDate.setTime(dateOfBirth);
    int age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
    }

    public int getAge(){
    return age;
    }

    public String getName(){
return name;
    }

    public String getSurname(){
        return name;
    }

    public Date getDateOfBirth(){
        return dateOfBirth;
    }

    public int setAge(int age){
    return this.age=age;
    }

    public String setName(String name){
return this.name=name;
    }

    public String setSurname(String surname){
        return this.surname=surname;
    }

    public Date setDateOfBirth(Date dateOfBirth){
        return this.dateOfBirth=dateOfBirth;
    }



}