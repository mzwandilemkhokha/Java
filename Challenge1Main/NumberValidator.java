public class NumberValidator{
	public static boolean isValid(String prompt)

	Scanner scann = new Scanner(System.in);
	System.out.println(prompt);
	double num=scann.nextLine();
	boolean isNumber= false
	if(Double.parseDouble(num)<0)
 	{
 		isNumber=true;
 	}
	else
	{
		isNumber=false;
	}

	return isNumber;
}