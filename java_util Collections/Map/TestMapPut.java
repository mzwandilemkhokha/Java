import java.util.*;
public class TestMapPut{
	public static void main(String args[] ){
Map<String,String> cars= new HashMap<String,String>();
Map<String,String> bakkie= new HashMap<String,String>();

cars.put("Toyota", "Corrolla");
cars.put("VW","Vivo");
cars.put("BMW", "M3");
cars.put("Volvo","S40");

bakkie.put("1", "Corrolla");
bakkie.put("2","Vivo");
bakkie.put("3", "M3");
bakkie.put("4","S40");

System.out.println("Cars");
for (Map.Entry<String,String> vals : cars.entrySet()) {
System.out.print(vals.getKey()+":");
System.out.println(vals.getValue());
}
System.out.println("Bakkie Hash");
for (Map.Entry<String,String> vals : bakkie.entrySet()) {
System.out.print(vals.getKey()+":");
System.out.println(vals.getValue());
}


System.out.println("Cars after putAll method");
cars.putAll(bakkie);


for (Map.Entry<String,String> vals : cars.entrySet()) {
System.out.print(vals.getKey()+":");
System.out.println(vals.getValue());
}


	}
}