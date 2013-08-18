package br.com.santarita.javabasico.exercicios.listagem4;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma opção");
		System.out.println("I - inclusão");
		System.out.println("P - pesquisa");
		char opcao;
		opcao = sc.next().charAt(0);
		switch (opcao) {
		case 'i':
		case 'I':
			System.out.println("Alteração");
			
		case 'p':
			System.out.println("Alteração");
		default:
			System.out.println("Opção inválida !");
		}

		teste
	}

}
