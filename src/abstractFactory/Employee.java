package abstractFactory;

import abstractFactory.car.Car;
import abstractFactory.factories.EmployeeFactory;
import abstractFactory.phone.Phone;

public class Employee {
	
	private Phone phone;
	private Car car;

	public Employee (EmployeeFactory factory) {
		phone = factory.createPhone();
		car = factory.createCar();
	}
	public void print () {
		
		phone.getPhone();
		car.getCar();
	}
}
