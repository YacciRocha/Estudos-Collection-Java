package aulascollection;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "Modelando a Classe Aula";
		String aula2 = "Conhecendo mais de listas";
		String aula3 = "Trabalhando com Cursos e Sets";

		// criando uma lista
		ArrayList<String> aulas = new ArrayList<>();
		// adicionando os itens a lista
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		// imprimindo os itens, percorrendo os elementos.
		System.out.println(aulas);

		System.out.println("----------------------------------------------------");

		// removendo um item da lista
		aulas.remove(0);
		System.out.println(aulas);
		System.out.println("Removeu um item ");

		System.out.println("----------------------------------------------------");

		// percorre a lista com um for each
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}

		System.out.println("----------------------------------------------------");

		// mostra um item especifico com o get
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é: " + primeiraAula);

		System.out.println("----------------------------------------------------");

		// percorre a lista inteira, usando um for com size
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula: " + aulas.get(i));
		}
		System.out.println("----------------------------------------------------");
		System.out.println("Tamanho da lista -  " + aulas.size());

		System.out.println("----------------------------------------------------");

		// percorre os elementos com uma expressao lambda usando o método foreach

		aulas.forEach(aula -> {
			System.out.println("Percorrendo");
			System.out.println("Aula: " + aula);
		});

		System.out.println("----------------------------------------------------");
		//ordenando a lista com a classe Collections
		
		Collections.sort(aulas);
		System.out.println("Lista ordenada em ordem alfabética");
		System.out.println(aulas);
		
		
		
		
		
		
	}

}
