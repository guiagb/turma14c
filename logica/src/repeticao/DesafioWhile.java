package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {
		String nome = " ";
		while(nome.length()<5 || nome.length()>20) {
			nome = JOptionPane.showInputDialog("insira seu nome").toUpperCase();
		} 
		byte mes = 0;
		while(mes<1 || mes>12) {
			mes = Byte.parseByte(JOptionPane.showInputDialog("insira o mes"));
		} 
		byte dias_mes = 31;
		if (mes==2) {
			dias_mes = 28;
		} else if (mes==4 || mes==6 || mes==9 || mes==11) {
			dias_mes = 30;
		}
		byte dia = 0;
		while(dia<1 || dia>dias_mes) {
			dia = Byte.parseByte(JOptionPane.showInputDialog("insira o dia"));
		}
		short ano = 0;
		while(ano<2003) {
			ano = Short.parseShort(JOptionPane.showInputDialog("insira o ano"));
		}
		System.out.println(nome);
		System.out.println("Dia: "+dia+" M�s: "+mes+" Ano: "+ano);
		System.out.println(dia+"/"+mes+"/"+ano);
	}

}
