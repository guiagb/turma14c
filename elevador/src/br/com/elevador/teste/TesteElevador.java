package br.com.elevador.teste;

import br.com.elevador.modelo.Elevador;

public class TesteElevador {

	public static void main(String[] args) {
		Elevador elevador = new Elevador();
		elevador.inicializar((byte)5, (byte)0, (byte)2, "Guilherme");
		System.out.println(elevador.status());
		elevador.entrar2((byte) 3);
		System.out.println(elevador.status());
		System.out.println("---------------subindo---------------------");
		System.out.println(elevador.subir());
		System.out.println(elevador.subir());
		System.out.println(elevador.subir());
		System.out.println(elevador.subir());
		System.out.println(elevador.subir());
		System.out.println(elevador.subir());
		System.out.println(elevador.status());
		System.out.println(elevador.descer());
		System.out.println(elevador.descer());
		System.out.println(elevador.descer());
		System.out.println(elevador.descer());
		System.out.println(elevador.descer());
		System.out.println(elevador.descer());
		System.out.println(elevador.status());
	}

}
