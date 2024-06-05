package LacosCondicionais9;

import java.util.Scanner;

public class Lista01Exercicio01 {

	public static void main(String[] args) {
		
		int a, b, c, soma;
		
		Scanner resposta = new Scanner(System.in);
		
		System.out.print("Digite o número A: ");
		a = resposta.nextInt();
		
		System.out.print("Digite o número B: ");
		b = resposta.nextInt();
		
		System.out.print("Digite o número C: ");
		c = resposta.nextInt();

		soma = a + b;
		
		if(soma > c) {
			System.out.println("\n" + a + " + " + b + " = " + soma + " > " + c);
			System.out.print("A Soma de A + B é Maior do que C");
		} else {
			System.out.println("\n" + a + " + " + b + " = " + soma + " < " + c);
			System.out.print("A Soma de A + B é Menor do que C");
		}
	}

}
