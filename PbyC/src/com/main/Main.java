package com.main;
import com.Emp.Emp;
import com.manager.Manager;
public class Main {

	public static void main(String[] args) {
		
		Emp emp = new Emp();
		
		Manager manager = new Manager();
		
		System.out.println(emp.calSal(10000));
		System.out.println(emp.calSal(20000, 1000, 50));
		System.out.println(manager.calSal(30000, 1000));
	}
}
