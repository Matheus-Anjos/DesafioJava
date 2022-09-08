package testes;

import java.util.Scanner;

public class Desafio02Logica {

	public static void main(String[] args) {

		// Inserir String
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite uma String");

		String texto = scan.nextLine();

		/*
		 * Inserir os arrays que receberão os dados da String,no char armazenar as
		 * letras da string e no integer suas respectivas repetições
		 */
		char[] guardarLetra = new char[texto.length()];
		Integer[] quantidadeRepeticoes = new Integer[texto.length()];

		// conveter a String para um array Char, para capturar os caracteres`
		char[] letras = texto.toCharArray();

		// Definir o contador que receberá a quantidade de repetições de cada caractere
		int contarRepeticoes = 0;

		// iterar sobre o array char capturando o caractere e a quantidade de vezes que
		// ele aparece
		for (char letra : letras) {
			contarRepeticoes = 0;
			for (int i = 0; i < texto.length(); i++) {
				if (letras[i] == letra) {
					contarRepeticoes = contarRepeticoes + 1;
				}
				guardarLetra[i] = letras[i];
				quantidadeRepeticoes[i] = contarRepeticoes;
			}
		}
		/*
		 * Definir as variaveis maior numero que recebe o primeiro valor do array com a
		 * quantidadeRepeticoes e definir o indice deste maior numero incialmente como o
		 * primeiro valor do array, para comparação
		 */
		int maiorNumero = quantidadeRepeticoes[0];
		int indiceMaiorNumero = 0;

		// verificar o maior valor da quantidadeRepeticoes e pegar seu indice
		for (int k = 0; k < quantidadeRepeticoes.length; k++) {
			if (quantidadeRepeticoes[k] > maiorNumero) {
				maiorNumero = quantidadeRepeticoes[k];
				indiceMaiorNumero = k;
			}
		}

		scan.close();

		// associar o maior numero como a maior quantidade de repetições de uma letra do
		// array com sua respectiva letra
		System.out.println(maiorNumero);
		System.out.println(letras[indiceMaiorNumero]);

	}

}
