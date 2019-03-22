import java.util.Scanner;

public class Ex12b {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		int num1 = entradaNumeros(entrada, "Digite o primeiro numero");
		int num2 = entradaNumeros(entrada, "Digite o Segundo numero");
		;

		int numerosiguais = comparaNumeros(num1, num2);

		if (numerosiguais == 0) {
			imprimeMensagem(num1, num2);
		} else {
			System.out.println("Os números são iguais");

		}
	}

	public static int entradaNumeros(Scanner entrada, String mensagem) {

		System.out.println(mensagem);
		return entrada.nextInt();
	}

	public static int comparaNumeros(int num1, int num2) {

		if (num1 != num2) {

			return 0;

		} else {
			return 1;
		}
	}

	public static void imprimeMensagem(int num1, int num2) {

		for (int i = 0; i < 1001; i++) {
			if (i != 0) {
				if ((i % num1 == 0) && (i % num2 == 0)) {
					System.out.println("O numero " + i + "eh  multiplo de " + num1 + " e " + num2);

				}
			}
		}
	}

}