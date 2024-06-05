package LacosCondicionais9;

import java.util.Scanner;

public class Lista01Exercicio03 {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		boolean primeiraDoacao;
		
		Scanner resposta = new Scanner(System.in);
		
		System.out.print("Digite o nome do doador: ");
		nome = resposta.nextLine();
		
		System.out.print("Digite a idade do doador: ");
		idade = resposta.nextInt();
		
		System.out.print("Primeira doação de sangue? (true/false): ");
		primeiraDoacao = resposta.nextBoolean();
		
		if(idade >= 18 && idade <= 69) {
			
			if(idade >= 60 && primeiraDoacao == true) {
				System.out.print("\n" + nome + " não está apto para doar!");
			} else {
				System.out.print("\n" + nome + " está apto para doar!");
			}
			
		} else {
			System.out.print("\n" + nome + " não está apto para doar!");
		}
	}

}
