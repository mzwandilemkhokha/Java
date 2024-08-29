public class ByteTest2{
	
	public static void main(String[] args){
Byte val=10;
String Byte2String=val.toString();
System.out.println("Converted value(Byte2String) using toString: "+ Byte2String);

Byte String2Byte=Byte.valueOf("50");
System.out.println("Converted value(String2Byte) using valueog(): "+ Byte2String);

byte _2byte=val.byteValue();
System.out.println("Converted value(byteValue) using byteValue(): "+ _2byte);
	
byte byteValue=8;

Byte byte2Byte= Byte.valueOf(byteValue);
System.out.println("Converted value(byte2Byte) using valueOf(byte b): "+ byte2Byte);

String byteString="70";
byte String2byte=Byte.parseByte(byteString);
System.out.println("Converted value(String2byte) using parseByte(): "+ String2byte);

	}
}
