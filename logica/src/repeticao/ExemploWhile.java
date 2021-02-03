package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	public static void main(String[] args) {		
		String email = JOptionPane.showInputDialog("email").toLowerCase();
		while(email.contains("@")==false) {
			email = JOptionPane.showInputDialog("email").toLowerCase();
		}
		System.out.println("Usuario: "+email.substring(0,email.indexOf("@")));
	}

}
