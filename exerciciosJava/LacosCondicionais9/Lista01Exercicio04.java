package LacosCondicionais9;

import java.util.Scanner;

public class Lista01Exercicio04 {

	public static void main(String[] args) {

		String caracteristica1, caracteristica2, caracteristica3;

		Scanner resposta = new Scanner(System.in);
		
		System.out.print("Escolha a primeira característica da espécie - vertebrado ou invertebrado: ");
		caracteristica1 = resposta.next();
		
		if(caracteristica1.equalsIgnoreCase("vertebrado")) {				
			System.out.print("Escolha a segunda característica da espécie - ave ou mamífero: ");
			caracteristica2 = resposta.next();				
			
			if(caracteristica2.equalsIgnoreCase("ave")) {				
				System.out.print("Escolha a terceira característica da espécie - carnívoro ou onívoro: ");
				caracteristica3 = resposta.next();				
				
				System.out.print(caracteristica3 == "carnívoro" ? "\nO animal escolhido é a águia!" : "\nO animal escolhido é a pomba!");
			} else {
				System.out.print("Escolha a terceira característica da espécie - onívoro ou herbívoro: ");
				caracteristica3 = resposta.next();	
				
				System.out.print(caracteristica3 == "onívoro" ? "\nO animal escolhido é o homem!" : "\nO animal escolhido é a vaca!");				
			}	
			
		} else {			
			System.out.print("Escolha a segunda característica da espécie - inseto ou anelídeo: ");
			caracteristica2 = resposta.next();
			
			if(caracteristica2.equalsIgnoreCase("inseto")) {				
				System.out.print("Escolha a terceira característica da espécie - hematófago ou herbívoro: ");
				caracteristica3 = resposta.next();	
				
				System.out.print(caracteristica3 == "hematófago" ? "\nO animal escolhido é a pulga!" : "\nO animal escolhido é a largata!");					
			} else {
				System.out.print("Escolha a terceira característica da espécie - hematófago ou onívoro: ");
				caracteristica3 = resposta.next();	
				
				System.out.print(caracteristica3 == "hematófago" ? "\nO animal escolhido é a sanguessuga!" : "\nO animal escolhido é a sinhoca!");				
			}		
		}
	}
}
