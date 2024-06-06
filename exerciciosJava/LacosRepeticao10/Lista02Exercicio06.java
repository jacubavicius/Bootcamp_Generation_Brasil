package LacosRepeticao10;

import java.util.Scanner;

public class Lista02Exercicio06 {
	public static void main(String[] args) {

		int numero, quantidade = 0 , soma = 0;
		float media;

		Scanner resposta = new Scanner(System.in);
		
		do {
			
			System.out.print("Digite um número: ");
			numero = resposta.nextInt();	
			
			if(numero > 0 && numero % 3 == 0) {
				quantidade++;
				soma += numero;
			}		
			
		} while(numero != 0);
		
		media = (float)soma / quantidade;
		
		System.out.printf("\nA média de todos os números múltiplos de 3 é: " + media);
	}
}
