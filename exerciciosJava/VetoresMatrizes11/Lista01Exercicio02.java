package VetoresMatrizes11;

import java.util.Scanner;

public class Lista01Exercicio02 {

	public static void main(String[] args) {
		
		int vetorInteiros[] = new int [10], soma = 0;
		
		Scanner resposta = new Scanner(System.in);
		
		System.out.println("Entre com o valor de 10 números inteiros:");		
		for(int i = 0; i < 10; i++) {
			System.out.print((i+1) + "° valor: ");
			vetorInteiros[i] = resposta.nextInt();
		}
		
		System.out.print("\nElementos nos índices ímpares:");	
		for(int i = 0; i < 10; i++) {			
			System.out.print(i % 2 != 0 ? " " + vetorInteiros[i]: "");			
			soma += vetorInteiros[i];
		}
		
		System.out.print("\nElementos pares:");	
		for(int valor : vetorInteiros) {
			if(valor % 2 == 0) {
				System.out.print(" " + valor);
			}
		}
		
		System.out.print("\nSoma elementos: " + soma);	
		System.out.printf("\nMédia elementos: %.2f", ((float)soma/10));	
		
	}
}
