package LacosCondicionais9;

import java.util.Scanner;

public class Lista02Exercicio05 {
	public static void main(String[] args) {
		
		int codigoProduto, quantidade;
		float valorTotal;
		
		Scanner resposta = new Scanner(System.in);
		
		System.out.println("Menu: "
				+ "\n1. Cachorro Quente    R$10.00"
				+ "\n2. X-Salada           R$15.00"
				+ "\n3. X-Bacon            R$18.00"
				+ "\n4. Bauru              R$12.00"
				+ "\n5. Refrigerante       R$08.00"
				+ "\n6. Suco de laranja    R$13.00");
		
		System.out.print("\nInforme o código do produto desejado: ");
		codigoProduto = resposta.nextInt();
		
		System.out.print("\nInforme a quantidade desejada: ");
		quantidade = resposta.nextInt();
		
		switch(codigoProduto) {
			case 1:
				valorTotal = quantidade * 10.00f;
				System.out.println("\nProduto: Cachorro Quente");
				System.out.printf("Valor total: R$ %.2f", valorTotal);
				break;
			case 2:
				valorTotal = quantidade * 15.00f;
				System.out.println("\nProduto: X-Salada");
				System.out.printf("Valor total: R$ %.2f", valorTotal);
				break;
			case 3:
				valorTotal = quantidade * 18.00f;
				System.out.println("\nProduto: X-Bacon");
				System.out.printf("Valor total: R$ %.2f", valorTotal);
				break;
			case 4:
				valorTotal = quantidade * 12.00f;
				System.out.println("\nProduto: Bauru");
				System.out.printf("Valor total: R$ %.2f", valorTotal);
				break;
			case 5:
				valorTotal = quantidade * 8.00f;
				System.out.println("\nProduto: Refrigerante");
				System.out.printf("Valor total: R$ %.2f", valorTotal);
				break;
			case 6:
				valorTotal = quantidade * 13.00f;
				System.out.println("\nProduto: Suco de laranja");
				System.out.printf("Valor total: R$ %.2f", valorTotal);
				break;
			default:
				System.out.println("\nOpção inválida!");
				break;
		}		
	}
}
