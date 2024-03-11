package com.autowire;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApp {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(ConfigBeans.class);
		context.refresh();
		
		Employee emp = context.getBean(Employee.class);
		emp.setName("Tushar");
		emp.setEid(101);
		emp.setSalary(1000000);
		Address empAddress = emp.getAddress();
		empAddress.setCity("Indore");
		empAddress.setPincode(451220);
		System.out.println("Employee details -------------->");
		System.out.println(emp.getEid()+" | "+emp.getName()+" | "+emp.getSalary());
		System.out.println(empAddress.getCity()+" | "+empAddress.getPincode());
		
		Company company = (Company) context.getBean(Company.class);
		company.setName("Amazon");
		Address cAddress = company.getCompanyAddress();
		cAddress.setCity("USA");
		cAddress.setPincode(2173312);
		Employee raja = company.getEmployee();
		raja.setName("Raja Singh");
		raja.setEid(12231);
		raja.getAddress().setCity("Pipalgone");
		System.out.println("\nCompany details ------------->");
		System.out.println(company.getName());
		System.out.println(cAddress.getCity());
		System.out.println(cAddress.getPincode());
		System.out.println("Details of Employee Working in "+company.getName());
		System.out.println(raja.getEid()+" | "+raja.getName()+" | "+raja.getAddress().getCity());
	}
}
