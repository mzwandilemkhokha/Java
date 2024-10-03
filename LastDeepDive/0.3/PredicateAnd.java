import java.util.function.*;
public class PredicateAnd{
	public static void main(String [] args){
	Predicate<Integer> ageInMonths=i->i>0;//test if the age is more than 0
	Predicate<Integer> newBornAge=i->i<=24;//tests if the value does exceed the value of the new born months
	System.out.println(ageInMonths.and(newBornAge).test(24));//the value supplies is the the age in monts
System.out.println(ageInMonths.and(newBornAge).test(36));//false
System.out.println(ageInMonths.and(newBornAge).test(5));//true
System.out.println(ageInMonths.and(newBornAge).test(21));//true


	}
}