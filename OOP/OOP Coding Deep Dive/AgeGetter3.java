public class AgeGetter3{
     public int getAge(){
     	Scanner scan=new Scanner(System.in);
			System.out.println("Enter age:");
			int age=Integer.parseInt(scan.readLine());
		return age;
	}
}