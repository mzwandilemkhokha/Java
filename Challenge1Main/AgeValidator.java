public class AgeValidator{
	public static double calculate(String dob){
	Scanner scann= new Scanner(System.in);
	String str=dob;

  String[] arrOfStr = str.split("/");
int age=2024-Interger.parseInt(arrOfStr[3]);
return age;
	}
}