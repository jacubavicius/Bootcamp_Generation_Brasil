package VetoresMatrizes11;

import java.util.Scanner;

public class Lista02Exercicio04 {

	public static void main(String[] args) {
		
		float notas[][] = new float[10][4], medias[] = new float[10], somaNotas = 0;
		
		Scanner resposta = new Scanner(System.in);
		
		System.out.println("Entre com a nota de cada aluno:");		
		for(int i = 0; i < 10; i++) {
			System.out.println("\nInsira a nota do " + (i+1) + "º aluno:");
			for(int j = 0; j < 4; j++) {
				System.out.print("Nota " + (j+1) + ": ");	
				notas[i][j] = resposta.nextFloat();
				somaNotas += notas[i][j];
			}
			
			medias[i] = (float)somaNotas / 4;
			somaNotas = 0;
		}
		
		System.out.print("\nMédia:");
		for(float media : medias) {
			System.out.printf(" %.1f", media);
		}
	}
}
