package Aula04;

import java.util.Scanner;

/* 46. Entrar via teclado com �N� valores quaisquer. O valor �N� 
 * (que representa a quantidade de n�meros) ser� digitado, 
 * dever� ser positivo, mas menor que vinte. Caso a quantidade 
 * n�o satisfa�a a restri��o, enviar mensagem de erro e solicitar 
 * o valor novamente. Ap�s a digita��o dos �N� valores, exibir:
 * a) O maior valor;
 * b) O menor valor;
 * c) A soma dos valores;
 * d) A m�dia aritm�tica dos valores;
 * e) A porcentagem de valores que s�o positivos;
 * f) A porcentagem de valores negativos;
 * Ap�s exibir os dados, perguntar ao usu�rio se deseja ou n�o uma 
 * nova execu��o do programa. Consistir a resposta no sentido de aceitar 
 * somente �S� ou �N� e encerrar o programa em fun��o dessa resposta.
 */


public class Aula04Ex46 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Character resposta;
		
		do{
			int n = 0;
			double numero, maior = 0, menor = 0, media = 0, percNeg = 0, soma = 0;
			System.out.printf("Quantidade de numeros a digitar: ");
			n = ler.nextInt();
			
			while(n < 1 || n > 20) {
				
				System.out.printf("Erro!! Valor invalido! insira entre 1 e 20: ");
				n = ler.nextInt();
				
			}
			
			for(int x = 0; x < n; x++) {
				
				System.out.printf("Insira um numero: ");
				numero = ler.nextDouble();
				
				if(numero > maior || x == 0) {
					
					maior = numero;
				}
				
				if(numero < menor || x == 0) {
					
					menor = numero;
					
				}
				
				if(numero < 0) {
					
					percNeg += 1;
					
				}
				
				soma += numero;
				
			}
			
			media = soma / n;
			System.out.printf("O maior valor e: %.2f\n", maior);
			System.out.printf("O menor valor e: %.2f\n", menor);
			System.out.printf("A soma dos valores e: %.2f\n", soma);
			System.out.printf("A media e: %.2f\n", media);
			System.out.printf("A porcentagem dos valores positivos e: %.2f%%\n", ((n - percNeg) * 100) / n);
			System.out.printf("A porcentagem dos valores negativos e: %.2f%%\n", (percNeg * 100) / n);
			System.out.printf("Deseja executar o programa novamente?(S/N): ");
			resposta = ler.next().charAt(0);
			while(resposta != 's' && resposta != 'S' && resposta != 'n' && resposta != 'N') 
			{
				System.out.printf("Insira apenas as respostas S ou N\n");
				resposta = ler.next().charAt(0);
			}
		}
		while(resposta == 's' || resposta == 'S');
		System.out.printf("Finalizando Sistema...");

	}
}
