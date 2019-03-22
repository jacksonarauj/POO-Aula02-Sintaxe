/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio15;
import java.util.Scanner;
/**
 *
 * @author Jackson
 */
public class Exercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int vet[]=new int [5];
        for (int i=0;i<5;i++)
        {
         vet[i]=input.nextInt();
        
        }
     for (int i=0;i<5;i++){
          System.out.printf(" "+vet[i]+" ");
     }
    }  
}
