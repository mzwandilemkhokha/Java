package package2;
import  package1.Parent;

public class Child extends Parent{

public Child(String a, String b, String c){
super(a,b);
}

public Child(String a, String b){

}





public void myMethod(){
		myMethod1();
		System.out.println("I am a child");
}

public void myMethod2(){
	family();
	System.out.println("We are a family");
}


}