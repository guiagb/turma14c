package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {
		String disciplina = JOptionPane.showInputDialog("Insira a disciplina").toUpperCase();
		float  nota1 = Float.parseFloat(JOptionPane.showInputDialog("Insira a sua nota 1"));
		float  nota2 = Float.parseFloat(JOptionPane.showInputDialog("Insira a sua nota 2"));
		float  media = (nota1 + nota2)/2;
		if (media>=6) {
			System.out.println("Voc� foi aprovado");
		} else if(media<4) {
			System.out.println("Voc� foi reprovado");
		} else {
			System.out.println("Voc� est� em recupera��o");
		}
		
	}

}
