package Collections12;

import java.util.*;
public class Lista02Exercicio04 {

	public static void main(String[] args) {
		
		Set<Integer> setNumeros = Set.of(2, 5, 1, 3, 4, 9, 7, 8, 10,6);

		int numero;

		Scanner resposta = new Scanner(System.in);
		
		System.out.print("Digite o número que você deseja encontrar: ");
		numero = resposta.nextInt();	
		
		System.out.print(setNumeros.contains(numero) ? "\nO número " + numero + " foi encontrado!" 
		: "\nO número " + numero + " não foi encontrado!");
	}

}
