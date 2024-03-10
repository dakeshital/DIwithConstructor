package SpringDIwithConstructor;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Company {

	private int cmpId;
	private String cmpName;
	private List<String> cmpProjects;
	private Set<String> cmpAddress;
	private Map<Integer, Employee> employees;

	public Company(int cmpId, String cmpName, List<String> cmpProjects, Set<String> cmpAddress,
			Map<Integer, Employee> employees) {
		super();
		this.cmpId = cmpId;
		this.cmpName = cmpName;
		this.cmpProjects = cmpProjects;
		this.cmpAddress = cmpAddress;
		this.employees = employees;
	}

	public void show() {
		System.out.println("Company Id: " + cmpId);
		System.out.println("Company Name: " + cmpName);

		System.out.println("Projects are:");
		Iterator<String> itr = cmpProjects.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Company Addresses are:");
		Iterator<String> itr2 = cmpAddress.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		System.out.println("Employees Information:");
		for (Map.Entry<Integer, Employee> entry : employees.entrySet()) {
			Integer employeeId = entry.getKey();
			Employee employee = entry.getValue();
			System.out.println("key: " + employeeId);
			System.out.println("values: " + employee);
		}
	}

}
