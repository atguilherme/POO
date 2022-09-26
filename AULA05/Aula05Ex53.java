package Aula05;

import java.util.Scanner;

/* 53. Crie uma classe conforme o Diagrama de Classe (UML). 
 * Crie um programa que utilize essa classe para cadastrar 5 alunos 
 * em uma lista de alunos. Durante o cadastro do aluno, solicitar para o 
 * aluno cadastrar a sigla/iniciais das 6 matérias que ela está cursando 
 * no momento. Ao final exibir apenas os alunos do período “noite”.
 */

public class Aula05Ex53 {

	public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        
        Aluno[] listaAlunos = new Aluno[5];
       
        for (int i = 0; i < 5; i++) {

            Aluno a = new Aluno();
           
            System.out.printf("Digite o RA do Aluno: ");
            a.ra = ler.next();
           
            System.out.printf("Digite o nome do Aluno: ");
            a.nome = ler.next();
            
            System.out.printf("Digite o Periodo de estudo do Aluno: ");
            a.periodo = ler.next();

            for (int y = 0; y < 6; y++) {
            	
            System.out.printf("Digite as iniciais das materias: ");
            a.materias[y] = ler.next();
            
            }
          
            System.out.printf("\n");
            
	        listaAlunos[i] = a;            

        }
        
        for (int i = 0; i < 5; i++)
        {
            if(listaAlunos[i].periodo .equals("noite")) {        
            
            System.out.printf("\nRA: %s \nNome: %s \nPeriodo: %s", listaAlunos[i].ra, listaAlunos[i].nome, listaAlunos[i].periodo);
            
            }    
        }    
        
        ler.close();
	}

}
