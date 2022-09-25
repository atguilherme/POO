package Aula04;

import java.util.Scanner;

/* Caso você queira pular uma iteração do looping, você pode utilizar o 
 * comando continue para isso
 */

public class Aula04Exemplo05 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        int num, t, i;
       
        System.out.printf("Digite um numero positivo: ");
        num = ler.nextInt();
       
        while(num <= 0) {
            System.out.printf("Erro, numero negativo! Digite um numero positivo: ");
            num = ler.nextInt();
        }
       
        for (i=1; i<=10; i++) {
            if (i == 8)
                continue;
           
            t = num * i;
            System.out.printf("\n%d X %d = %d", num, i, t);
        }
        
        ler.close();
    }

}
