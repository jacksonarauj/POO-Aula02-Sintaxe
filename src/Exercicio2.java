/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author Jackson
 */
import java.util.Scanner;
public class Exercicio2{
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input;
        int number1;
        int number2;
        input = new Scanner(System.in);
        System.out.println("Enter the first number");
             number1=input.nextInt();
        System.out.println("Enter the second number");
             number2=input.nextInt();
             
        if(number1<number2)
        {System.out.printf("The first number is the smallest.");}
        else{
              if(number2<number1)
                  {System.out.printf("The second is the smallest.");}
            else{System.out.printf("The numbers you enter are the same.");}
        
        }
    }
    
}
