package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		short n1 = Short.parseShort(JOptionPane.showInputDialog("Jogador 1: Insira um numero entre 1 - 10"));
		short n2 = 0;
		int chances = 0;
		String dica = "";
		do {	
			n2 = Short.parseShort(JOptionPane.showInputDialog("Jogador 2: Tente advinhar o numero 1 - 10"));
			chances = chances + 1 ;
			if (n1!=n2) {
				if (n1>n2) {
					dica = "maior";
				} else dica = "menor";
				JOptionPane.showMessageDialog(null, "hmmm.. voc� errou. O numero � "+dica+" do que o "+n2);
				System.out.println("hmmm.. voc� errou. O numero � "+dica+" do que o "+n2);
			}
		} while(n1!=n2);
		JOptionPane.showMessageDialog(null, "Parab�ns Jogador 2, voc� acertou na "+chances+" tentativa"+"! O n�mero escolhido foi "+n1);
		System.out.println("Parab�ns Jogador 2, voc� acertou na "+chances+" tentativa"+"! O n�mero escolhido foi "+n1);
	}

}
