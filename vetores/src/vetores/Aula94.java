package vetores;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeAula94;

public class Aula94 {

	public static void main(String[] args) {
		// Aula 94 - Exercicio de fixação

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<EmployeeAula94> list = new ArrayList<>();

		// PART 1 - READING DATA:

		System.out.print("How many employees will be registered: ");
		int n = sc.nextInt();
		System.out.println();

		for (int i = 1; i <= n; i++) {
			System.out.printf("Employe #%d: %n", i);
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new EmployeeAula94(id, name, salary));
			System.out.println();
		}

		// PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:

		System.out.print("Enter the employee id that will have the salary increase: ");
		int id = sc.nextInt();
		EmployeeAula94 aumento = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (aumento == null) {
			System.out.println("This id does not exist!");
		} 
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			aumento.increaseSalary(percentage);
		}

		// Part 3 - Listing employees:

		System.out.println();
		System.out.println("List of Employees: ");
		
		for (EmployeeAula94 obj : list) {
			System.out.println(obj);
		}

		sc.close();
	}

}
