package application115;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		// Exercicio da aula 115 - Composição
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.print("Enter department´s name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName)); 
		/*instanciou um novo objeto do tipo Worker. Dados do objeto sao os argumentos
		associado ao objeto worker, tem outro objeto do tipo Departamento (nome do departamento vai ser aquilo que eu digitar)*/
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		
		//for pra ler dados dos contratos
		for (int i=1; i<=n; i++) {
			System.out.println("Enter contract #"+i+" data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next()); //passando o string pro parse por meio do sc.next
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours); //instanciando o contrato
			
			//para associar o contrato com o trabalhador chama o metodo abaixo:
			worker.addContract(contract); //passando contract como argumento, faz com que o contrato seja associado ao trabalhador
			System.out.println();
		}
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));//recortar string manualmente_Parse int serve pra converter essa string para inteiro
		int year = Integer.parseInt(monthAndYear.substring(3)); //vai recortar da posição 3 em diante
			System.out.println("Name: " + worker.getName());
			System.out.println("Department: " + worker.getDepartment().getName()); //composição de objetos, ex: tem o objeto trabalhador, vai acessar outro objeto associado a ele, e depois acessa o nome
			System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));	
		
		sc.close();
	}

}
