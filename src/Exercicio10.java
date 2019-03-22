/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio10;
 import java.util.Scanner;
/**
 *
 * @author Jackson
 */
public class Exercicio10 {

    public static void main(String[] args)   {
        Scanner input=new Scanner(System.in);
        int i=0;
        int total=0;
        int contador=1;
      
           while(contador!=0)
           {    i= input.nextInt(); 
                contador=i;
               total=total+i;
               i=i+1;
           }
           
     System.out.println("soma total:"+total);
                            }
                                           }
    
                     
