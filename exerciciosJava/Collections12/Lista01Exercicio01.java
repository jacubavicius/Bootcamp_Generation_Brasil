package Collections12;

import java.util.*;

public class Lista01Exercicio01 {
	
	public static void main(String[] args) {
		
		List<String> listaCores = new ArrayList<String>();
		
		Scanner resposta = new Scanner(System.in);
		
		System.out.println("Digite suas 5 cores favoritas:");		
		for(int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "° cor: ");
			listaCores.add(resposta.nextLine());
		}
		
		System.out.println("\nLista de todas as cores:");
		System.out.println(listaCores);
		
		Collections.sort(listaCores);
		System.out.println("\nLista de todas as cores ordenadas:");
		System.out.println(listaCores);
	}
}
