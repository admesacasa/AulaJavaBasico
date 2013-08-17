package br.com.santarita.javabasico.exercicios.listagem4;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio11 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		ArrayList<String> entrada = new ArrayList<>();

		do {
			System.out.println("digite um valor: ");
			entrada.add(sc.next());
		} while (!entrada.contains("fim"));
		for (int i = entrada.size() - 1; i >= 0; i--) {
			System.out.println(entrada.get(i));
		}
	}

}
