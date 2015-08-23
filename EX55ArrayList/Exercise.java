import java.util.*;
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
		
		ArrayList<Employee> ts = new ArrayList<Employee>(Arrays.asList(arr));

		System.out.println(ts);

		Collections.sort(ts);

		for (Employee e : ts) {
			System.out.println(e);
		}

		System.out.println();

		Collections.sort(ts, new SortName());

		for (Employee p : ts) {
			System.out.println(p);
		}

		System.out.println();
		
		Collections.sort(ts, new SortINN());

		for (Employee k : ts) {
			System.out.println(k);
		}
	}
}