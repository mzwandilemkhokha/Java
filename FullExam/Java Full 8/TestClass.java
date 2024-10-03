import java.util.*;
public class TestClass{
	int x=5;
	int getX(){return x;}
	public static void main(String[] args){
TestClass tc=new TestClass();
tc.looper();
System.out.println(tc.x);

	}

	public void looper(){
		int x=10;
		while((x=getX())!=0){
			for (int m=10;m>=0;m--) {
				x=m;
				System.out.println(x);
				
			}
		}
	}
}
