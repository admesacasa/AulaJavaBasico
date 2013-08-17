package br.com.santarita.javabasico.exercicios.listagem2;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exercicio4 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Entre com o Sexo (F =femenino , M = Masculino): ");
		String sexo = sc.next();
		System.out.println("Entre com a Altura: ");
		BigDecimal altura = sc.nextBigDecimal();
		BigDecimal pesoIdeal = BigDecimal.ZERO;

		if (sexo.equals("F")) {
			System.out.println("o peso ideal pra esta mulher seria: "
					+ pesoIdeal.add(new BigDecimal("62.2").multiply(altura)
							.subtract(new BigDecimal("44.7"))));

		} else if (sexo.equals("M")) {
			System.out.println("o peso ideal pra este homem seria: "
					+ pesoIdeal.add(new BigDecimal("72.7").multiply(altura)
							.subtract(new BigDecimal("58"))));

		} else {
			System.out.println("Sexo nao identificado");
		}

	}

}
