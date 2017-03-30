package br.com.cactus.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Aula2 {

	public static void main(String[] args) {
		Aula a1 = new Aula("Revisando collection", 21);
		Aula a2 = new Aula("Objeto em Collections", 15);
		Aula a3 = new Aula("Equals e hash code", 20);

		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		System.out.println(aulas);

		Collections.sort(aulas);
		System.out.println(aulas);

		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
	}

}
