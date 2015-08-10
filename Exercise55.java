class Employee {
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

class Exercise55 {
	public static void main(String[] args) {
		Employee p1 = new Employee(1, "Vasya", "Voshkin", 300);
		Employee p2 = new Employee(2, "Masha", "Malinovskaya", 125);
		Employee p3 = new Employee(3, "Kolya", "Pashkovskiy", 430);
		Employee p4 = new Employee(4, "Pasha", "Nikolaychenko", 125);
		Employee p5 = new Employee(5, "Denchik", "Kymov", 500);
		Employee p6 = new Employee(6, "Dimon", "Vaev", 700);
		Employee p7 = new Employee(7, "Vovan", "Ukurov", 250);
		Employee p8 = new Employee(8, "Kostya", "Tolstui", 100500);
		Employee p9 = new Employee(9, "Seva", "Toshiy", 310);
		Employee p10 = new Employee(10, "Lena", "Golovach", 355);
		Employee p11 = new Manager(11, "Stas", "Melnik", 500, 1000000);
		Employee p12 = new Manager(12, "Kisa", "Vorobyaninov", 321);

		Employee[] arr = new Employee[12];

		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;
		arr[3] = p4;
		arr[4] = p5;
		arr[5] = p6;
		arr[6] = p7;
		arr[7] = p8;
		arr[8] = p9;
		arr[9] = p10;
		arr[10] = p11;
		arr[11] = p12;
		
		Report_a(arr);
		Report_c(arr);
		Report_d(arr);
		Report_b(arr);
		
	}

	static void Report_a(Employee[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}

	static void Report_b(Employee[] arr) {
		double Sum = 0;
		for (int i = 0; i < arr.length; i++) {
			Sum += arr[i].getSalary(); 
		}
		System.out.println("Total sum : " + Sum + "$");
		System.out.println();
	}

	static void Report_c(Employee[] arr) {
		double min = arr[0].getSalary();
		int n = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getSalary() < min) {
				n = i;
				min = arr[i].getSalary();
			}
		}
		for (int i = 0; i < arr.length; i++) {
		if (arr[n].getSalary() == arr[i].getSalary()) {
			n = i;
			System.out.println(arr[n]);
			}
		}
		System.out.println();
	}

	static void Report_d(Employee[] arr) {
		double max = arr[0].getSalary();
		int n = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getSalary() > max) {
				n = i;
				max = arr[i].getSalary();
			}
		}
		for (int i = 0; i < arr.length; i++) {
		if (arr[n].getSalary() == arr[i].getSalary()) {
			n = i;
			System.out.println(arr[n]);
			}
		}
		System.out.println();
	}	

}

class Manager extends Employee {
	private double bonus;

	public Manager(int a, String b, String c, double d) {
		super(a, b, c, d);
		bonus = 0;
	}

	public Manager(int a, String b, String c, double d, double e) {
		super(a, b, c, d);
		setbonus(e);
	}

	public double getbonus() {
		return bonus;
	}

	public void setbonus(double bonus) {
		this.bonus = bonus;
	}

	public double getSalary() {
		return super.getSalary() + getbonus();
	}

}