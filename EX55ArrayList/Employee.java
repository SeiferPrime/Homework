import java.util.*;
class Employee implements Comparable, Comparator<Employee>{
	private int INN;
	private String Name;
	private String SurName;
	private double Salary;

	public Employee() { }

	public Employee(int a) {
		setINN(a);
	}

	public Employee(int a, String b) {
		this(a);
		setName(b);
	}

	public Employee(int a, String b, String c) {
		this(a, b);
		setSurName(c);
	}

	public Employee(int a, String b, String c, double d) {
		this(a, b, c);
		setSalary(d);
	}

	public int compareTo(Object salary) {
		Employee tmp1 = (Employee)salary;
		if (this.getSalary() < tmp1.getSalary()) {
			return - 1;
		}
		else if (this.getSalary() > tmp1.getSalary()) {
			return 1;
		}
		return 0;
	}

	public int compare(Employee n1, Employee n2) {
		return n1.getName().compareTo(n2.getName());
	}

	public int getINN() {
		return INN;
	}

	public void setINN(int INN) {
		this.INN = INN;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getSurName() {
		return SurName;
	}

	public void setSurName(String SurName) {
		this.SurName = SurName;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double Salary) {
		this.Salary = Salary;
	}

	public String toString() {
		return "INN : " + getINN() + " Name : " + getName() + " Second name : " + getSurName() + " Salary : " + getSalary() + "$";
	}

}