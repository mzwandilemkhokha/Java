import java.util.*;
public class CustomColleection<E> implements Collection{
	private ArrayList<E> list=new ArrayList<>();
	public void clear(){}
	boolean add(E e){
		return true;
	}
	boolean addAll(Collection<? extends E> c){
		return true;
	}
	boolean contains(Object o){
		return null;
	}
	boolean containsAll(Collection<?> c){

	}
	boolean equals(Object o){
		return true;
	}
	int hashCode(){return 0;}

	boolean isEmpty(){
		return true;
	}

	Iterator<E> iterator()
	{return null;}

	Stream<E> parrallelStream(){
		return null;
	} 

	


}