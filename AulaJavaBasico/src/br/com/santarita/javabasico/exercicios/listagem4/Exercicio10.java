package br.com.santarita.javabasico.exercicios.listagem4;

import java.util.Scanner;

public class Exercicio10 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Integer[] A = new Integer[10];
		Integer[] B = new Integer[10];
		Integer[] C = new Integer[10];
		Integer S = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Entre com o valor de A" + (i + 1) + ": ");
			A[i] = sc.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("Entre com o valor de B" + (i + 1) + ": ");
			B[i] = sc.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			S += A[i] * B[9 - i];
		}
		System.out.println("Valor de S = " + S);
		
		
		
		for (int j = 0; j < 10; j++) {
			C[j] = A[j] / B[j];
		}
		
		System.out.println("Impresso de C invertida");
		for (int i = 9; i >= 0; i--) {
		System.out.println(C[i]);	
		}
		
		
		for (int i = 0; i < 10; i++) {
			if (A[i] % 2 == 0) {  
		        System.out.println("Numeros Pares de A = "+A[i]);  
			}
		}


	}

}
