public class MyClass{
	int m;
	static int i1=5;
	static int i2;
	int j = 100;
	int x;
	public MyClass(int m){
System.out.println(i1+" "+i2+" "+i2+" "+j+" "+m);

	}
	{j=30; i2=40;}
	static{i1++; i2=30;}

	public static void main(String args[]){
	MyClass m=new MyClass(5);
	}
}