package OperadoresLogicos8;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		float valor1, valor2, valor3, valor4, diferenca;
		
		Scanner resposta = new Scanner(System.in);
		
		System.out.print("Informe o valor 1: ");
		valor1 = resposta.nextFloat();
		
		System.out.print("Informe o valor 2: ");
		valor2 = resposta.nextFloat();
		
		System.out.print("Informe o valor 3: ");
		valor3 = resposta.nextFloat();
		
		System.out.print("Informe o valor 4: ");
		valor4 = resposta.nextFloat();
		
		diferenca = (valor1 * valor2) - (valor3 * valor4);
		
		System.out.printf("\nDiferença: %.1f", diferenca);
	}

}
