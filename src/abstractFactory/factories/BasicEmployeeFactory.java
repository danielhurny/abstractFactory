package abstractFactory.factories;

import abstractFactory.car.Car;
import abstractFactory.car.EmployeeCar;
import abstractFactory.phone.EmployeePhone;
import abstractFactory.phone.Phone;

public class BasicEmployeeFactory extends EmployeeFactory {

	@Override
	public Phone createPhone() {
		// TODO Auto-generated method stub
		return new EmployeePhone();
	}

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new EmployeeCar();
	}

}
