package aluno1;

public class Aluno {

	public static void main(String[] args) {

		int idade;
		double salario, altura;
		char genero;
		String nome;
		idade = 19;
		salario = 0.00;
		altura = 1.71;
		genero = 'M';
		nome = "César Chaves";
		System.out.println("IDADE = " + idade);
		System.out.println("SALARIO = " + String.format("%.2f", salario));
		System.out.println("ALTURA = " + String.format("%.2f", altura));
		System.out.println("GENERO = " + genero);
		System.out.println("NOME = " + nome);
	}

}
