package LacosCondicionais9;

import java.util.Scanner;

public class Lista02Exercicio06 {
	public static void main(String[] args) {
		
		String nome;
		int codigoCargo;
		float salario, novoSalario;
		
		Scanner resposta = new Scanner(System.in);
		
		System.out.print("Informe o nome do colaborador: ");
		nome = resposta.nextLine();
		
		System.out.print("\n1. Gerente"
				+ "\n2. Vendedor"
				+ "\n3. Supervisor"
				+ "\n4. Motorista"
				+ "\n5. Estoquista"
				+ "\n6. Técnico de TI"
				+ "\nInsira o código do cargo do colaborador: ");
		codigoCargo = resposta.nextInt();
		
		System.out.print("\nInforme o salário do colaborador: ");
		salario = resposta.nextFloat();

		System.out.print("\nNome do colaborador: " + nome);
		
		switch(codigoCargo) {
		case 1:
			novoSalario = salario + (0.10f * salario);
			System.out.print("\nCargo: Gerente");
			System.out.printf("\nNovo salário: R$ %.2f", novoSalario);
			break;
		case 2:
			novoSalario = salario + (0.07f * salario);
			System.out.print("\nCargo: Vendedor");
			System.out.printf("\nNovo salário: R$ %.2f", novoSalario);
			break;
		case 3:
			novoSalario = salario + (0.09f * salario);
			System.out.print("\nCargo: Supervisor");
			System.out.printf("\nNovo salário: R$ %.2f", novoSalario);
			break;
		case 4:
			novoSalario = salario + (0.06f * salario);
			System.out.print("\nCargo: Motorista");
			System.out.printf("\nNovo salário: R$ %.2f", novoSalario);
			break;
		case 5:
			novoSalario = salario + (0.05f * salario);
			System.out.print("\nCargo: Estoquista");
			System.out.printf("\nNovo salário: R$ %.2f", novoSalario);
			break;
		case 6:
			novoSalario = salario + (0.08f * salario);
			System.out.print("\nCargo: Técnico de TI");
			System.out.printf("\nNovo salário: R$ %.2f", novoSalario);
			break;
		default:
			System.out.println("\nOpção inválida!");
			break;
		}		
	}
}
