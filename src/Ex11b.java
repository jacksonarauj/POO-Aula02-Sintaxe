
public class Ex11b {

	public static void main(String args[]) {

		imprimeMensagem();
	}

	public static void imprimeMensagem() {

		for (int i = 0; i < 1001; i++) {

			if (i != 0) {

				if ((i % 2 == 0) && (i % 3 == 0)) {

					System.out.println("O numero " + i + "eh par e multiplo de tres");
				}
			}
		}
	}
}