import java.util.*;
public class MoneyMain{



	public static void main(String args[] ){

  Set<String> names= new HashSet<String>();
  
Money tenDollars = new Money(Currency.USD,10);

List<Money> money=new ArrayList<Money>();
money.add(new Money(Currency.USD,10));
money.add(new Money(Currency.USD,10));
money.add(new Money(Currency.USD,10));
money.add(new Money(Currency.USD,10));
money.add(new Money(Currency.USD,10));


Collections.sort(money);

for(Money moola: money){

  System.out.println(moola.getCurrency()+" "+moola.getValue());
}	}

}