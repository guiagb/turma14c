package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {
	
		String disciplina = JOptionPane.showInputDialog("Insira a disciplina").toUpperCase();
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Quantas faltas teve"));
		
		if (faltas>=20) {
			System.out.println("Você foi reprovado por falta");
		} else {	
			
			float  nota1 = Float.parseFloat(JOptionPane.showInputDialog("Insira a sua nota 1"));
			float  nota2 = Float.parseFloat(JOptionPane.showInputDialog("Insira a sua nota 2"));
			float  media = (nota1 + nota2)/2;
			
			if (media>=6) {
				System.out.println("Você foi aprovado");
			} else if(media<4) {
				System.out.println("Você foi reprovado");
			} else {
				System.out.println("Você está em recuperação");
			}
		
		}
	}

}
