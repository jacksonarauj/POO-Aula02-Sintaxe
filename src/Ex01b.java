
import java.util.Scanner;

public class Ex01b {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int a = lerEntradaNumero(entrada, "Digite um primeiro n�mero qualquer");
		int b = lerEntradaNumero(entrada, "Digite um segundo n�mero qualquer");

		compararNumeros(a, b);
	}

	private static int lerEntradaNumero(Scanner entrada, String mensagem) {

		System.out.println(mensagem);
		return entrada.nextInt();
	}

	private static void compararNumeros(int a, int b) {
		if (a > b) {
			System.out.println(a + " > " + b);
			System.out.println("O n�mero maior � " + a);
		} else if (b > a) {
			System.out.println(b + " > " + a);
			System.out.println("O n�mero maior � " + b);
		} else {
			System.out.println("Os numeros digitados foram " + a + " e " + b);
			System.out.println("Os numeros s�o iguais");
		}
	}

}
