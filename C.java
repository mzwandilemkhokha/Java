public class C extends B{
	int i=Math.round(3.5f);

	public static void main(String [] args){
	new A().printb();
	}
}

class A{
	A(){print();}
void print(){System.out.println("A");}
int printb(){return 10;}

}

class B extends A{
	B(){print();}
	void print(){System.out.println("B");}

}

