package sec02.exam01;

public class DriverExam {

	public static void main(String[] args) {

		Coupe coupe = new Coupe();
		
		Driver driver = new Driver();
		driver.run( (Car)coupe );
		
		Landrover landrover = new Landrover();
		driver.run( landrover );
		
//		HumanCar humanCar = new HumanCar();
//		driver.run( humanCar );
		
		Car c = new Car();
		Landrover land = (Landrover) c;
		
	}

}
