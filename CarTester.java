public class CarTester
{
	public static void run()
	{
		// Create a Car object
		Car c = new Car("ford",80);
		// Print out the model

		// Print out the fuelLevel
		System.out.println(c.getFuelLevel());
		// Print how many miles are left with 23 mpg

		// Print the object

		// Create an ElectricCar object
		ElectricCar ec = new ElectricCar("tundra", 90);
		// Print out the model

		// Print out the fuelLevel
		System.out.println(ec.getFuelLevel());
		// Print how many miles are left with 400 miles per charge

		// Print the object
	}
}
