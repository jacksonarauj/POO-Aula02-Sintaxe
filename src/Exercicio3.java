/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;
import java.util.Scanner;
/**
 *
 * @author Jackson
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 Scanner input = new Scanner(System.in);
        int number  = 1;
        while(number !=0){
            System.out.println("Informe um número para verificar o Mês Correspondente ou 0 \npra sair do Sistema: ");
            number = input.nextInt();
            switch (number){
                case 1:
                    System.out.println("Janeiro");
                 
                    break;
                case 2:
                    System.out.println("Fevereiro");
                    break;
                case 3:
                    System.out.println("Março");
                    break;
                case 4:
                    System.out.println("Abril");
                    break;
                case 5:
                    System.out.println("Maio");
                    break;
                case 6:
                    System.out.println("Junho");
                    break;
                case 7:
                    System.out.println("Julho");
                    break;
                case 8:
                    System.out.println("Agosto");
                    break;
                case 9:
                    System.out.println("Setembro");
                    break;
                case 10:
                    System.out.println("Outubro");
                    break;
                case 11:
                    System.out.println("Novembro");
                    break;
                case 12:
                    System.out.println("Dezembro");
                    break;
                default:
                    System.out.println("Mês Inválido");
                case 0:
                    System.exit(number);
            }
        }
    }
}