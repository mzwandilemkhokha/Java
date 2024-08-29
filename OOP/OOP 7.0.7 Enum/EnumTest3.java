public class EnumTest3{
	public static void main(String[] args) {
			CarWheels[] values = CarWheels.values();
		 
		for(CarWheels wheel:values){
			System.out.println(wheel+" " +wheel.getPressure());
		}
	}
}
