package com.nt.IntermediateOperations_filter;

import java.util.Arrays;

class Employee {
	int id;
	String name;
	double salary;

	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}

public class PrintSalary {
public static void main(String[] args) {
	Arrays.asList(
			new Employee(101, "Ramesh", 45000),
			new Employee(102, "Suresh", 60000),
			new Employee(103, "Mahesh", 75000)
	)
	.stream()
	.filter(emp -> emp.salary > 50000)
	.map(emp -> emp.name)
	.forEach(System.out::println);
}
}
