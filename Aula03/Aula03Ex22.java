package Aula03;

import java.util.Scanner;

/* 22. Exibir o seguinte seletor de opções e em função de uma escolha, 
 * solicitar os dados necessários para o cálculo da respectiva área. 
 * Enviar mensagem de erro se o usuário escolher uma opção inexistente.
 * Encerrar o programa somente quando selecionada a opção de finalização. 
 * (Fazer esse exercício utilizando If..Else e/ou Case)
 * 1 – Triângulo
 * 2 – Quadrado
 * 3 – Retângulo
 * 4 – Círculo
 * 5 – Fim de processo
 */

public class Aula03Ex22 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int opc;
		double base, altura, raio, area;
		
		do {
			
			System.out.println("Menu de Opcoes:");
			System.out.println("Opcao 1 - Area de um triangulo.");
			System.out.println("Opcao 2 - Area de um quadrado.");
			System.out.println("Opcao 3 - Area de um retangulo.");
			System.out.println("Opcao 4 - Area de circulo.");
			System.out.println("Opcao 5 - Finalizar processo.");
			System.out.printf("Digite a opcao desejada: ");
			opc = ler.nextInt();
			
			switch(opc) {
				case 1:
					
					System.out.printf("Digite o tamanho da base do triangulo: ");
					base = ler.nextDouble();					
					System.out.printf("Digite o tamanho da altura do triangulo: ");
					altura = ler.nextDouble();
					area = ( base * altura ) / 2;
					System.out.printf("A area do triangulo e igual a: %.2f.\n", area);
					break;
					
				case 2:
					
					System.out.printf("Digite o tamanho da aresta do quadrado: ");
					base = ler.nextDouble();	
					area = base * base;
					System.out.printf("A area do quadrado e igual a: %.2f.\n", area);
					break;
					
				case 3:
					
					System.out.printf("Digite o tamanho da base do retangulo: ");
					base = ler.nextDouble();
					System.out.printf("Digite o tamanho da altura do retangulo: ");
					altura = ler.nextDouble();
					area = base * altura;
					System.out.printf("A area do retanfulo e igual a: %.2f.\n", area);
					break;
					
				case 4:
					
					System.out.printf("Digite o tamanho do raio do circulo: ");
					raio = ler.nextDouble();			
					area = 3.14 * ( raio * raio );
					System.out.printf("A area do circulo e igual a: %.2f.\n", area);
					break;
					
				case 5:
					
					System.out.println("Saindo do Sistema...");
					System.exit(0);
					break;

				default:
					
					System.out.printf("Opcao invalida. Digite outra opcao.\n");
					
			}
			
		}while(opc!=5);
		
		ler.close();
	}
	
}
