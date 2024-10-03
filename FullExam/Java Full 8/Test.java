
import java.util.*;
public class Test{
	public static void main(String args[]){
	
FunInter lambdaAdd=new FunInter(){
 public int process(int a,int b){return a+b;}
};

int a=lambdaAdd.process(5,3);
System.out.println(a);

}
}
interface FunInter{
	int process(int a, int b);
}