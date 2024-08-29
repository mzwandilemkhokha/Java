import java.util.*;
public class Challenge2Main{
	public static void main(String [] args){

		/*
		 * Write a console program that does the following:
Prompt the user for a number
Prompt the user for a mathematical operator
Prompt the user for another number
Perform the operation
Print the operation and the output. Therefore if the user enters 1 then + 2 you should print 1+2=3 your program should be able to do all the arithmetic operations.
Ensure that the program loops back up and does not exit.
You should specify and exit keyword like entering x terminates the program

		 ***
		  */
double num1,num2;
		String prompt1=Prompter.prompt("Enter First Number");
		String prompt2=Prompter.prompt("Enter Second Number");
		String menuDriver;

		Scanner scanNumber1 = new Scanner(prompt1);
		Scanner scanNumber2 = new Scanner(prompt2);
		Scanner scanMenuDriver;

	if(scanNumber1.hasNextDouble()&&scanNumber2.hasNextDouble()){

		MenuPrinter.printMenu();
		menuDriver=Prompter.prompt("Enter selection");
		scanMenuDriver= new Scanner(menuDriver);
		
		if(scanMenuDriver.hasNextInt()){
			num1=Double.parseDouble(prompt1);
			num2=Double.parseDouble(prompt2);
			/*
System.out.println("1. Addition");
			System.out.println("2. Subraction");
			System.out.println("3. Division");
			System.out.println("4. Multiplication");
			System.out.println("5. Modulus");
			System.out.println("Press X to exit");
			*/
			boolean switchloop=true;
		
				while(switchloop){
					switch(Integer.parseInt(menuDriver)){
						case 1:{
								
								
								System.out.println(num1+" + "+num2+" = "+Addition.add(num1,num2));
								MenuPrinter.printMenu();
								menuDriver=Prompter.prompt("Enter selection");
								switchloop=true;
								break; 
							   }
						case 2:{
								
								switchloop=true;
								System.out.println(num1+" - "+num2+" = "+Subtraction.subtract(num1,num2));
								MenuPrinter.printMenu();
								menuDriver=Prompter.prompt("Enter selection");
								break;
							}
						case 3:{
								System.out.println(num1+" / "+num2+" = "+Division.divide(num1,num2));
								switchloop=true;
;								MenuPrinter.printMenu();
								menuDriver=Prompter.prompt("Enter selection");
								break;
							}
						case 4:{
								System.out.println(num1+" x "+num2+" = "+Multiplication.multiply(num1,num2));
								switchloop=true;
								MenuPrinter.printMenu();
								menuDriver=Prompter.prompt("Enter selection");
								break;
							}
						case 5:{
								System.out.println(num1+" % "+num2+" = "+Modulus.modulus(num1,num2));
								switchloop=true;
								MenuPrinter.printMenu();
								menuDriver=Prompter.prompt("Enter selection");
								break;
							}
						case 99: {
								System.out.println("exiting");

								 prompt1=Prompter.prompt("Enter First Number");
						        prompt2=Prompter.prompt("Enter Second Number");
								scanNumber1 = new Scanner(prompt1);
		                        scanNumber2 = new Scanner(prompt2);
		                        num1=Double.parseDouble(prompt1);
								num2=Double.parseDouble(prompt2);
		                        MenuPrinter.printMenu();
		                        menuDriver=Prompter.prompt("Enter selection");
								switchloop=true;
								break;}
						default:{
								System.out.println("Invalid menu option entered ");
								MenuPrinter.printMenu();
								menuDriver=Prompter.prompt("Enter selection");
								break;
							}
						}
				}

		}
		else
		{
			System.out.println("Invalid selection");

		}


	}
	else
	{
		System.out.println("User number input(s) is not valid");
	}

		
	scanNumber1.close();
	scanNumber2.close();
			
		
	
	}
}