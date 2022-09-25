package Aula04;

import java.util.Scanner;

/* 49. Crie um programa que solicite que o usu�rio entre com dois n�meros 
 * (inicial e final). Ao final o programa dever� apresentar o valor total 
 * da soma de todos os n�meros do intervalo digitado pelo usu�rio
 */

public class Aula04Ex49 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int soma=0;
		
		System.out.printf("Insira o numero inicial: ");
		int nIni = ler.nextInt();
		
		System.out.printf("Insira o numero final: ");
		int nFim = ler.nextInt();
		
		while(nFim <= nIni) {
			
			System.out.printf("O numero final deve ser maior que o inicial: ");
			nFim = ler.nextInt();
			
		}
		
		for(int x = nIni; x <= nFim; x++)	{
			
			soma+=x;
			
		}
		
		System.out.printf("A soma da sequencia de numeros entre %d e %d e: %d", nIni, nFim, soma);

	}
}
