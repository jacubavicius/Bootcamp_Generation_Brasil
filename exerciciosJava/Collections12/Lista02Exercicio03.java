package Collections12;

import java.util.*;

public class Lista02Exercicio03 {
	
	public static void main(String[] args) {
		
		Set<Integer> setNumeros = new HashSet<Integer>();
		
		Scanner resposta = new Scanner(System.in);
		
		System.out.println("Digite 10 valores inteiros: ");
		for(int i = 0; i < 10; i++) {
			System.out.print((i + 1) + "° valor: ");
			setNumeros.add(resposta.nextInt());
		}
		
		System.out.println();
		Iterator<Integer> isetNumeros = setNumeros.iterator();
		while (isetNumeros.hasNext()) {
			System.out.println(isetNumeros.next());
		}
	}
}
