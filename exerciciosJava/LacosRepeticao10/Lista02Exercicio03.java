package LacosRepeticao10;

import java.util.Scanner;

public class Lista02Exercicio03 {
	public static void main(String[] args) {

		int idade = 0, menor21 = 0, maior50 = 0;

		Scanner resposta = new Scanner(System.in);
		
		while(idade >= 0) {
			System.out.print("Digite uma idade: ");
			idade = resposta.nextInt();
			
			if(idade < 21) {
				menor21++;
			} else if(idade > 50) {
				maior50++;
			}			
		}
		
		System.out.print("\nTotal de pessoas menores de 21 anos: " + (menor21 - 1));
		System.out.print("\nTotal de pessoas maiores de 50 anos: " + maior50);	
	}
}
