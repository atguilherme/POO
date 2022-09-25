package Aula04;

import java.util.Scanner;

/* 45. Entrar via teclado com �N� valores quaisquer. O valor �N� 
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
 */

public class Aula04Ex45 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num;
		double numero, maior = 0, menor = 0, media = 0, percNeg = 0, soma = 0;
		
		System.out.printf("Quantidades de numeros a digitar: ");
		num = ler.nextInt();
		
		while(num < 1 || num > 20) {
			
			System.out.printf("Valor invalido! insira entre 1 e 20: ");
			num = ler.nextInt();
			
		}
		for(int x = 0; x < num; x++) 
		{
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
		
		media = soma / num;
		
		System.out.printf("O maior valor e: %.2f\n", maior);
		System.out.printf("O menor valor e: %.2f\n", menor);
		System.out.printf("A soma dos valores e: %.2f\n", soma);
		System.out.printf("A media e: %.2f\n", media);
		System.out.printf("A porcentagem dos valores positivos e: %.2f%%\n", ((num - percNeg) * 100) / num);
		System.out.printf("A porcentagem dos valores negativos e: %.2f%%\n", (percNeg * 100) / num);

	}
}
