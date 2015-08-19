import java.util.Comparator;
import java.util.Arrays;
class Exercise{
	public static void main(String[] args) {
		Employee p1 = new Employee(1, "Vasya", "Voshkin", 300);
		Employee p2 = new Employee(1, "Masha", "Malinovskaya", 125);
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
		arr[2] = p10;
		arr[3] = p4;
		arr[4] = p5;
		arr[5] = p7;
		arr[6] = p6;
		arr[7] = p8;
		arr[8] = p9;
		arr[9] = p3;
		arr[10] = p11;
		arr[11] = p12;
		
		Report_a(arr);
		Report_c(arr);
		Report_d(arr);
		Report_b(arr);
		System.out.println();
		SortBySalary(arr);
		SortByName(arr);
		SortByINN(arr);
		
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

	static void SortBySalary(Employee[] arr) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}

	static void SortByName(Employee[] arr) {
		Arrays.sort(arr, new Employee());
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}

	static void SortByINN(Employee[] arr) {
		Arrays.sort(arr, new SortINN());
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}

}