public class CharacterTest2
{
	
	public static void main(String[] args){
Character a='a';
String aToChar=a.toString();
System.out.println("Converted from Character to String using toString(): "+a);
	char Character2char=Character.valueOf(a);
	System.out.println("Converted from Character to char using valueOf(): "+Character2char);


	}
}
