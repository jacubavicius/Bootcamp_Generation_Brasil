package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		float salarioLiquido, salarioBruto, adicionalNoturno, horasExtras, descontos;
		
		Scanner resposta = new Scanner(System.in);
		
		System.out.print("Informe o salário bruto: ");
		salarioBruto = resposta.nextFloat();
		
		System.out.print("Informe o adicional noturno: ");
		adicionalNoturno = resposta.nextFloat();
		
		System.out.print("Informe as horas extras: ");
		horasExtras = resposta.nextFloat();
		
		System.out.print("Informe o valor dos descontos: ");
		descontos = resposta.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("\nO salário líquido é: %.2f", salarioLiquido);		

	}

}
