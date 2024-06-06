package LacosRepeticao10;

import java.util.Scanner;

public class Lista02Exercicio05 {
	public static void main(String[] args) {

		int numero, soma = 0;

		Scanner resposta = new Scanner(System.in);
		
		do {
			
			System.out.print("Digite um número: ");
			numero = resposta.nextInt();			
			
			soma = numero > 0 ? soma += numero : soma + 0;	
			
		} while(numero != 0);
		
		System.out.print("\nA soma dos números positivos é: " + (soma));
	}
}
