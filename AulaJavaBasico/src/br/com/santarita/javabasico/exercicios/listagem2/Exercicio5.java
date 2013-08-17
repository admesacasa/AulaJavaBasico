package br.com.santarita.javabasico.exercicios.listagem2;

import java.util.Scanner;

public class Exercicio5 {

	private static Scanner sc;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Entre com a idade do nadador:: ");
		Long idade = sc.nextLong();
		if (idade >= 5 && idade <= 7) {
			System.out.println("Infatil A");
		} else if (idade >= 8 && idade <= 10) {
			System.out.println("Ifantil B");
		} else if (idade >= 11 && idade <= 13) {
			System.out.println("Juvenil A");
		} else if (idade >= 14 && idade <= 17) {
			System.out.println("Juvenil B");
		} else if (idade >= 18) {
			System.out.println("Adulto");
		}else{
			System.out.println("Fora da faixa de idade para ser nadador");
		}

	}

}
