package EstruturaDeDados12;

import java.util.*;

public class Atividade02Pilha {

	public static void main(String[] args) {
		
		Stack<String> pilhaLivros = new Stack<String>();
		
		int operacao;
		
		Scanner resposta = new Scanner(System.in);
		
		do {				
			System.out.println("\t\nMenu:"
					+ "\n1. Adicionar livros na pilha"
					+ "\n2. Listar todos os livros"
					+ "\n3. Retirar livro da pilha"
					+ "\n0. Sair");
			
			System.out.print("\nEntre com a opção desejada: ");
			operacao = resposta.nextInt();			

			resposta.nextLine();
			
			switch (operacao) {
			case 1:
				System.out.print("\nDigite o nome do livro: ");
				String livro = resposta.nextLine();
				pilhaLivros.push(livro);
				
				System.out.println("\nLivro adicionado!");
				
				System.out.println("\nPilha: ");	
				Iterador.iterarFila(pilhaLivros.iterator());
				break;
			case 2:					
				if(pilhaLivros.isEmpty()) {
					System.out.println("\nA pilha está vazia!");
				} else {					
					System.out.println("\nLista de livros na pilha: ");
					Iterador.iterarFila(pilhaLivros.iterator());
				}
				break;
			case 3:
				if (pilhaLivros.isEmpty()) {
					System.out.printf("\nA pilha está vazia!\n");
				} else {
					System.out.printf("\nO livro '" + pilhaLivros.peek() + "' foi retirado da pilha!\n");
					pilhaLivros.pop();
				
					System.out.println("\nPilha: ");	
					Iterador.iterarFila(pilhaLivros.iterator());
				}
				break;
			case 0:
				System.out.println("\nPrograma finalizado!");
				break;
			default:
				System.out.println("\nInválido. Escolha outra opção!");
				break;
			}
			
		} while (operacao != 0);
	}	
	
	class Iterador {		
		static void iterarFila(Iterator fila) {
			while(fila.hasNext()) {
				System.out.println(fila.next());
			}
		}
	}
}