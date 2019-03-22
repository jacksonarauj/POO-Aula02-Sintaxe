import java.util.Scanner;

public class Ex18b {

	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		int vetnumeros[] = entradaNumeros(entrada, "Digite um numero");
		vetnumeros = ordenaVetor(vetnumeros);
		imprimeMensagem(vetnumeros, 10);

	}

	public static int[] entradaNumeros(Scanner entrada, String mensagem) {
		int vetnumeros[] = new int[10];
		int numero;

		for (int i = 0; i < 10; i++) {
			System.out.println(mensagem);
			vetnumeros[i] = entrada.nextInt();

		}
		return vetnumeros;
	}

	public static int[] ordenaVetor(int[] vetnumeros) {

		int j = 0, i = 0, aux = 0;

		for (i = 0; i < 10; i++) {

			for (j = 0; j < 9; j++) {
				if (vetnumeros[j] > vetnumeros[j + 1]) {
					aux = vetnumeros[j];
					vetnumeros[j] = vetnumeros[j + 1];
					vetnumeros[j + 1] = aux;
				}
			}
		}
		return vetnumeros;
	}

	public static void imprimeMensagem(int[] vetnumeros, int i) {

		for (int j = 0; j < i; j++) {

			System.out.println(vetnumeros[j]);
		}
	}
}
