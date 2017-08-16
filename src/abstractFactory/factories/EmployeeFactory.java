package abstractFactory.factories;

import abstractFactory.car.Car;
import abstractFactory.phone.Phone;

public abstract class EmployeeFactory {
	
	public abstract Phone createPhone();
	public abstract Car createCar();

}
