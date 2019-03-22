import java.util.Scanner;

public class Ex10b {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int somanumeros = entradaNumeros(entrada);
		mostraSoma(somanumeros);
	}

	public static int entradaNumeros(Scanner entrada) {
		int vetnumeros[] = new int[20];
		int numero = 0;
		int soma = 0;
		for (int i = 0; i < 20; i++) {
			System.out.println("Por favor digite o " + (i + 1) + ": ");
			numero = entrada.nextInt();
			if (numero != 0) {
				vetnumeros[i] = numero;
				soma = soma += vetnumeros[i];
			} else {
				i = 20;
			}

		}
		return soma;
	}

	public static void mostraSoma(int soma) {

		System.out.println("O resultado da soma dos numeros é: " + soma);
	}
}
