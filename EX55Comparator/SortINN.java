import java.util.Comparator;
class SortINN implements Comparator<Employee> {
	public int compare(Employee n1, Employee n2) {
		return n1.getINN() - n2.getINN();
	}
}