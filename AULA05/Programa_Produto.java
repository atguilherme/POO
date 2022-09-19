package Aula05;

/* 49. Crie uma classe conforme o Diagrama de Classe (UML). 
 * Crie um programa que utilize essa classe para cadastrar 10 produtos em uma lista 
 * de produtos. Ao final exibir apenas os produtos cujo valor é menor do que 100 reais.
 */

import java.util.Scanner;

public class Programa_Produto {

	public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        

        Produto[] listaProdutos = new Produto[10];
       
        for (int i=0; i<=9; i++) {
            // Instancia (cria) o objeto
            Produto p = new Produto();
           

            System.out.printf("Digite o id do produto: ");
            p.id = ler.nextInt();
           
            System.out.printf("Digite a descricao do produto: ");
            p.descricao = ler.next();
        
            System.out.printf("Digite o valor do produto: ");
            p.valor = ler.nextDouble();
            
            System.out.printf("Digite a quantidade: ");
            p.quantidade = ler.nextDouble();


            listaProdutos[i] = p;            

        }
        
        for (int i=0; i<=9; i++) {
        	
        	if (listaProdutos[i].valor < 100 ) {
        		System.out.printf("\nProduto: %d, Descricao: %s, Valor: %.2f, Quantidade: %.2f", listaProdutos[i].id, listaProdutos[i].descricao, listaProdutos[i].valor, listaProdutos[i].quantidade);
        	}
        }

	}
}
