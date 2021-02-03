package br.com.votacao.principal;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.votacao.beans.Candidato;
import br.com.votacao.beans.Eleitor;
import br.com.votacao.beans.Pessoa;
import br.com.votacao.beans.Urna;
import br.com.votacao.beans.Voto;

public class ImplementarVoto {

	public static void main(String[] args) {

			Pessoa candidato1 = new Candidato("Jose da paraiba", 1001, "Vereador","PPT");
			Pessoa candidato2 = new Candidato("Romario do rio", 3001, "Vereador","DOC");
			List<Voto> votos = new ArrayList<Voto>();
			
			do {

				Pessoa escolha = new Candidato();
				if (JOptionPane.showConfirmDialog(null, "<SIM> para candidato1?", "votacao", JOptionPane.YES_NO_OPTION)==0) {
					escolha = candidato1;
				}else escolha = candidato2;
				
				Voto voto = new Voto(
						new Eleitor(
								JOptionPane.showInputDialog("Eleitor, qual seu nome?").toUpperCase(),
								Integer.parseInt(JOptionPane.showInputDialog("Eleitor, qual seu titulo?")),
								true	
								), 
						escolha, 
						true);
				
				votos.add(voto);
			}while(JOptionPane.showConfirmDialog(null, "continuar?","votacao",JOptionPane.YES_NO_OPTION)==0);
			
			Urna urna = new Urna(
					Integer.parseInt(JOptionPane.showInputDialog("Insira a sua zona")), 
					Integer.parseInt(JOptionPane.showInputDialog("Insira a sua secao")), 
					JOptionPane.showInputDialog("Insira a sua cidade"), 
					votos
					);
			
			System.out.println(urna);
			
			System.out.println(urna.totalVotos());
			
			for(Voto voto: urna.getvotos()) {
				System.out.println(voto.getEleitor().getNome());
				System.out.println(voto.getCandidato().getNome());
			}
			

			/* da maneira que eu fiz.. acima esta a do professor humberto
			List<Voto> votos= new ArrayList<Voto>();	

			Voto objvoto = new Voto(
					new Eleitor(JOptionPane.showInputDialog("Eleitor, qual seu nome?").toUpperCase(),
							Integer.parseInt(JOptionPane.showInputDialog("Eleitor, qual seu titulo?")),
							true),
					new Candidato(JOptionPane.showInputDialog("Eleitor, qual o nome do candidato?").toUpperCase(),
							Integer.parseInt(JOptionPane.showInputDialog("Insira o numero do cadidato")),
							JOptionPane.showInputDialog("Qual o cargo?").toUpperCase(),
							JOptionPane.showInputDialog("Qual o partido?").toUpperCase()),
					true);	
			votos.add(0, objvoto);

			Urna voto = new Urna(Integer.parseInt(JOptionPane.showInputDialog("Insira a sua zona")), 
					Integer.parseInt(JOptionPane.showInputDialog("Insira a sua secao")), 
					JOptionPane.showInputDialog("Insira a sua cidade"), 
					votos);



			System.out.println(voto);
			 */


	}
}



