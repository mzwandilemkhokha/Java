import java.util.*;
public class NestedMapEg1 {
	public static void main(String[] args) {
		
		Map<String,List<Money>> outerMap = new HashMap<String,List<Money>>();
		
		List<Money> innerList = new ArrayList<Money>();
		List<Money> innerList2 = new ArrayList<Money>();
		List<Money> innerList3 = new ArrayList<Money>();
		List<Money> innerList4 = new ArrayList<Money>();
		List<Money> innerList5 = new ArrayList<Money>();
		
	

		//loop for 200
		for (int lc=0;lc<200 ; lc++) {
			innerList.add(new Money(Currency.USD,1));
		}
//loop for 100
		for (int lc=0;lc<100 ; lc++) {
			innerList2.add(new Money(Currency.USD,10));
		}
//loop for 300
		for (int lc=0;lc<300; lc++) {
			innerList3.add(new Money(Currency.USD,20));
		}
//loop for 200
		for (int lc=0;lc<200 ; lc++) {
			innerList4.add(new Money(Currency.USD,50));
		}
//loop for 2000
		for (int lc=0;lc<2000 ; lc++) {
			innerList5.add(new Money(Currency.USD,100));
		}
outerMap.put("a",innerList);

		outerMap.put("b",innerList2);
		outerMap.put("c",innerList3);
outerMap.put("d",innerList4);
outerMap.put("e",innerList5);

		
		System.out.println("outerMap = "+outerMap);
	}
}
