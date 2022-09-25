package Aula03;

import java.util.Scanner;

/* Desenvolver um programa que solicite a digitação de um número de 1 a 4, 
 * após digitar o número o programa deve dizer “Você escolheu X”. Caso o número 
 * seja diferente de 1, 2, 3 ou 4, retornar a mensagem “Número inválido”.
 */

public class Aula03Exemplo03 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        System.out.println("Entre com um numero entre 1 e 4:");
        int num = ler.nextInt();
       
        switch (num) {
           case 1:
             System.out.println("Voce escolheu 1");
             break;
           case 2:
             System.out.println("Voce escolheu 2");
             break;
           case 3:
             System.out.println("Voce escolheu 3");
             break;
           case 4:
             System.out.println("Voce escolheu 4");
             break;
           default:
             System.out.println("Numero invalido");
       }
        
        ler.close();
   }
    
}
