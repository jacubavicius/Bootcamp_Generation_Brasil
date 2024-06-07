package VetoresMatrizes11;

import java.util.Scanner;

public class Lista02Exercicio03 {

	public static void main(String[] args) {

		int matrizInteiros[][] = new int[3][3], somaPrincipal = 0, somaSecundaria = 0;

		Scanner resposta = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("\nEntre com os 3 valores da " + (i + 1) + "ª linha:");

			for (int j = 0; j < 3; j++) {
				System.out.print((j + 1) + "° valor: ");
				matrizInteiros[i][j] = resposta.nextInt();
			}
		}

		System.out.print("\nElementos da diagonal principal: ");
		for (int i = 0; i < 3; i++) {
			System.out.print(matrizInteiros[i][i] + " ");
			somaPrincipal += matrizInteiros[i][i];
		}

		System.out.print("\nElementos da diagonal secundária: ");
		for (int i = 0; i < 3; i++) {			
			System.out.print(matrizInteiros[i][3 - 1 - i] + " ");
			somaSecundaria += matrizInteiros[i][3 - 1 - i];			
		}
		
		System.out.print("\nSoma dos elementos da diagonal principal: " + somaPrincipal);
		System.out.print("\nSoma dos elementos da diagonal secundária: " + somaSecundaria);
	}
}
