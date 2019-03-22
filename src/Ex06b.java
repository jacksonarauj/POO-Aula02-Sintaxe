import java.util.Scanner;

public class Ex06b {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num1 = entradaNumero(entrada, "Digite o primeiro n�mero inteiro e positivo");
		int num2 = entradaNumero(entrada, "Digite o segundo n�mero inteiro e positivo");
		
		int opcao = menu(entrada);
		
		operacao(opcao,num1,num2);
	}
	
	public static int entradaNumero(Scanner entrada, String mensagem) {
		
			System.out.println(mensagem);
			return entrada.nextInt();
	}
	
	public static int menu (Scanner entrada) {
		System.out.println("Por favor, escolha uma das op��es abaixo\n");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtra��o");
		System.out.println("3 - Multiplica��o");
		System.out.println("4 - Divis�o");
		return entrada.nextInt();		
		
	}
	
	public static void operacao(int opcao, int num1,int num2) {
	
		switch(opcao) {
		
		case 1:
			System.out.println("A op��o escolhida foi Soma");
			System.out.println("O resultado da soma � de " + num1 + " + " + num2 + " � " +  (num1+num2));
			break;
		case 2:
			System.out.println("A op��o escolhida foi Subtra��o");
			System.out.println("O resultado da subtra��o � de " + num1 + " - " + num2 + " � " +  (num1-num2));
			break;
		case 3:
			System.out.println("A op��o escolhida foi Multiplica��o");
			System.out.println("O resultado da multiplica��o � de " + num1 + " * " + num2 + " � " +  (num1*num2));
			break;
		case 4:
			System.out.println("A op��o escolhida foi Divis�o");
			if (num2 > 0) {
			System.out.println("O resultado da divis�o � de " + num1 + " / " + num2 + " � " +  (num1/num2));
			break;
			}if (num2 == 0) {
				System.out.println("N�o � poss�vel dividir por 0");
				break;
			}
			default:
				System.out.println("Op��o escolhida � inv�lida");
				break;
		
		}
	}
}

