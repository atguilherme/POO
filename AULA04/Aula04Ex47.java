package Aula04;

import java.util.Scanner;

/* 47. Calcular o fatorial de um valor que ser� digitado. 
 * Este valor n�o poder� ser negativo. Enviar mensagem de erro 
 * e solicitar o valor novamente, se necess�rio. 
 * Perguntar se o usu�rio deseja ou n�o fazer um novo c�lculo, 
 * consistir a resposta em �S� ou �N�.
 * N! = N x N-1 x N-2 x N-3 x ....... x (N - (N-1))
 * Ex: 5! = 5 x 4 x 3 x 2 x 1 = 120
 */

public class Aula04Ex47 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Character resposta;
		
		do {
			int n = 0, total = 1;
			System.out.printf("Qual numero deseja o fatorial?: ");
			n = ler.nextInt();
			while(n < 1) {
				
				System.out.printf("Valor invalido! insira um numero maior que 1: ");
				n = ler.nextInt();
				
			}
			
			for(int x = n; x > 0; x--) {
				
				total *= x;
				
			}
			
			System.out.printf("fatorial foi de %d foi: %d\n", n, total);
			System.out.printf("Deseja executar novamente? (S/N): ");
			resposta = ler.next().charAt(0);
			
			while(resposta != 's' && resposta != 'S' && resposta != 'n' && resposta != 'N') {
				
				System.out.printf("Insira apenas as respostas S ou N\n");
				resposta = ler.next().charAt(0);
				
			}
			
		}while(resposta == 's' || resposta == 'S');
		
		System.out.printf("Finalizando Sistema...");
		
	}
}
