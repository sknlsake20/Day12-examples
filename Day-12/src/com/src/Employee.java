//**
/*
 /* @author: Rajesh
  * @empid is used fro empid
  */

package com.src;

public class Employee {
	private int empid;
	private String empname;
	private String empadd;
	double salary;
	public Employee(int empid, String empname, String empadd,double salary) {
		this.empid = empid;
		this.empname = empname;
		this.empadd = empadd;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.empid;
	}
	@Override
	public boolean equals(final Object obj) {
		// TODO Auto-generated method stub

		Employee e = (Employee) obj;
		return this.empid == e.empid;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid+ ",empname=" + empname + ", empadd=" + empadd + ", salary=" + salary + "]";
	}


}
