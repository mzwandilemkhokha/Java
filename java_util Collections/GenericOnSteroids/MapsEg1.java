
import java.util.HashMap;
import java.util.Map;

public class MapsEg1 {
	public static void main(String[] args) {
		
		Map<String, Money> shareMap = new HashMap<String,Money>();
		
		
		shareMap.put("Sly",new Money(Currency.USD, 1000));
		shareMap.put("Slicko",new Money(Currency.USD, 1000));
		shareMap.put("No3",new Money(Currency.USD, 1000));
		shareMap.put("John",new Money(Currency.USD, 1000));
		
		
		System.out.println("shareMap = "+shareMap);
	}
}

