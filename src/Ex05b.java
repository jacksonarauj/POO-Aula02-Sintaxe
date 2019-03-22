import java.util.Scanner;

public class Ex05b {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int opcao1 = mostraMenu(entrada);

		mostraOpcao(opcao1);

	}

	public static int mostraMenu(Scanner entrada) {
		int opcao = 0;

		System.out.println("Por favor, escolha uma das op��es abaixo");
		System.out.println("1 - Venda a vista no dinheiro");
		System.out.println("2 - Venda a vista no d�bito");
		System.out.println("3 - 1x no cart�o de cr�dito");
		System.out.println("4 - 3x com juros no cart�o de cr�dito");
		System.out.println("5 - 6x no cart�o de cr�dito");
		return opcao = entrada.nextInt();
	}

	public static void mostraOpcao(int opcao) {

		switch (opcao) {
		case 1:
			System.out.println("Desconto de 12%");
			break;
		case 2:
			System.out.println("Desconto de 3%");
			break;
		case 3:
			System.out.println("Mesmo pre�o");
			break;
		case 4:
			System.out.println("Acr�scimo de 5%");
			break;
		case 5:
			System.out.println("Acr�scimo de 10%");
			break;
		default:
			System.out.println("Opcao inv�lida");
			break;
		}
	}
}
