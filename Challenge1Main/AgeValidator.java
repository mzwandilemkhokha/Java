public class AgeValidator{
	public static int calculate(String dob){
	//Scanner scann= new Scanner(System.in);
	String date_string=dob;

    String[] DOBsplitter = date_string.split("/");
	int age=2024-(Integer.parseInt(DOBsplitter[2]));
	return age;
	}

	

}