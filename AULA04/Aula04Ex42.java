package Aula04;

import java.util.Scanner;

/* 42. Calcular e exibir a soma dos �N� primeiros valores da seq��ncia
 * do exerc�cio. O valor �N� ser� digitado, dever� ser positivo, 
 * mas menor que cinq�enta. Caso o valor n�o satisfa�a a restri��o, 
 * enviar mensagem de erro e solicitar o valor novamente.
 */
 
public class Aula04Ex42 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num;
		float soma = 0, y = 1;
		
		do {
		System.out.printf("Informe o tamanho da sequencia (1 >= n < 50): ");
		num = ler.nextInt();
		}
		while(num < 1 || num > 49);
		
		for(int x = 0; x < num; x++) {
			soma += y / (y + 1);
			y++;
		}
		
		System.out.printf("A soma dos primerios %d numeros da sequencia e: %.2f", num, soma);

	}
}
