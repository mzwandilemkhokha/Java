interface X{
default void displayX(){
	System.out.println("X");
}
}

interface Y extends X{
default void displayY(){
	System.out.println("Y");
}
}

class Z implements X,Y{
	public void displayX(){
		X.super.displayX();
	}
	public void displayY(){
		Y.super.displayY();
	}

	public static void main(String args[]){
		Z obj = new Z();
		obj.displayX();
		obj.displayY();
	}
}