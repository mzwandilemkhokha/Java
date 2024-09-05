import java.util.ArrayList;
import java.util.List;

public class NestedListEg1 {
	public static void main(String[] args) {
		
		List<List<Money>> outerList = new ArrayList<List<Money>>();
		
		List<Money> innerList = new ArrayList<Money>();
		
		innerList.add(new Money(Currency.USD, 100));
		
List<Money> innerList2 = new ArrayList<Money>();
	innerList2.add(new Money(Currency.USD, 100));
	innerList2.add(new Money(Currency.USD, 100));
	innerList2.add(new Money(Currency.USD, 100));
	innerList2.add(new Money(Currency.USD, 100));
	innerList2.add(new Money(Currency.USD, 100));innerList2.add(new Money(Currency.USD, 100));
	innerList2.add(new Money(Currency.USD, 100));
	innerList2.add(new Money(Currency.USD, 100));
	innerList2.add(new Money(Currency.USD, 100));
	innerList2.add(new Money(Currency.USD, 100));
		outerList.add(innerList);
		outerList.add(innerList2);


		List<Money> innerList3 = new ArrayList<Money>();
	innerList3.add(new Money(Currency.USD, 100));
	innerList3.add(new Money(Currency.USD, 100));
	innerList3.add(new Money(Currency.USD, 100));
	innerList3.add(new Money(Currency.USD, 100));
	innerList3.add(new Money(Currency.USD, 100));
	innerList3.add(new Money(Currency.USD, 100));
	innerList3.add(new Money(Currency.USD, 100));
	innerList3.add(new Money(Currency.USD, 100));
	innerList3.add(new Money(Currency.USD, 100));
	innerList3.add(new Money(Currency.USD, 100));
	innerList3.add(new Money(Currency.USD, 100));
	innerList3.add(new Money(Currency.USD, 100));
			outerList.add(innerList);
		outerList.add(innerList2);
		outerList.add(innerList3);


		
		System.out.println("outerList = "+outerList);
	}
}
