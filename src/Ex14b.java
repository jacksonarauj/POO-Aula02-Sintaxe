
public class Ex14b {

	public static void main(String args[]) {

		imprimeMensagem();

	}

	public static void imprimeMensagem() {

		for (int i = -1000; i < 1 ; i++) {			

				if ((i % 2 == -1) && (i % 9 == 0)) {

					System.out.println("O numero " + i + "eh impar e multiplo de Nove");

				}		
		}
	}
}