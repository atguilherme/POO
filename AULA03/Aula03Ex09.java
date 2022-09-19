package Aula03;

import java.util.Scanner;
//9. Entrar via teclado, com dois valores distintos. Exibir o menor deles.

public class Aula03Ex09 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.printf("Digite primeiro numero: ");
		n1 = ler.nextInt();
		
		System.out.printf("Digite segundo numero: ");
		n2 = ler.nextInt();
		
		if (n1 < n2) {
			System.out.printf("O numero %d e menor que %d", n1, n2);
		}else {
			System.out.printf("O numero %d e menor que %d", n2, n1);		
		}		
	
		ler.close();
		
	}
}
