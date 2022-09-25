package Aula04;

import java.util.Scanner;

/* 32. Entrar com dois valores via teclado, onde o segundo deverá ser maior 
 * que o primeiro. Caso contrário solicitar novamente apenas o segundo valor.
 */

public class Aula04Ex32 {

	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	   
	    int num1, num2;
	   
	    System.out.printf("Digite o primeiro numero: ");
	    num1 = ler.nextInt();

	    System.out.printf("Digite o segundo numero: ");
	    num2 = ler.nextInt();
	   
	    while(num1 > num2) {
	        System.out.printf("O segundo numero deve ser maior que o primeiro, tente de novo: ");
	        num2 = ler.nextInt();
	    }

	    System.out.printf("O numero %d e maior que %d", num2, num1);
	    
	    ler.close();
	    
	}

}
