package LacosCondicionais9;

import java.util.Scanner;

public class Lista02Exercicio07 {

	public static void main(String[] args) {
		
		float numero1, numero2, resultado;
		int codigoOperacao;
		
		Scanner resposta = new Scanner(System.in);
		
		System.out.print("Insira o primeiro número: ");
		numero1 = resposta.nextFloat();
		
		System.out.print("Insira o segundo número: ");
		numero2 = resposta.nextFloat();
		
		System.out.print("\n1. Soma"
				+ "\n2. Subtração"
				+ "\n3. Multiplicação"
				+ "\n4. Divisão"
				+ "\nInsira o código da operação: ");
		codigoOperacao = resposta.nextInt();


		switch(codigoOperacao) {
		case 1:
			resultado = numero1 + numero2;
			System.out.print("\n" + numero1 + " + " + numero2 + " = " + resultado);
			break;
		case 2:
			resultado = numero1 - numero2;
			System.out.print("\n" + numero1 + " - " + numero2 + " = " + resultado);
			break;
		case 3:
			resultado = numero1 * numero2;
			System.out.print("\n" + numero1 + " * " + numero2 + " = " + resultado);
			break;
		case 4:
			resultado = numero1 / numero2;
			System.out.print("\n" + numero1 + " / " + numero2 + " = " + resultado);
			break;
		default:
			System.out.println("\nOpção inválida!");
			break;
		}	
	}
}
