package com.Day1.operationonemployee;

import java.time.Year;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class UseEmployee {
	public static void main(String []args) {
		List<Employee> emp = new ArrayList<>();
		  emp.add((new Employee(1234,"Riya",28,"female","IT",2015,80000)));
		  emp.add((new Employee(1234,"Ria",23,"male","Business",2016,75000)));
		  emp.add((new Employee(1234,"Gyan",24,"male","IT",2018,40000)));
		  emp.add((new Employee(1234,"Gyanedra",28,"female","Business",2017,90000)));
		  emp.add((new Employee(1234,"Jeeva",28,"male","Sales",2018,100000)));
		  emp.add((new Employee(1234,"Siya",29,"male","CSE",2019,80000)));
		  emp.add((new Employee(1234,"Arzu",20,"male","IT",2020,85000)));
		  emp.add((new Employee(1234,"Arviya",28,"female","Sales",2018,20000)));
		  emp.add((new Employee(1234,"Arjun",23,"male","IT",2019,80000)));
		  emp.add((new Employee(1234,"Arvind",24,"male","CSE",2020,90000)));
		  
		  //1.counting number of male and females
		long male=  emp.stream().filter(e->e.getGender().equalsIgnoreCase("male")).count();
		long female =  emp.stream().filter(e->e.getGender().equalsIgnoreCase("female")).count();
		System.out.println("The number of males is"+male);
		System.out.println("The number of females is"+female);
		System.out.println("--------------------------------------------");
		
		//2.printing the name of all the departments
		emp.stream().map(e->e.getDepartment()).distinct().forEach(System.out::println);
		 
		System.out.println("--------------------------------------------");
		
		//3.average age of male and female
		double avgMaleAge= emp.stream().filter(e -> e.getGender().equalsIgnoreCase("Male"))
        .mapToInt(Employee::getAge)
        .average()
        .orElse(0.0);
		System.out.println("The average age of male is"+avgMaleAge);
		double avgFemaleAge= emp.stream().filter(e -> e.getGender().equalsIgnoreCase("Female"))
		        .mapToInt(Employee::getAge)
		        .average()
		        .orElse(0.0);
		System.out.println("The average age of female is"+avgFemaleAge);
		  
		System.out.println("--------------------------------------------");
		//4.highest paid employee
		int highestPaidEmployee = (int) emp.stream().mapToDouble(Employee::getSalary).max().orElse(0);
		System.out.println(highestPaidEmployee);
		  
		System.out.println("--------------------------------------------");
		//5.names of employees who joined after 2015
		System.out.println("Names of Employees who joined after 2015");
		emp.stream().filter(e->e.getYearOfJoining()>2015).map(e->e.getName()).forEach(System.out::println);
		  
		System.out.println("--------------------------------------------");
		//6.count number of employees in each department
		Map<String, Long> countByDept = new HashMap<>();

		emp.stream().forEach(e ->
		        countByDept.merge(e.getDepartment(), 1L, Long::sum)
		);

		System.out.println("The number of employees in each department"+countByDept);
		System.out.println("--------------------------------------------");
		//7.average salary of each department
		emp.stream().map(Employee::getDepartment).distinct().forEach(dept -> {
	           double avgSalary = emp.stream().filter(e -> e.getDepartment().equals(dept)).mapToDouble(Employee::getSalary).average().orElse(0.0);

	           System.out.println(dept + " : " + avgSalary);
	       });
		System.out.println("--------------------------------------------");
		//8.details of youngest male employee
		Optional<Employee> e1=emp.stream().filter(e->e.getGender().equalsIgnoreCase("male")).min((a,b)->a.getAge()-b.getAge());
		System.out.println(e1);
		System.out.println("--------------------------------------------");
		//9.who has the most working experience
		System.out.println("Most Work experience in the organization");
		emp.stream().max(Comparator.comparingInt(e->Year.now().getValue()-e.getYearOfJoining())).ifPresent(System.out::println);
		System.out.println("--------------------------------------------");
		//10.male and female employees in sales team
		System.out.println("The number of male and females in sales team");
		long total=emp.stream().filter(e->e.getDepartment().equalsIgnoreCase("sales")).count();
		System.out.println("The Number of males and females in Sales Department"+total);
		System.out.println("--------------------------------------------");
		//11.the average salary of male and female employees 
		emp.stream().map(e->e.getGender()).distinct().forEach(e->{
			double avgSalary = emp.stream().filter(gender->gender.getGender().equals(e)).mapToDouble(Employee::getSalary).average().orElse(0.0);
			System.out.println(e+" :"+avgSalary);
		});
		System.out.println("--------------------------------------------");
		//12.List of the names of all employees in each department
		emp.stream().map(Employee::getDepartment).distinct().forEach(dept -> {
			System.out.println("Department: " + dept);
	                emp.stream().filter(e -> e.getDepartment().equals(dept)).map(Employee::getName).forEach(System.out::println);
	        		   });
		System.out.println("--------------------------------------------");
		//13.the average salary and total salary of the whole organization
		OptionalDouble avg = emp.stream().mapToDouble(Employee::getSalary).average();
		double sum = emp.stream().mapToDouble(Employee::getSalary).sum();
		System.out.println("The Average salary of the whole organization is "+avg);
		System.out.println("The Total salary of the whole organization is"+sum);
		System.out.println("--------------------------------------------");
		//14. the employee whose salary are more than 25k
		System.out.println("The employees whose salary is greater that 25k");
		emp.stream().filter(e -> e.getSalary()>25000).map(Employee::getName).forEach(System.out::println);
		System.out.println("--------------------------------------------");
		//15.highest paid employee
		System.out.println("highest paid employee");
		Optional<Employee> highestPaid = emp.stream().max(Comparator.comparingDouble(Employee::getSalary));

		highestPaid.ifPresent(System.out::println);
          
		System.out.println("--------------------------------------------");
		
		//16. second highest paid employee in the organization
		System.out.println("second highest paid employee in the organization");
		Optional<Employee> secondHighestPaid = emp.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();

		secondHighestPaid.ifPresent(System.out::println);
		System.out.println("--------------------------------------------");
       //17.third highest paid employee in the organization
		System.out.println("third highest paid employee in the organization");
		Optional<Employee> thirdHighestPaid = emp.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(2).findFirst();

		thirdHighestPaid.ifPresent(System.out::println);
		System.out.println("--------------------------------------------");
	   //18. lowest paid employee in the organization
		System.out.println(" lowest paid employee in the organization");
		Optional<Employee> lowestPaid = emp.stream().max(Comparator.comparingDouble(Employee::getSalary).reversed());

		lowestPaid.ifPresent(System.out::println);
		System.out.println("--------------------------------------------");
	   //19. the second lowest paid employee in the organization
		System.out.println("the second lowest paid employee in the organization");
		Optional<Employee> SecondlowestPaid = emp.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).skip(1).findFirst();

		SecondlowestPaid.ifPresent(System.out::println);
		System.out.println("--------------------------------------------");
	  //20.  the first five lowest paid employee in the organization
		System.out.println("the first five lowest paid employee in the organization");
		emp.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).limit(5).forEach(System.out::println);

		System.out.println("--------------------------------------------");
		
	 //21. the first five highest paid employee in the organization
		System.out.println("the first five highest paid employee in the organization");
		 emp.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(5).forEach(System.out::println);

		
	}
	

}
