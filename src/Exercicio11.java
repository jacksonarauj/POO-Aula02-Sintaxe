/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio11;

/**
 *
 * @author Jackson
 */
public class Exercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number=1;
        int cont=0;
        while(cont<1001){
            number=cont;
            if ((number %2==0)&&(number %3==0)){
                System.out.println("O numero  "+number+"  é par e multiplo de 3");
                
                                             }
            cont=cont+1;
                          }
            
    }
    
}
