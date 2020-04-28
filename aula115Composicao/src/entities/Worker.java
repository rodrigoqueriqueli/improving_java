package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	// atributos básicos:
	private String name;
	private WorkerLevel level;
	private Double baseSalary;

	// fazendo as associações:
	private Department department;
	private List<HourContract> contracts = new ArrayList<>(); // fazendo a instanciação da lista(tem que instanciar) ja
																// na hora de declarar o atributo, lista começa vazia

	public Worker() {

	}

	// a lista não vai no construtor (atributos tem muitos, ou seja, lista)
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) {
		contracts.add(contract);
	}

	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}

	public Double income(int year, int month) {
		double sum  = baseSalary;

		Calendar cal = Calendar.getInstance();
		// for each pra verificar se o contrato corresponde a data de pesquisa. Se o contrato for do mes e ano entra na variavel sum
		for (HourContract  c : contracts) { //para cada contrato c na lista de contracts faz:
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH); //mes do Calendar começa com zero, por isso adiciona 1
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;

	}
}
