import java.util.ArrayList;
import java.util.List;



public class GenericsOnSteroidsMoney {
	public static void main(String[] args) {
		ArrayList<Money> amounts = new ArrayList<Money>();
		
	Money m=new Money(Currency.ZAR,10);
amounts.add(new Money(Currency.USD,10));
amounts.add(new Money(Currency.USD,10));
amounts.add(new Money(Currency.USD,10));
amounts.add(new Money(Currency.USD,10));
amounts.add(new Money(Currency.USD,10));


//Collections.sort(amounts);

for(Money moola: amounts){

  System.out.println(moola.getCurrency()+" "+moola.getValue());
}
		
		
		
	}
}
