import java.util.Scanner;

public class Ex15b {

	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		int vetnumeros[] = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um numero");
			vetnumeros[i] = entrada.nextInt();
		}

		for (int i = 0; i < 5; i++) {
			System.out.println(vetnumeros[i]);
		}
	}
}