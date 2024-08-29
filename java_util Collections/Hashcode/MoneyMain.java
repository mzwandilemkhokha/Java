import java.util.*;
public class MoneyMain{



	public static void main(String args[] ){
 System.out.println("Hash Code on the moey class lesson");
  Set<String> names= new HashSet<String>();
  
Money tenDollars = new Money(Currency.USD,10);

List<Money> money=new ArrayList<Money>();
money.add(new Money(Currency.ZAR,130));
money.add(new Money(Currency.USD,104));
money.add(new Money(Currency.ZAR,105));
money.add(new Money(Currency.USD,120));
money.add(new Money(Currency.USD,120));
money.add(new Money(Currency.GBP,1220));
money.add(new Money(Currency.USD,150));
money.add(new Money(Currency.EUR,110));

money.add(new Money(Currency.USD,140));
money.add(new Money(Currency.EUR,10));
money.add(new Money(Currency.USD,90));

for(Money moola: money){

  System.out.println(moola.hashCode()==money.get(3).hashCode());
}	}

}