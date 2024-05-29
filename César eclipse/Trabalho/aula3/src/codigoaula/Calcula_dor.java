package codigoaula;

public class Calcula_dor {

	public static void main(String[] args) {
		int idade;
		msg();
		msg("César");
		idade = calcidade(2004, 2024);
		System.out.println(" a sua idade atual é " + idade );
	}

	public static void msg() {
		
		System.out.println("Bom dia");

	}

	public static void msg(String nome) {
		
		System.out.println("Bom dia " + nome);

	}
	public static void msg(int idade) {
		System.out.println("Bom dia" + idade);
	}
	public static int calcidade(int anonasc, int anoatual) {
		int idade = anoatual-anonasc;
		return idade;
	}
}
