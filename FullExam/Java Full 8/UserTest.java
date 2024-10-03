public class UserTest{
	public static void main(String[] args) throws Exception{
	Identifiable i=new Admin("admin123");
	StringBuilder sb=new StringBuilder("Java");
	String s="Course";
	sb.append(s);
	sb.delete(4,6);
	sb.insert(4,"SE");
	System.out.println(sb.substring(2,6)+ sb.length());
User.id="1";
	}

	public double sum(double d1,double d2) {return d1+d2;}
	public int sum(Integer i1, Integer i2){return i1 +i2;}


}
interface Identifiable{
	String getId(); 
}
class User implements Identifiable{
public String id;
public User(String id){
	this.id=id;
}
public String getId(){return id;}
}

class Admin extends User{
public Admin(String id){
	super(id);
}

}

