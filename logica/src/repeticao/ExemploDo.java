package repeticao;

import javax.swing.JOptionPane;

public class ExemploDo {

	public static void main(String[] args) {
		char continua='N';
		int n1 = 0;
		int n2 = 0;
		do{
			n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira n1"));
			n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira n2"));
			System.out.println("Resultado: "+ (n1+n2));
			continua = JOptionPane.showInputDialog("Quer continuar? (S)").toUpperCase().charAt(0);
		}while(continua=='S');

	}

}
