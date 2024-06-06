package LacosRepeticao10;

import java.util.Scanner;

public class Lista01Exercicio02 {
	public static void main(String[] args) {
		
		int numero, par = 0, impar = 0;

		Scanner resposta = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++ ) {
			
			System.out.print("Digite o " + (i+1) + "° número: ");
			numero = resposta.nextInt();
			
			numero = numero % 2 == 0 ? par++ : impar++;
		}
		
		System.out.print("\nTotal de números pares: " + par);
		System.out.print("\nTotal de números ímpares: " + impar);
	}
}
