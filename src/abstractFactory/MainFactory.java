package abstractFactory;

import abstractFactory.factories.BasicEmployeeFactory;
import abstractFactory.factories.EmployeeFactory;
import abstractFactory.factories.ManagerFactory;

public class MainFactory {

	public static void main(String[] args) {
		
		
		Employee employee1 = MainFactory.createEmployee("manr");
		
		employee1.print();
		
		Employee employee2 = MainFactory.createEmployee("manager");
		employee2.print();

	}
	
	private static Employee createEmployee (String type) {
		EmployeeFactory factory;
		Employee employee;
		
		if(type.toLowerCase().equals("manager")) {
			factory = new ManagerFactory();
			employee = new Employee(factory);
		}else {
			factory = new BasicEmployeeFactory();
			employee= new Employee(factory);
			}
		return employee;
		
	} 

}
