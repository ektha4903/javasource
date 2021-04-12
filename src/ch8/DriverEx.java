package ch8;

public class DriverEx {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		//  drive(Vehicle vehicle)
		driver.drive(new Vehicle());
		driver.drive(new Bus());
		driver.drive(new Taxi());

	}

}
