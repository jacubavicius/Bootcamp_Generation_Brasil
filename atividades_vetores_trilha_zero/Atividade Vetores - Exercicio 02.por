programa
{
	
	funcao inicio()
	{
		inteiro elementos[10], soma, i
		real media

		soma = 0
		media = 0.00

		para(i = 0; i < 10; i++){
			escreva("Digite o ", i+1, "º número: ")
			leia(elementos[i])	
		}	

		limpa()
		
		escreva("Elementos nos índices ímpares: \n")
		para(i = 0; i < 10; i++) {
			se(i % 2 != 0){
				escreva(elementos[i], " ")
			}
		}

		escreva("\n\nElementos pares: \n")
		para(i = 0; i < 10; i++) {
			se(elementos[i] % 2 == 0){
				escreva(elementos[i], " ")
			}
		}

		para(i = 0; i < 10; i++) {
			soma = elementos[i] + soma
			media = soma/10.00
		}

		escreva("\n\nSoma: \n", soma)
		escreva("\n\nMédia: \n", media)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 636; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */