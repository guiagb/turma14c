package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {

	public static void main(String[] args) {
		String nome_tv = JOptionPane.showInputDialog("nome da tv");
		double valor_tv = Double.parseDouble(JOptionPane.showInputDialog("valor da tv"));
		short pol_tv = Short.parseShort(JOptionPane.showInputDialog("polegadas da tv"));
		short vol_tv = Short.parseShort(JOptionPane.showInputDialog("voltagem da tv"));
		int estoque_tv = Integer.parseInt(JOptionPane.showInputDialog("estoque da tv"));	
	}

}
