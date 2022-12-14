package Aula04;

import java.util.Scanner;

/* 44. Entrar via teclado com dez valores positivos. Consistir a digita??o 
 * e enviar mensagem de erro, se necess?rio. Ap?s a digita??o, exibir:
 * a) O maior valor;
 * b) A soma dos valores;
 * c) A m?dia aritm?tica dos valores;
 */

public class Aula04Ex44 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float num = 0, soma = 0, maior = 0;
		
		for(int i = 1; i < 11; i++) {
			
			do {
				System.out.printf("Digite um valor positivo: ");
				num = ler.nextFloat();
			}while(num <= 0);
			
			if(i == 0 || num > maior) {
				maior = num;
			}
			
			soma += num;
		}
		
		System.out.printf("A) Maior valor: %.2f\n", maior);
		System.out.printf("B) Soma dos valores: %.2f\n", soma);
		System.out.printf("C) Media dos valores: %.2f", (soma / 10));
	}
}
