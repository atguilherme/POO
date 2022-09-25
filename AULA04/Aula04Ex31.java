package Aula04;

import java.util.Scanner;

/* 31. Criar uma rotina de entrada que aceite somente um valor positivo. */

public class Aula04Ex31 {

	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	   
	    int num;
	   
	    System.out.printf("Digite um numero positivo: ");
	    num = ler.nextInt();
	   
	    while(num <= 0) {
	        System.out.printf("Erro, numero negativo! Digite um numero positivo: ");
	        num = ler.nextInt();
	    }

	    System.out.printf("Voce digitou o numero positivo: %d", num);
	    
		ler.close();
		
	}

}
