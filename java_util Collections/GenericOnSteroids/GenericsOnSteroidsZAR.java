import java.util.ArrayList;
import java.util.List;



public class GenericsOnSteroidsGBP {
	public static void main(String[] args) {
		ArrayList<Money> amounts = new ArrayList<Money>();
		

amounts.add(new Money(Currency.ZAR,1));
amounts.add(new Money(Currency.ZAR,1));
amounts.add(new Money(Currency.ZAR,1));
amounts.add(new Money(Currency.ZAR,1));
amounts.add(new Money(Currency.ZAR,1));
amounts.add(new Money(Currency.ZAR,1));

//Collections.sort(amounts);

for(Money moola: amounts){

  System.out.println(moola.getCurrency()+" "+moola.getValue());
}
		
		
		
	}
}
