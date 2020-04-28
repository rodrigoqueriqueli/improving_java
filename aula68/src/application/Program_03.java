package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program_03 {

	public static void main(String[] args) {
		// Exericio 03 dos propostos aula 68
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student aluno = new Student();
		
		System.out.println("Digite o nome do aluno: ");
		aluno.name = sc.nextLine();
		System.out.println("Digite as 3 notas do aluno: ");
		aluno.grade1 = sc.nextDouble();
		aluno.grade2 = sc.nextDouble();
		aluno.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", aluno.finalGrade());
		
		if (aluno.finalGrade() < 60.0) {	
			System.out.println("FAILED");
			System.out.printf("Missing %.2f POINTS", aluno.missingPoints());
		}
		else {
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
