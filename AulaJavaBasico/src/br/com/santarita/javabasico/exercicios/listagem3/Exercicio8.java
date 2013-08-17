package br.com.santarita.javabasico.exercicios.listagem3;

import java.util.Scanner;

public class Exercicio8 {
	private static Scanner sc;
	
	
	public static void main(String[] args) {
		Double valorTotal = 0.0;
		Double valorParcela = 0.0;
		
		sc = new Scanner(System.in);
		System.out.println("Entre com o valor a financiar: ");
		Double capital = sc.nextDouble();
		
		System.out.println("Entre com quantidade de meses: ");
		Double tempo = sc.nextDouble();
		
		System.out.println("Entre com a taxa de juro mensal: ");
		Double taxaJuro = sc.nextDouble();
		
		System.out.println("Qual o tipo de juros: S para simples e C para composto ");
		String tipoJuros = sc.next();
		
		if (tipoJuros.equals("S") ||tipoJuros.equals("s")) {
			valorTotal = (capital*(taxaJuro/100)*tempo)+capital;
			valorParcela = valorTotal/tempo;
			
		}else if (tipoJuros.equals("C") ||tipoJuros.equals("c")) {
			valorTotal = (capital*(Math.pow((1+(taxaJuro/100)),tempo)));
			valorParcela = valorTotal/tempo;
		}
		
		System.out.println("O valor tatal quando quitado sera de: "+valorTotal);
		System.out.println("o valor da parcela mensal sera de: " + valorParcela);
		
	}

}
