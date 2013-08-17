package br.com.santarita.javabasico.exercicios.listagem3;

import java.util.Scanner;

public class Exercicio7 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Integer maior = 0;
		Integer menor = 0;

		for (int i = 1; i <= 20; i++) {
			System.out.println("Entre com um numero interio "+i + ": ");
			Integer entrada = sc.nextInt();
			if (i == 1) {
				maior = entrada;
				menor = entrada;
			}

			if (entrada > maior) {
				maior = entrada;
			}
			if (entrada < menor) {
				menor = entrada;
			}

		}
		System.out.println("o maior numero foi: " + maior);
		System.out.println("o menor numero foi: " + menor);

	}

}
