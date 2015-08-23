import java.util.*;
public class SortName implements Comparator<Employee> {
	public int compare(Employee n1, Employee n2) {
		return n1.getName().compareTo(n2.getName());
	}
}