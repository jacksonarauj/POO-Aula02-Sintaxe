/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;
import java.util.Scanner;
/**
 *
 * @author Jackson
 */
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int number1=0; 
        int number2=0;
        int operador=1;
        int total;
       
         System.out.println("Digite o  primeiro numero ");
            number1 =input.nextInt();
             number2 =input.nextInt();
        if ((number1 >=0)&&(number2 >=0)){
            System.out.println("digite o numero da operaçao que deseja fazer ");
           
        System.out.println("1- soma ");
        System.out.println("2-subtraçao");
        System.out.println("3-divisao");
        System.out.println("4- multiplicaçao");
         operador=input.nextInt();
             
              switch (operador){
                  case 1:
                      total=number1+number2;
                      System.out.println(total);
                      break;
                  case 2:
                      total=number1-number2;
                      System.out.println(total);
                      break;
                  case 3:
                      if(number2 ==0){
                          System.out.println("nao é possivel dividir por Zero");
                      }
                      else{
                      total=number1/number2;
                      System.out.println(total);}
                      break;
                  case 4:total=number1*number2;
                     System.out.println(total);
                     break;
                  default:
                      System.out.println("opção invalida ");
                 
                       
              }
        }  
        
              
              }
                  
        
    }
    

