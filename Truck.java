class Automobile{
	public void drive(){}

}

public class Truck extends Automobile{
	public void drive(){

	}


public static void main(String[] args){
	Automobile a= new Automobile();
	Truck t= new Truck();

	a=t;
}
}

class A{
	public int getAge(){return 3;}
}

class B extends A{
	public long getAge(){return 3;}
}