package Aula03;

import java.util.Scanner;
/*10. Entrar com dois valores quaisquer. Exibir o maior deles, se existir, 
 * caso contrário, enviar mensagem avisando que os números são idênticos.
 */

public class Aula03Ex10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.printf("Digite primeiro numero: ");
		n1 = ler.nextInt();
		
		System.out.printf("Digite segundo numero: ");
		n2 = ler.nextInt();
		
		if (n1 > n2) {
			System.out.printf("O numero %d e maior que %d", n1, n2);
		}else if (n1 < n2) {
			System.out.printf("O numero %d e maior que %d", n2, n1);					
		}else if (n1 == n2) {
			System.out.printf("Os numeros sao identicos");		
		}
		
		ler.close();
		
	}
}
