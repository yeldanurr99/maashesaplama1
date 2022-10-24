package maasHesaplama;

public class Employee {
	public class Employee {
		String name;
		double salary;
		int workHours;
		int hireYear;
		
		public Employee(String name, double salary, int workHours, int hireYear) {
			this.name = name;
			this.salary = salary;
			this.workHours = workHours;
			this.hireYear = hireYear;
		}
		
		public double tax() {
			double tempSalary = this.salary;
			double tax = 1;
			if(this.salary > 1000) {
				tax = tempSalary *= 0.03;
			}
			return tax;
			
		}
		
		public double bonus() {
			double bonus = 1;
			if(this.workHours > 40) {
				bonus = (this.workHours - 40) * 30;
			}
			return bonus;
		}
		
		public double raiseSalary() {
			if((2021 - this.hireYear) < 10) {
				double tempSalary = this.salary;
				return tempSalary *= 0.05;
				
			}else if((2021 - this.hireYear) > 9 && (2021 - this.hireYear) < 20) {
				double tempSalary = this.salary;
				return tempSalary *= 0.1;
				
			}else {
				double tempSalary = this.salary;
				return tempSalary *= 0.15;
				
			}
		}

		@Override
		public String toString() {
			
			double total = this.salary - tax() + bonus();
			
			return "Ad� : " + this.name + "\n" +
				   "Maa�� : " + this.salary + "\n" +
				   "�al��ma saati : " + this.workHours + "\n" +
				   "Ba�lang�� y�l� : " + this.hireYear + "\n" +
				   "Vergi : " + tax() + "\n" +
				   "Bonus : " + bonus() + "\n" +
				   "Maa� Art��� : " + raiseSalary() + "\n" +
				   "Bonuslarla birlikte maa� art��� : " + total + "\n" +
				   "Toplam Maaa� : " + (total + raiseSalary());
		}
		

}
