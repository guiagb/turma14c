package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.colecoes.beans.Cargo;
import br.com.colecoes.beans.CargoReduzido;

public class TesteListaObjetos {

	public static void main(String[] args) {
		
		List <Cargo> lista = new ArrayList<Cargo>();
		lista.add(new Cargo("DBA", "JR", 5000));
		lista.add(new Cargo("DEV", "PL", 9000));
		lista.add(new Cargo("SUPORTE", "JR", 4500));
		lista.add(new Cargo("ESTAGIARIO", "SR", 3000));
		
		
		System.out.println(lista);
		
		/*
		 * exiba o total de salarios cadastrados 
		 * exibir no for somente os cargos que ganham mais que 5000
		 * montar uma lista com todos os cargos (nome e salario) do nivel jr 
		 */
		
		float totalsalario = 0;
		List <CargoReduzido> juniors = new ArrayList<CargoReduzido>();
		
		for (Cargo objeto : lista) {
			totalsalario = totalsalario + objeto.getSalario();
			if (objeto.getSalario()>5000) {
				System.out.println("cargo " + objeto.getNome());
			}
			if (objeto.getNivel().equals("JR")) {
				juniors.add(new CargoReduzido(objeto.getNome(),objeto.getSalario()));
			}
		}
		System.out.println(juniors);
		System.out.println(totalsalario);
		
		Collections.sort(lista);
		System.out.println(lista);
		
	}

}
