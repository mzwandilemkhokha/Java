class ABCD{
	int x =10;
	static int y=20;
}

class MNOP extends ABCD{
	int x=30;
	static int y =40;

}

public class TestClass{
	public static void main(String[] args){
	System.out.println(new MNOP().x+"'"+new MNOP().y);
	}
}


interface I1{}
interface I2{}

class C1 implements I1{}
class C2 implements I2{}
class C3 extends C1 implements I2{}

C1 o1;
C2=o2;
C3 o3;