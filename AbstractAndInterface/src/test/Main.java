package test;

interface Policy {

	double calSal(double sal);

	double calSal(double sal, double bonus);

}

abstract class PolicyImpls implements Policy {

	@Override
	public double calSal(double sal) {
		return 0;
	}

	@Override
	public double calSal(double sal, double bonus) {
		return 0;
	}

}

class Emp extends PolicyImpls {

	@Override
	public double calSal(double sal) {
		// TODO Auto-generated method stub
		return sal;
	}

	@Override
	public double calSal(double sal, double bonus) {
		// TODO Auto-generated method stub
		return sal + bonus;
	}

}

public class Main {
	public static void main(String[] args) {

		Emp emp = new Emp();

		System.out.println(emp.calSal(10000));

		System.out.println(emp.calSal(10000, 20));
	}

}
