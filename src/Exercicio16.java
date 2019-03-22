/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio16;
import java.util.Scanner;
/**
 *
 * @author Jackson
 */
public class Exercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int vet[]=new int[10];
        int i=0;
          for( i=0;i<10;i++)
          {
              vet[i]=input.nextInt();
          }  
            for ( i=9;i>-1;i--){
                System.out.printf(" "+vet[i]+" ");
                
            }
    }
    
}
