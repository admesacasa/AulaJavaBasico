package br.com.santarita.javabasico.exercicios.listagem1;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exercicio2 {

	private static Scanner sc;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("entre com o raio: ");
		BigDecimal raio = sc.nextBigDecimal();
		System.out.println("entre com o altura: ");
		BigDecimal altura = sc.nextBigDecimal();
		BigDecimal valorPI = new BigDecimal("3.14159");
		
		
		System.out.println("o volume eh:"+ (valorPI.multiply(raio).multiply(raio).multiply(altura)));

	}

}
