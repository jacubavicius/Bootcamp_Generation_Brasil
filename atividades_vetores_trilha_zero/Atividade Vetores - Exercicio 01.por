programa
{
	
	funcao inicio()
	{

		inteiro lista[10], troca

		para(inteiro i = 0; i < 10; i++){
			escreva("Digite o ", i+1, "º número: ")
			leia(lista[i])	
			limpa()
		}	


		para(inteiro j = 0; j <= 10; j++){
			para(inteiro i = 0; i < 10 - 1; i++) {
				se(lista[i] < lista[i+1]){
					troca = lista[i]
					lista[i] = lista[i+1]
					lista[i+1] = troca
				}
			}
			
		}	


		para(inteiro i = 0; i < 10; i++){
			escreva(lista[i], " ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 423; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {lista, 7, 10, 5}-{troca, 7, 21, 5}-{j, 16, 15, 1}-{i, 17, 16, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */