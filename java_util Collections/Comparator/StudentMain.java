import java.util.*;  
import java.io.*;  
  
class StudentMain{  
public static void main(String args[]){
ArrayList students=new ArrayList();

students.add(new Student(1002,"Mzi",23));
students.add(new Student(103,"Mzilakazi",33));
students.add(new Student(1002,"Mzi",31));

Collections.sort(students, new AgeComparator());

Iterator itr=students.iterator();

while(itr.hasNext()){
	Student st=(Student) itr.next();
	System.out.println(st.studentNo+" "+st.fullName+" "+st.age);
}


}
} 


