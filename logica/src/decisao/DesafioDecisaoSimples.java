package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Insira seu nome").toUpperCase();
		//byte idade = Byte.parseByte(JOptionPane.showInputDialog("Insira sua idade"));
		short idade = Short.parseShort(JOptionPane.showInputDialog("Insira sua idade"));
		if (idade>=18 && idade<70) {
			System.out.println(nome+", voc� obrigada a votar");
		}
		if (idade<16) {
			System.out.println(nome+", voc� n�o pode votar");
		}
		if (idade==16 || idade==17 || idade>=70) {
			System.out.println(nome+", seu voto facultativo");
		}
	}
}