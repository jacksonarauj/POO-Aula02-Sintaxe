
public class Ex09b {

	public static void main(String[] args) {

		repete();
	}

	public static void repete() {
		int soma = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Soma na pos (" + (i + 1) + ") = " + (soma += i + 1));
		}
	}
}
