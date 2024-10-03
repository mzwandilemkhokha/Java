import java.util.function.*;
public class PredicateOr{
	public static void main(String [] args){
	Predicate<String> artist1=i->i.contains("Kabza");
	Predicate<String> artist2=i->i.contains("Mawhoo");
	System.out.println(artist1.test("Kabza featured Mawhoo on his recent song"));
	System.out.println(artist2.test("Kabza featured Mawhoo on his recent song"));
	System.out.println(artist2.test("Mawhoo is a good singer song"));

	}
}