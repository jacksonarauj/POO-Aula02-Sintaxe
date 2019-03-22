/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;
import java.util.Scanner;
/**
 *
 * @author Jackson
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        int aux=0;
        int i=0;
        int vet[]= new int[3];
         System.out.println("numeros desordenados");
             for (i=0;i<3;i++){
                  vet[i]=input.nextInt();
                
                              }
             
             for(i=0;i<3;i++){
                 for(int j=0;j<2;j++){
                     if(vet[j]>vet[j+1]){
                         aux=vet[j];
                         vet[j]=vet[j+1];
                         vet[j+1]=aux;
                                         }
                                     }
                             }
               System.out.printf("numers ordenados");
             for(i=0;i<3;i++){
                  System.out.println(""+vet[i]);
                             }
    } 
}
