package day50_inheritance03;

public class Company {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		FullTimeEmployee ft = new 	FullTimeEmployee();
		Contractor ct = new Contractor();
		
		emp1.calculatePay(40, 40);
		ft.calculatePay(40, 45);
		ct.calculatePay(40, 50);
		
	}
}
