package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoComposta {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("nome do produto");
		float valor = Float.parseFloat(JOptionPane.showInputDialog("valor de venda"));
		int estoque = Integer.parseInt(JOptionPane.showInputDialog("quantidade"));	
		float total = valor * estoque;
		float desconto = total*(float) 0.9;
		
		if (estoque>=10 && estoque<=20) {
			System.out.println("Estoque m�dio");
		} else if (estoque>20){
			System.out.println("Estoque alto");
		} else if(estoque>=5 && estoque <=9) {
			System.out.println("Estoque baixo");
		} else if(estoque<5) { 
			System.out.println("Estoque emergencial");
		}

		System.out.println("Valor total de estoque: "+total);
		System.out.println("Valor com desconto: "+desconto);
		
	}

}