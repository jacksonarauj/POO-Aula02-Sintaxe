import java.util.Scanner;

public class Ex04b {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// int vetnumeros[] = new int [3];
		int vetnumeros[] = lerNumeros(entrada, "Digite o primeiro número");
		// int b = lerNumeros (entrada, "Digite o segundo número");
		// int c = lerNumeros (entrada, "Digite o terceiro número");

		mostrarNumeros(vetnumeros);
		// System.out.println("main " + vetnumeros.length);
		vetnumeros = ordenarNumeros(vetnumeros);

		mostrarNumeros(vetnumeros);

	}

	private static int[] lerNumeros(Scanner entrada, String mensagem) {
		int vet[] = new int[3];
		for (int i = 0; i < vet.length; i++) {
			System.out.println(mensagem);
			vet[i] = entrada.nextInt();
		}
		return vet;
	}

	public static int[] ordenarNumeros(int[] vet) {
		int aux = 0;
		// System.out.println("ordenarNumeros " + vet.length);
		for (int i = 0; i < vet.length; i++) {
			for (int j = 0; j < vet.length - 1; j++) {
				if (vet[j] > vet[j + 1]) {
					aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
				}
			}
		}
		return vet;
	}

	private static void mostrarNumeros(int[] vet) {

		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}

	}
}
