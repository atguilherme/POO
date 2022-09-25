package Aula04;

import java.util.Scanner;

/* 36. Entrar via teclado com um valor (X) qualquer. Travar a digita��o, 
 * no sentido de aceitar somente valores positivos. Solicitar o intervalo 
 * que o programa que dever� calcular a tabuada do valor digitado, 
 * sendo que o segundo valor (B), dever� ser maior que o primeiro (A), 
 * caso contr�rio, digitar novamente somente o segundo. Ap�s a valida��o 
 * dos dados, exibir a tabuada do valor digitado, no intervalo decrescente, 
 * ou seja, a tabuada de X no intervalo de B para A.
 */

public class Aula04Ex36 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int x, a, b;
		
		do {
			System.out.printf("Digite um numero positivo: ");
			x = ler.nextInt();
		}
		while(x <= 0);
		
		System.out.printf("Digite o primeiro numero: ");
		a = ler.nextInt();
		
		do {
			System.out.printf("Digite o segundo numero maior que o primeiro: ");
			b = ler.nextInt();
		}
		while(b <= a);
		
		for(; b >= a; b--) {
			System.out.printf("\n%d X %d = %d", b, x, (b * x));
		}

	}

}
