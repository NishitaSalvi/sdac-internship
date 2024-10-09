package overloading_overriding;

class Emp {

	public double calSal(double sal) {
		System.out.println("Employee 1");
		return sal;
	}

	public double calSal(double sal, double bonus) {
		System.out.println("Employee 2");
		return sal+bonus;
	}
	
}

class Manager extends Emp {
	
		public double calSal(double sal, double bonus) {
			System.out.println("Manager" );
			return sal+bonus;
		}
		
	}

public class Main {

	public static void main(String[] args) {
		
		Manager manager = new Manager();
		
		System.out.println(manager.calSal(20000, 1000));
		
		Emp emp = new Emp();
		System.out.println(emp.calSal(2300));
		System.out.println(emp.calSal(1000, 50));
		
		
		
	}
}
