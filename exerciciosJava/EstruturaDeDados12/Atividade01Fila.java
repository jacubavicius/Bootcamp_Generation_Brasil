package EstruturaDeDados12;

import java.util.*;

public class Atividade01Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		int operacao;
		
		Scanner resposta = new Scanner(System.in);
		
		do {				
			System.out.println("\t\nMenu de atendimento:"
					+ "\n1. Adicionar cliente na fila"
					+ "\n2. Listar todos os clientes"
					+ "\n3. Retirar cliente da fila"
					+ "\n0. Sair");
			
			System.out.print("\nEntre com a opção desejada: ");
			operacao = resposta.nextInt();			
						
			switch (operacao) {
			case 1:
				System.out.print("\nDigite o nome do cliente que deseja adicionar: ");
				fila.add(resposta.next());
				
				System.out.println("\nCliente adicionado!");
				
				System.out.println("\nFila: ");	
				Iterador.iterarFila(fila.iterator());
				break;
			case 2:					
				if(fila.isEmpty()) {
					System.out.println("\nA fila está vazia!");
				} else {					
					System.out.println("\nLista de clientes na fila: ");
					Iterador.iterarFila(fila.iterator());
				}
				break;
			case 3:
				System.out.printf(fila.isEmpty() ? "\nA fila está vazia!\n" : "\nO cliente " + fila.peek() + " foi chamado!\n");
				fila.poll();
				
				System.out.println("\nFila: ");	
				Iterador.iterarFila(fila.iterator());
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
