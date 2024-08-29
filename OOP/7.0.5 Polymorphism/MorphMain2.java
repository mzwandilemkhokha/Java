public class MorphMain2{

	public static void main(String [] args){
		EnglishBook inst1= new EnglishBook();

		var target= inst1;

		inst1=target;
	}
}