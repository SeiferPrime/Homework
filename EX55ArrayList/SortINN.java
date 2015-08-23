import java.util.*;
public class SortINN implements Comparator<Employee> {
	public int compare(Employee p1, Employee p2) {
		return p1.getINN() - p2.getINN();
	}
}