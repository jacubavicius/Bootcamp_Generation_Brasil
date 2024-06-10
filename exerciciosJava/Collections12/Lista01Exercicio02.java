package Collections12;

import java.util.*;

public class Lista01Exercicio02 {

	public static void main(String[] args) {
		
		List<Integer> listaNumeros = Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10,6);
		
		int numero;

		Scanner resposta = new Scanner(System.in);
		
		System.out.print("Digite o número que você deseja encontrar: ");
		numero = resposta.nextInt();
		
		System.out.print(listaNumeros.contains(numero) ? "\nO número " + numero + " está localizado na posição: " + listaNumeros.indexOf(numero) 
		: "\nO número " + numero + " não foi encontrado!");

	}
}
