import java.util.*;
public class Money implements Comparable<Money>{

  

private Currency currency;
private double value;

public Money(Currency currency, int value){
this.currency=currency;
this.value=value;
}

public Currency getCurrency(){
  return currency;
}
public double getValue(){
  return value;
}

public int compareTo(Money money){
  return 0;
}
	
}