package Aula04;

import java.util.Scanner;

/* 43. Calcular e exibir a soma dos �N� primeiros valores da seq��ncia abaixo. 
 * O valor �N� ser� digitado, dever� ser positivo, mas menor que cinq�enta. 
 * Caso o valor n�o satisfa�a a restri��o, enviar mensagem de erro 
 * e solicitar o valor novamente.
 */
 
public class Aula04Ex43 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num;
		float soma = 0, p1 = 1;
		
		do {
		System.out.printf("Informe o tamanho da sequencia (1 >= n < 50): ");
		num = ler.nextInt();
		
		}while(num < 1 || num > 49);
		
		for(int x = 0; x < num; x++) {
		
			p1 += 2 * x + 1;
			soma += p1 / Math.pow((x + 1), 3);
			
		}
		
		System.out.printf("A soma dos primerios %d numeros da sequencia e: %.2f", num, soma);
	}
}
