package com.Emp;
import com.acc.Account;
public class Emp extends Account{

	@Override
	public double calSal(double sal) {
		// TODO Auto-generated method stub
		return sal;
	}
	
	@Override
	public double calSal(double sal, double bonus, double tax) {
		// TODO Auto-generated method stub
		return sal+bonus-tax;
	}
}
