package OperadoresLogicos8;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
	
		float nota1, nota2, nota3, nota4, media;
	
		Scanner resposta =  new Scanner(System.in);
	
		System.out.print("Digite a primeira nota: ");
		nota1 = resposta.nextFloat();
		
		System.out.print("Digite a segunda nota: ");
		nota2 = resposta.nextFloat();
		
		System.out.print("Digite a terceira nota: ");
		nota3 = resposta.nextFloat();
		
		System.out.print("Digite a quarta nota: ");
		nota4 = resposta.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("\nA média final é: %.1f", media);
		
	}
}
