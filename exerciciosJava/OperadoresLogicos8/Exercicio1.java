package OperadoresLogicos8;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		float salario, abono, novoSalario;
		
		Scanner resposta = new Scanner (System.in);
		
		System.out.print("Informe o salário: ");
		salario = resposta.nextFloat();
		
		System.out.print("Informe o valor do abono: ");
		abono = resposta.nextFloat();
		
		novoSalario = salario +  abono;
		
		System.out.printf("\nO novo salário é: %.2f", novoSalario);

	}

}
