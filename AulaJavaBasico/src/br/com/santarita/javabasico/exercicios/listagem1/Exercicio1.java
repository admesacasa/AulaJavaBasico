package br.com.santarita.javabasico.exercicios.listagem1;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exercicio1 {

	private static Scanner sc;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("entre com a temperatura em graus celsius: ");
		BigDecimal temperatura = sc.nextBigDecimal();
		System.out.println("a temperatura em Grau Fahrenheit:"+ (temperatura.multiply(new BigDecimal("1.8")).add(new BigDecimal("32"))));

	}

}
		