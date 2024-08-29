public class EnumTest2 {
	public static void main(String[] args) {
		CarWheels frontLeft = CarWheels.LF;
		CarWheels frontRight= CarWheels.RF;
		 
		boolean res1 = frontLeft.equals(frontRight);
		 
		System.out.println(frontLeft+" equals "+frontRight+" is "+res1);
 
	}
 
}
