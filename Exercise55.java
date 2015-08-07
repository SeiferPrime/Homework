class Employee {
	int[] INN = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	String[] Name = {"Vasya", "Masha", "Kolya", "Pasha", "Den4ik", "Dimon", "Vovan", "Kostyan", "Seva", "Lena"};
	String[] Surname = {"Voshkin", "Malinovskaya", "Pashkovskii", "Nikolay4enko", "Kymov", "Vaev", "Ykyrov", "Tolstui", "Toshii", "Golova4"};
	int[] Salary = {300, 250, 430, 125, 500, 700, 250, 100500, 100, 355};

}

class Exercise55 {
	public static void main(String[] args) {
    Employee work = new Employee();
    Report_a(work.INN, work.Name, work.Surname, work.Salary);
    Report_b(work.Salary);
    Report_c(work.INN, work.Name, work.Surname, work.Salary);
    Report_d(work.INN, work.Name, work.Surname, work.Salary);
	}

	static void Report_a(int[] INN, String[] Name, String[] Surname, int[] Salary) {
		for (int i = 0; i < 10; i++) {
			System.out.print(INN[i] + " ");
			System.out.print(Name[i] + " ");
			System.out.print(Surname[i] + " ");
			System.out.print(Salary[i]);
			System.out.println();
		}
	}

	static void Report_b(int[] Salary) {
		int result = 0;
		for (int i = 0; i < 10; i++) {
			result = result + Salary[i];
		}
		System.out.println("Sum = " + result);
	}

	static void Report_c(int[] INN, String[] Name, String[] Surname, int[] Salary) {
		int m = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (Salary[i] > Salary[j]) {
					m = j;
				}
			}
        }
        System.out.print(INN[m] + " ");
		System.out.print(Name[m] + " ");
		System.out.print(Surname[m] + " ");
		System.out.print(Salary[m]);
		System.out.println();
    }

	static void Report_d(int[] INN, String[] Name, String[] Surname, int[] Salary) {
		int m = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (Salary[i] < Salary[j]) {
					m = j;
				}
			}
        }
        System.out.print(INN[m] + " ");
		System.out.print(Name[m] + " ");
		System.out.print(Surname[m] + " ");
		System.out.print(Salary[m]);
		System.out.println();
    }    
}