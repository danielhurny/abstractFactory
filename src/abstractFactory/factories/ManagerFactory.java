package abstractFactory.factories;

import abstractFactory.car.Car;
import abstractFactory.car.ManagerCar;
import abstractFactory.phone.ManagerPhone;
import abstractFactory.phone.Phone;

public class ManagerFactory extends EmployeeFactory {

	@Override
	public Phone createPhone() {
		// TODO Auto-generated method stub
		return new ManagerPhone();
	}

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new ManagerCar();
	}

}
