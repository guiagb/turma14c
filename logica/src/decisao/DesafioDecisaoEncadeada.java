package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoEncadeada {
	public static void main(String[] args) {
		
		/*
		 * 
		 * Capturar:
		 * - nome da cidade
		 * - IDH da cidade
		 * - populacao da cidade
		 * Para as cidades com popula��o maior que 200.000
		 * considere o IDH da seguinte forma:
		 * - se o IDH for maior que 0,90 => "Cidade Perfeita"
		 * - se o IDH estiver entre 0,75 e 0,90 => "Boa cidade"
		 * - se o IDH for menor que 0,75 => "Cidade precisa de cuidados"
		 * Se a populacao for menor ou igual a 200.000
		 * - se o IDH for menor que 0,85 => "Cidade precisa de cuidados"
		 * - se o IDH for maior ou igual a 0,85 => "Boa cidade"
		 
		 */
		
		String cidade = JOptionPane.showInputDialog("cidade").toUpperCase();
		float idh = Float.parseFloat(JOptionPane.showInputDialog("IDH"));
		int populacao = Integer.parseInt(JOptionPane.showInputDialog("populacao"));
		
		if (populacao >= 200000) {
			if (idh >= 0.90) {
				System.out.println("Cidade perfeita");
			} else if (idh > 0.75 && idh < 0.90) {
				System.out.println("Boa cidade");
			} else if (idh <= 0.75) {
				System.out.println("Cidade precisa de cuidados");
			}
		} else if (populacao > 0 && populacao < 200000){
			if (idh < 0.85) {
				System.out.println("Cidade precisa de cuidados");
			} else if (idh >= 0.85) {
				System.out.println("Boa cidade");
			}
		}
		 
	}
}
