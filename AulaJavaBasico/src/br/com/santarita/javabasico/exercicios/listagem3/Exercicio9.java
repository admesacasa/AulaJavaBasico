package br.com.santarita.javabasico.exercicios.listagem3;

import java.util.Scanner;

public class Exercicio9 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Double maior = 0.0;
		Double menor = 0.0;
		Integer homens = 0;
		Integer mulheres = 0;
		Double somaAlturaMulheres = 0.0;

		for (int i = 1; i <= 50; i++) {

			System.out.println("Entre com o sexo. F:femenino ou M:masculino: ");
			String sexo = sc.next();

			System.out.println("qual a altura: ");
			Double altura = sc.nextDouble();
			if (i == 1) {
				maior = altura;
				menor = altura;
			} else if (altura > maior) {
				maior = altura;
			} else if (altura < menor) {
				menor = altura;
			}

			if (sexo.equals("F") || sexo.equals("f")) {
				mulheres++;
				somaAlturaMulheres += altura;
			} else {
				homens++;
			}

		}
		System.out.println("o maior altura foi: " + maior);
		System.out.println("o menor altura foi: " + menor);
		System.out.println("a latura media das mulheres eh: "
				+ somaAlturaMulheres / mulheres);
		System.out.println("o numero de homens foi de: " + homens);
		System.out.println("o percentual de homens eh de: " + (homens * 100)/ 50);
		System.out.println("o percentual de mulhers eh de: " + (mulheres * 100)/ 50);

	}

}
