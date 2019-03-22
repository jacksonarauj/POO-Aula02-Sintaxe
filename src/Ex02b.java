import java.util.Scanner;

public class Ex02b {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int a = lerEntradaNumero(entrada, "Digite um numero qualquer");
		int b = lerEntradaNumero(entrada, "Digite um numero qualquer");

		compararNumeros(a, b);

	}

	private static void compararNumeros(int a, int b) {
		if (a < b) {
			System.out.println("O número menor é " + a);
		} else if (b < a) {
			System.out.println("O número menor é " + b);
		} else {
			System.out.println("Os numeros são iguais");
		}
	}

	private static int lerEntradaNumero(Scanner entrada, String mensagem) {
		System.out.println(mensagem);
		return entrada.nextInt();
	}

}
