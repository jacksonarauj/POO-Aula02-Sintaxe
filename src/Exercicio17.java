/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio17;
import java.util.Scanner;
/**
 *
 * @author Jackson
 */
public class Exercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input=new Scanner (System.in);
       int valor;
       int  vet[]= new int[10];
       int aux=0;
       for(valor=0;valor<10;valor++)
       {
          aux=input.nextInt();
       
         for(int j=0;j<valor;j++){
          
              if (aux==vet[j]){
                  while (aux==vet[j]){
                      System.out.println("nomero digitado é igual ao outro");
                      System.out.println("digite outro valor ");
                      for (int l=0;l<valor;l++){
                          System.out.println(vet[l]);
                      }
                  aux=input.nextInt();
                  
              }   
              j=-1;
       }
    }
       vet[valor]=aux;
}
}
}
