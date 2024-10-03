public class A{
	int i;
	//public A(){}
	 A(int x){this.i=x;}
	 A(int x, int c, int d){this.i=x;}

}

class B extends A{
	B(){}
	int j;
 B(int x, int y){super(x); this.j=y;}
}