package decisao;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Escreva um c�digo que leia tr�s valores inteiros e diferentes e mostre-os em ordem decrescente.
		 */

		int v1 = Integer.parseInt(JOptionPane.showInputDialog("valor 1"));
		int v2 = Integer.parseInt(JOptionPane.showInputDialog("valor 2"));
		int v3 = Integer.parseInt(JOptionPane.showInputDialog("valor 3"));
		System.out.println("Numeros inseridos: "+v1+" "+v2+" "+v3);

		System.out.println("Primeira forma....");
		//checa se sao diferentes
		if (v1 == v2 || v2 == v3 || v3 == v1) {
			System.out.println("Insira numeros diferentes");
			System.exit(0);;
		}else System.out.println("Numeros ordenados: ");

		if(v1 > v2 && v1 > v3) {
			//v1 maior
			if(v2 > v3) {	
				System.out.println(v1+" "+v2+" "+v3);
			} else {
				System.out.println(v1+" "+v3+" "+v2);
			}
		} else if(v2 > v1 && v2>v3) {
			//v2 maior
			if(v1 > v3) {
				System.out.println(v2+" "+v1+" "+v3);
			} else {
				System.out.println(v2+" "+v3+" "+v1);
			}
		} else if(v3 > v1 && v3>v2) {
			//v3 maior
			if(v2 > v1) {
				System.out.println(v3+" "+v2+" "+v1);
			} else {
				System.out.println(v3+" "+v1+" "+v2);
			}
		}


		//max e min
		System.out.println("Segunda forma....");
		int max = Integer.max(v1, v2); 
		int maxx = Integer.max(max, v3);
		int min = Integer.min(v1, v2);
		int minn = Integer.min(min, v3);

		System.out.println(minn);
		System.out.println(maxx);

	}

}
