import java.util.Scanner;

public class Ex06b {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num1 = entradaNumero(entrada, "Digite o primeiro número inteiro e positivo");
		int num2 = entradaNumero(entrada, "Digite o segundo número inteiro e positivo");
		
		int opcao = menu(entrada);
		
		operacao(opcao,num1,num2);
	}
	
	public static int entradaNumero(Scanner entrada, String mensagem) {
		
			System.out.println(mensagem);
			return entrada.nextInt();
	}
	
	public static int menu (Scanner entrada) {
		System.out.println("Por favor, escolha uma das opções abaixo\n");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		return entrada.nextInt();		
		
	}
	
	public static void operacao(int opcao, int num1,int num2) {
	
		switch(opcao) {
		
		case 1:
			System.out.println("A opção escolhida foi Soma");
			System.out.println("O resultado da soma é de " + num1 + " + " + num2 + " é " +  (num1+num2));
			break;
		case 2:
			System.out.println("A opção escolhida foi Subtração");
			System.out.println("O resultado da subtração é de " + num1 + " - " + num2 + " é " +  (num1-num2));
			break;
		case 3:
			System.out.println("A opção escolhida foi Multiplicação");
			System.out.println("O resultado da multiplicação é de " + num1 + " * " + num2 + " é " +  (num1*num2));
			break;
		case 4:
			System.out.println("A opção escolhida foi Divisão");
			if (num2 > 0) {
			System.out.println("O resultado da divisão é de " + num1 + " / " + num2 + " é " +  (num1/num2));
			break;
			}if (num2 == 0) {
				System.out.println("Não é possível dividir por 0");
				break;
			}
			default:
				System.out.println("Opção escolhida é inválida");
				break;
		
		}
	}
}

