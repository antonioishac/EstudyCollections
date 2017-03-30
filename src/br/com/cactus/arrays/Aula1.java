package br.com.cactus.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Aula1 {

	public static void main(String[] args) {
		String aula1 = "Modelando a classe aula";
		String aula2 = "Conhecendo mais de listas";
		String aula3 = "Trabalhando com Cursos e Sets";

		List<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);

		//removendo um objeto da lista
		aulas.remove(0);
		System.out.println(aulas);

		//mostrando a lista linha por linha
		for (String aula : aulas) {
			System.out.println(aula);
		}

		//acessando qualquer elemento da lista
		String primeiraAula = aulas.get(0);
		System.out.println(primeiraAula);

		//percorrendo elementos de uma lista em java8
		aulas.forEach(aula -> {
			System.out.println("Percorrendo com java 8");
			System.out.println("Aula: " + aula);
		});

		//ordenando collections com string
		String aula4 = "Lingua portugesa";
		String aula5 = "Matemática";
		String aula6 = "Ciências";

		List<String> materias = Arrays.asList(aula4, aula5, aula6);
		Collections.sort(materias);

		System.out.println("");
		System.out.println("");
		System.out.println("########## - Lista de String ordenada - ##########");
		materias.forEach(materia -> {
			System.out.println("Materia: " + materia);
		});
	}

}
