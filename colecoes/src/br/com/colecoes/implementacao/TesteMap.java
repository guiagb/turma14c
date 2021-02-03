package br.com.colecoes.implementacao;

import java.util.HashMap;
import java.util.Map;

import br.com.colecoes.beans.Cargo;

public class TesteMap {

	public static void main(String[] args) {
		
		Map<Integer, Cargo> lista = new HashMap<Integer, Cargo>();
		lista.put(1, new Cargo("DBA","JR",5000));
		lista.put(2, new Cargo("DBA","PL",5000));
		lista.put(3, new Cargo("DBA","SR",5000));
		
		System.out.println(lista);
		System.out.println(lista.get(1));
		System.out.println(lista.keySet());
		System.out.println(lista.values());
		System.out.println(lista.size());
		
		for(Cargo objeto : lista.values()) {
			System.out.println(objeto.getNome());
		}
	
	}
}
