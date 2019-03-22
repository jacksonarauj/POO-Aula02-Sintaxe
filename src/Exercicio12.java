/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio12;
import java.util.Scanner;
/**
 *
 * @author Jackson
 */
public class Exercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number1=input.nextInt();
        int number2=input.nextInt();
         
        if (((number1>0)&& (number2>0)) && ((number1<11) && (number2<11))){
             for (int i=0;i<1000;i++){
                 if ((i %number1==0)&&(i %number2==0))
                     System.out.println("esse numero"+i+" é multiplo de :"+number1+" e "+number2);  
                                     }    
          }
    }
    
}
