package LacosCondicionais9;

import java.util.Scanner;

public class Lista02Exercicio8 {

	public static void main(String[] args) {
		
		int codigoOperacao;
		float saldo = 1000.00f, novoSaldo, valor;
		
		Scanner resposta = new Scanner(System.in);
		
		System.out.print("1. Saldo"
				+ "\n2. Saque"
				+ "\n3. Depósito"
				+ "\nSelecione o código da operação desejada: ");
		codigoOperacao = resposta.nextInt();
		
		switch(codigoOperacao) {
		case 1:
			System.out.print("\nOperação - Saldo");
			System.out.printf("\nSaldo: %.2f", saldo);
			break;
		case 2:
			System.out.print("\nInsira o valor que deseja sacar: ");
			valor = resposta.nextFloat();
			
			novoSaldo = saldo - valor;
			
			System.out.print("\nOperação - Saque");					
			System.out.print(novoSaldo > 0 ? "\nNovo saldo: " + novoSaldo : "\nSaldo Insuficiente!");
			break;
		case 3:
			System.out.print("\nInsira o valor que deseja depositar: ");
			valor = resposta.nextFloat();
			
			novoSaldo = saldo + valor;
			
			System.out.print("\nOperação - Depósito");					
			System.out.printf("\nNovo saldo: %.2f", novoSaldo);
			break;
		default:
			System.out.println("\nOperação inválida!");
			break;
		}
	}
}
