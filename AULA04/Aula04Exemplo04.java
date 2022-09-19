package Aula04;

import java.util.Scanner;

/* Caso você queira interromper um looping, você pode utilizar o comando break para isso */

public class Aula04Exemplo04 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        int num, t, i;
       
        System.out.printf("Digite um número positivo: ");
        num = ler.nextInt();
       
        while(num <= 0) {
            System.out.printf("Erro, número negativo! Digite um número positivo: ");
            num = ler.nextInt();
        }
       
        i = 1;
               
        while (i <= 10) {
            t = num * i;
            System.out.printf("\n%d X %d = %d", num, i, t);
           
            if (i == 8)
                break;
           
            i++;
        }
        
        ler.close();
    }

}
