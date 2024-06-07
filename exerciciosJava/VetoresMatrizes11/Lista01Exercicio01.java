package VetoresMatrizes11;

import java.util.Arrays;
import java.util.Scanner;

public class Lista01Exercicio01 {

	public static void main(String[] args) {
		
		int vetorInteiros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6}, valor, posicao;
		
		Scanner resposta = new Scanner(System.in);
		
		Arrays.sort(vetorInteiros);
		
		System.out.print("Digite o número que você deseja encontrar: ");
		valor = resposta.nextInt();
		
		posicao = Arrays.binarySearch(vetorInteiros, valor);
		
		if(posicao > 0) {
			System.out.print("\nO número " + valor + " está localizado na posição: " + posicao);		
		}else {
			System.out.print("\nO número " + valor + " não foi encontrado!");		
		}
	}
}
