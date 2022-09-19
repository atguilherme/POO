package Aula02;

import java.util.Scanner;

// Entrar com seu nome e a nota que você tirou na P1. No final exibir a nota.

public class Aula02Exemplo02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double nota;
		String nome;
		
		System.out.printf("Informe o seu nome: ");
		nome = ler.nextLine();
		
		System.out.printf("Informe sua nota da P1: ");
		nota = ler.nextDouble();

		System.out.printf("%s, tirou %.2f na P1!", nome, nota);
		
		ler.close();
		
	}

}
