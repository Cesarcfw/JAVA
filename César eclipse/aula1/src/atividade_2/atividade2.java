package atividade_2;
import java.util.Scanner;

public class atividade2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double tempo1, tempo2;
		String nome1, nome2;
		int idade1, idade2;
		char sexo1, sexo2;
		System.out.print("Nome da primeira pessoa: ");
		nome1 = sc.nextLine();
		System.out.print("tempo de trabalho da primeira pessoa: ");
		tempo1 = sc.nextDouble();
		System.out.print("Nome da segunda pessoa: ");
		sc.nextLine();
		nome2 = sc.nextLine();
		System.out.print("Tempo de trabalho da segunda pessoa: ");
		tempo2 = sc.nextDouble();
		System.out.print("Digite a idade da primeira pessoa: ");
		idade1 = sc.nextInt();
		System.out.print("Digite a idade da segunda pessoa: ");
		idade2 = sc.nextInt();
		System.out.print("Digite o sexo da primeira pessoa (F/M): ");
		sexo1 = sc.next().charAt(0);
		System.out.print("Digite o sexo da segunda pessoa (F/M): ");
		sexo2 = sc.next().charAt(0);
		System.out.println("Nome da 1 pessoa: " + nome1);
		System.out.println("tempo de trabalho da 1: " + String.format("%.2f horas", tempo1));
		System.out.println("Nome da 2 pessoa: " + nome2);
		System.out.println("Tempo de trabalho da 2 pessoa: " + String.format("%.2f horas", tempo2));
		System.out.println("Idade da primeira pessoa: " + idade1);
		System.out.println("Sexo da primeira pessoa: " + sexo1);
		System.out.println("Idade da segunda pessoa: " + idade2);
		System.out.println("Sexo da segunda pessoa: " + sexo2);
		
		sc.close();
	}
}
