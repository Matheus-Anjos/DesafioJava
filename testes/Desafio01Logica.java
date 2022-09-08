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

		System.out.println("Digite a quantidade de números que sua lista terá");

		int quantidadeNumeroLista = scan.nextInt();

		System.out.println("Digite os valores que sua lista terá");

		for (int n = 0; n < quantidadeNumeroLista; n++) {

			lista.add(scan.nextInt());
		}

		// Definir como menor número da lista, o primeiro item da mesma, para via de
		// comparação
		menorNumeroLista = lista.get(0);

		// Encontrar o menor número da lista e seu respectivo índice
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) < menorNumeroLista) {
				menorNumeroLista = lista.get(i);
				indiceMenorNumero = i;
			}
		}

		/*
		 * Verificar se o menor número da lista possui um sucessor direto, sendo falso
		 * definir este sucessor do menor número da lista como o menor inteiro possível
		 * fora da lista.
		 */
		if (!lista.contains(lista.get(indiceMenorNumero) + 1)) {
			menorInteiroPossivel = lista.get(indiceMenorNumero) + 1;
		}

		/*
		 * Caso o menor número tenha um sucessor, verificar se seus próximos sucessores
		 * também tem um sucessor, caso um deles não tenha, este será o menor inteiro
		 * possível fora da lista
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
		
		// Exibir o menor número da lista
		System.out.println("O menor número inteiro possível que não ocorre em sua lista é  " +  menorInteiroPossivel);
	}

}
