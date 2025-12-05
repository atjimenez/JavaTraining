package M2_ACTIVITY3;

public class M2_ACTIVITY3 {
	public static void main(String[] args)
	{
		//Car without parameters
		Car car1 = new Car();
		
		//Car with parameters
		Car car2 = new Car("TOYOTA", "RED", "INNOVA 2021");
		System.out.println(car2.getCarInfo());
		
		//Lets transform your car!
		car1.setBrand("Suzuki");
		car1.setColor("Blue");
		car1.setModel("Swift");
		System.out.println(car1.getCarInfo());

		//Lets upgrade your old car!
		car2 = new Car("TOYOTA", "RED", "INNOVA 2026");
		System.out.println(car2.getCarInfo());
	}
}
