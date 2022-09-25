package Aula04;

import java.util.Scanner;

/* Fazer um programa para receber um número e validar se esse número é positivo. 
 * Após isso, exibir a tabuada de 1 a 10 desse número:
 * Exemplo usando o For
 */

public class Aula04Exemplo03 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        int num, t, i;
       
        System.out.printf("Digite um número positivo: ");
        num = ler.nextInt();
       
        while(num <= 0) {
            System.out.printf("Erro, número negativo! Digite um número positivo: ");
            num = ler.nextInt();
        }
       
        for (i=1; i<=10; i++) {
            t = num * i;
            System.out.printf("\n%d X %d = %d", num, i, t);
        }
        
        ler.close();
    }

}
