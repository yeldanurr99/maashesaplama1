package maasHesaplama;

public class Main {
public static void main(String[] args) {
		
		Employee employee = new Employee("Kemal", 2000.0, 45, 1985);
		employee.tax();
		employee.bonus();
		employee.raiseSalary();
		System.out.println(employee.toString());
	}
}
