import java.util.*;
public class Money{


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
	
}