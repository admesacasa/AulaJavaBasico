package br.com.santarita.javabasico.exercicios.listagem1;

import java.util.Scanner;

public class Exercicio3 {

	private static Scanner sc;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("entre com o valor de A: ");
		String a = sc.next();
		System.out.println("entre com o valor de B: ");
		String b = sc.next();

		String aux = a;
		a = b;
		b = aux;
		
		
		System.out.println("os valores invertidos A = " + a + " B = " + b);

	}

}
