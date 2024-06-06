package LacosRepeticao10;

import java.util.Scanner;

public class Lista01Exercicio01 {

	public static void main(String[] args) {
		
		int numero1, numero2;
		
		Scanner resposta = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número do intervalo: ");
		numero1 = resposta.nextInt();
		
		System.out.print("Digite o segundo número do intervalo: ");
		numero2 = resposta.nextInt();		
		
		if(numero1 < numero2) {			
			System.out.println("\nNo Intervalo entre " + numero1 + " e " + numero2 + ":");
			
			for(int i = numero1; i <= numero2; i++) {
				
				System.out.print(i % 3 == 0 && i % 5 == 0 ? ("\n" + i + " é múltiplo de 3 e 5") : "");
			}			
		} 
		else {
			System.out.print("\nIntervalo inválido!");
		}

	}

}
