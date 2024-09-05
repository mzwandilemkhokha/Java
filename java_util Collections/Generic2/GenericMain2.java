 import java.util.*;

 public class GenericMain2{

public static void main(String[] args)
{
	Banana a =new Banana();
	Banana b =new Banana();
	Banana c =new Banana();
	Banana d =new Banana();
	Banana e =new Banana();

	SafeImpl<Banana> safeimpl=new SafeImpl<Banana>();

	/*safeimpl.lockIn(a);
	safeimpl.lockIn(b);
	safeimpl.lockIn(c);
	safeimpl.lockIn(d);
	safeimpl.lockIn(e);

	Iterator itr=safeimpl.iterate();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}*/
}

}
