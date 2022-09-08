package testes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio01Logica {

	public static void main(String[] args) {

		int menorInteiroPossivel = 0;
		int menorNumeroLista = 0;
		int indiceMenorNumero = 0;

		// Inserir a Lista ( tamanho e valores)

		List<Integer> lista = new ArrayList<>();

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a quantidade de n�meros que sua lista ter�");

		int quantidadeNumeroLista = scan.nextInt();

		System.out.println("Digite os valores que sua lista ter�");

		for (int n = 0; n < quantidadeNumeroLista; n++) {

			lista.add(scan.nextInt());
		}

		// Definir como menor n�mero da lista, o primeiro item da mesma, para via de
		// compara��o
		menorNumeroLista = lista.get(0);

		// Encontrar o menor n�mero da lista e seu respectivo �ndice
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) < menorNumeroLista) {
				menorNumeroLista = lista.get(i);
				indiceMenorNumero = i;
			}
		}

		/*
		 * Verificar se o menor n�mero da lista possui um sucessor direto, sendo falso
		 * definir este sucessor do menor n�mero da lista como o menor inteiro poss�vel
		 * fora da lista.
		 */
		if (!lista.contains(lista.get(indiceMenorNumero) + 1)) {
			menorInteiroPossivel = lista.get(indiceMenorNumero) + 1;
		}

		/*
		 * Caso o menor n�mero tenha um sucessor, verificar se seus pr�ximos sucessores
		 * tamb�m tem um sucessor, caso um deles n�o tenha, este ser� o menor inteiro
		 * poss�vel fora da lista
		 */
		else {
			for (int i = 0; i < lista.size(); i++) {
				if (lista.contains(lista.get(indiceMenorNumero) + i)
						&& !lista.contains(lista.get(indiceMenorNumero) + i + 1)) {
					 menorInteiroPossivel = lista.get(indiceMenorNumero) + i + 1;
					break;
				}
			}
		}
		
		scan.close();
		
		// Exibir o menor n�mero da lista
		System.out.println("O menor n�mero inteiro poss�vel que n�o ocorre em sua lista �  " +  menorInteiroPossivel);
	}

}
