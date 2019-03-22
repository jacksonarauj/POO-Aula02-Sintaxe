/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio18;
import java.util.Scanner;

/**
 *
 * @author Jackson
 */
public class Exercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner (System.in);
        int vet[]= new int [10];
        int i=0;
        int aux=0;
        int menor;
           for(i=0;i<10;i++){
               vet[i]=input.nextInt();   
           }
             for(i=0;i<10;i++){
                 menor=i;
                 for(int j=(i+1);j<10;j++)
                 {
                     if (vet[j]<vet[menor]){
                         menor=j;  
                     }
                 }
                   aux=vet[i];
                   vet[i]=vet[menor];
                   vet[menor]=aux;
             }
             System.out.println("------------------------");
        System.out.println("numeros ordenados");
        
          for ( i = 0; i < 10; i++) {
            System.out.printf("%dºposiçao   valor  %d \n", i+1, vet[i]);
          }
    }
    
}
