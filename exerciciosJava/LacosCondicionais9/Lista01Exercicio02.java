package LacosCondicionais9;

import java.util.Scanner;

public class Lista01Exercicio02 {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner resposta = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		numero = resposta.nextInt();
		
		if(numero % 2 == 0 && numero > 0) {
			System.out.print("\nO número " + numero + " é par e positivo!");
		} else if(numero % 2 == 0 && numero < 0) {
			System.out.print("\nO número " + numero + " é par e negativo!");
		} else if(numero % 2 != 0 && numero > 0) {
			System.out.print("\nO número " + numero + " é ímpar e positivo!");
		} else {
			System.out.print("\nO número " + numero + " é ímpar e negativo!");
		}		

	}

}
