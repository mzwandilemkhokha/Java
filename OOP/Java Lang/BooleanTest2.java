public class BooleanTest2{
	public static void main(String[] args){
	Boolean bool=true;
	 
String boolean2String=bool.toString();

Boolean String2boolean=Boolean.parseBoolean(boolean2String);
boolean Boolean2boolean=String2boolean.booleanValue();

Boolean boolean2Boolean=Boolean.valueOf(boolean2String); //tihs converts boolean to Boolean
System.out.println("This string was converted from Boolean to boolean "+ Boolean2boolean);

boolean String2boolean=Boolean.parseBoolean("true");
	} 
}  