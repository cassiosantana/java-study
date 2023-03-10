package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Employee> list = new ArrayList<>();

		String path = "src\\in.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String employee = br.readLine();
			while (employee != null) {
				String[] fields = employee.split(",");
				list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				employee = br.readLine();
			}

			Collections.sort(list);

			for (Employee emp : list) {
				System.out.println(emp.getName() + ", " + emp.getSalary());
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}