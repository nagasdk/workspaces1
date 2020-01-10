package stringops;

public class EmployeeCompariions {

	public static void main(String[] args) {

		
		Employee e1 = new Employee("td", 123, 1000.00);
		Employee e2 = new Employee("td", 123, 1000.00);
		System.out.println(e1 ==e2);
		System.out.println(e1.equals(e2));
	}

}
