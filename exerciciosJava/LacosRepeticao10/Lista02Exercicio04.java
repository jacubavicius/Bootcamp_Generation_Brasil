package LacosRepeticao10;

import java.util.Scanner;

public class Lista02Exercicio04 {

	public static void main(String[] args) {

		String continua = "s";
		int idade, somaIdades = 0, codigoGenero, codigoDesenvolvedora, totalPessoas = 0, backend = 0, 
				mulherFrontend = 0, homemMobile40 = 0, naoBinarioFullstack = 0;
		float mediaIdades;

		Scanner resposta = new Scanner(System.in);

		while (!continua.equalsIgnoreCase("n")) {

			System.out.print("Informe a idade do colaborador: ");
			idade = resposta.nextInt();

			somaIdades += idade;
			
			System.out.print("\n1. Mulher Cis" + "\n2. Homem Cis" + "\n3. Não Binário" + "\n4. Mulher Trans"
					+ "\n5. Homem Trans" + "\n6. Outros" + "\nInsira a identidade de Gênero: ");
			codigoGenero = resposta.nextInt();

			System.out.print("\n1. Backend" + "\n2. Frontend" + "\n3. Mobile" + "\n4. FullStack"
					+ "\nInsira o código da pessoa desenvolvedora: ");
			codigoDesenvolvedora = resposta.nextInt();		
			
			if(codigoDesenvolvedora == 1)
				backend++;
			
			if((codigoGenero == 1 || codigoGenero == 4) && codigoDesenvolvedora == 2)
				mulherFrontend++;
			
			if((codigoGenero == 2 || codigoGenero == 5) && codigoDesenvolvedora == 3 && idade > 40)
				homemMobile40++;

			if(codigoGenero == 3 && codigoDesenvolvedora == 4 && idade < 30)
				naoBinarioFullstack++;
			
			totalPessoas++;			
			
			System.out.print("\nDeseja continuar a leitura dos dados de um novo colaborador ou não (S/N): ");
			continua = resposta.next();
		}
		
		mediaIdades = (float)somaIdades / totalPessoas;
		
		System.out.print("\nO número de pessoas desenvolvedoras Backend: " + backend);
		System.out.print("\nO número de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulherFrontend);
		System.out.print("\nO número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homemMobile40);
		System.out.print("\nO número de Não Binários desenvolvedores FullStack menores de 30 anos: " + naoBinarioFullstack);
		System.out.print("\nO número total de pessoas que responderam à pesquisa: " + totalPessoas);
		System.out.printf("\nA média de idade das pessoas que responderam à pesquisa: %.2f", mediaIdades);		
	}
}
