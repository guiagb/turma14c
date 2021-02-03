package br.com.colecoes.implementacao;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {

		/* 
		 * nao admite elementos iguais
		 * ele ordena de acordo o algoritmo de hash
		 */
		Set<String> lista = new HashSet<String>();
		lista.add("Suporte");
		lista.add("DBA");
		lista.add("Gestor de projetos");
		lista.add("DBA");
		lista.add("Estagiario");

		System.out.println("Original: " + lista);
		System.out.println(lista.contains("DBA"));

		//paralelo ao for i=1....
		for (String s:lista) {
			System.out.println(s);
		}

	}

}
