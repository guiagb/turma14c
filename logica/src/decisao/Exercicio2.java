package decisao;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * 1. Um hotel cobra R$ 80,00 a diária e mais uma taxa de serviços. 
			A taxa de serviços é de: 
			•	R$ 5,50 por diária, se o número de diárias for maior que 15; 
			•	R$ 6,00 por diária, se o número de diárias for igual a 15; 
			•	R$ 8,00 por diária, se o número de diárias for menor que 15.
			Monte uma aplicação que apresente a conta do cliente.
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
