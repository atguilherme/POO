package Aula04;

import java.util.Scanner;

/* Fazer um programa para receber um número e validar se esse número é positivo. 
 * Após isso, exibir a tabuada de 1 a 10 desse número:
 * Exemplo usando Do.. While
 */

public class Aula04Exemplo02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        int num, t, i;
       
        do {
            System.out.printf("Digite um numero positivo: ");
            num = ler.nextInt();
        }
        while(num <= 0);
       
        i = 1;
       
        do {
            t = num * i;
            System.out.printf("\n%d X %d = %d", num, i, t);
            i++;            
        }
        while (i <= 10);
        
        ler.close();
    }

}
