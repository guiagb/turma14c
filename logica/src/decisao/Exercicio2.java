package decisao;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * 1. Um hotel cobra R$ 80,00 a di�ria e mais uma taxa de servi�os. 
			A taxa de servi�os � de: 
			�	R$ 5,50 por di�ria, se o n�mero de di�rias for maior que 15; 
			�	R$ 6,00 por di�ria, se o n�mero de di�rias for igual a 15; 
			�	R$ 8,00 por di�ria, se o n�mero de di�rias for menor que 15.
			Monte uma aplica��o que apresente a conta do cliente.
		 */
		
		int dias = Integer.parseInt(JOptionPane.showInputDialog("quantos dias deseja ficar?"));
		float total = 0;
		float diaria = 0;
		
		if(dias>15) {
			diaria = (float) 5.50;
		}else if (dias==15) {
			diaria = (float) 6.00;
		}else if(dias<15 && dias > 0 ) {
			diaria = (float) 8.00;
		}else {
			System.out.println("quantidade de dias invalido");
		}
		total = dias * diaria + 80;
		System.out.println("Sua conta final eh: "+total);
	}

}
