package Advanced;

import java.util.ArrayList;
import java.util.List;

public class Stream_Arithmetic {

	public static class Employee{
		public String salary;

		public Employee(String salary){
			this.salary = salary;
		}

	}

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("50000"));
		list.add(new Employee("60000"));
		list.add(new Employee("40000"));

		int sum =
				list.stream()
				.map(employee -> employee.salary)
				.map(Integer::parseInt)									//convert string to int
				.reduce(0,(tempSum, value) -> tempSum + value);  //reduce loops through the stream, 0 is the start position, takes in two values to store the temp value and the value. tempSum is populated by the salary then added to value in iterations

		//simplified
		int sum2=
				list.stream()
						.map(employee -> employee.salary)
						.map(Integer::parseInt)									//convert string to int
						.reduce(0, Integer::sum);

		System.out.println("salary sum = " + sum);
		System.out.println("salary sum simplified  = " + sum2);
	}
}
