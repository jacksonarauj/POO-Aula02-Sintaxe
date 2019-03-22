/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio14;

/**
 *
 * @author Jackson
 */
public class Exercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i=0 ;
        for(i=-1000;i<1;i++){
            if (i!=0){
                if((i%2==1)&& (1%9==0)){
                    System.out.println("esse numero"+i+"impar e multiplo de 9 ");
                }
            }
        }
    }
}