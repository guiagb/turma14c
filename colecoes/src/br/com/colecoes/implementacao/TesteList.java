package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteList {

	public static void main(String[] args) {
		//int numeros[] = new int[5];
		/*
		 * o vetor gera limitacao:
		 * quantidade de dados chumbada
		 * dados do mesmo tipo
		 * necessita variavel para indice
		 * impossivel remover uma posição
		 */
		
		
		//criar pela super e instanciar pela sub
		List <String>lista = new ArrayList<String>();
		lista.add("Suporte");
		lista.add("DBA");
		lista.add("Gestor de projetos");
		lista.add("DBA");
		lista.add("Estagiario");
		
		System.out.println("Original: " + lista);
		System.out.println("Segundo elemento: " + lista.get(1));
		lista.remove(1);
		System.out.println("Novo segundo elemento: " + lista.get(1));
		Collections.sort(lista);
		System.out.println("Ordenada: " + lista);
		
		int dbas = 0;
		for(int indice=0;indice<lista.size();indice++) {
			if (lista.get(indice).toUpperCase().equals("DBA")){
				dbas++;
			}
		}
		System.out.println(dbas);
	}

}
