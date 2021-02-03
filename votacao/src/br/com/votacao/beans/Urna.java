package br.com.votacao.beans;

import java.util.List;

public class Urna {

	private int zona, secao;
	private String cidade;
	private List<Voto> votos;
	
	
	public int totalVotos() {
		return getvotos().size();
		}
	public Urna() {
		super();
	}
	public Urna(int zona, int secao, String cidade, List<Voto> votos) {
		super();
		this.zona = zona;
		this.secao = secao;
		this.cidade = cidade;
		this.votos = votos;
	}
	public void setAll(int zona, int secao, String cidade, List<Voto> votos) {
		this.zona = zona;
		this.secao = secao;
		this.cidade = cidade;
		this.votos = votos;
	}
	@Override
	public String toString() {
		return "Urna [zona=" + zona + ", secao=" + secao + ", cidade=" + cidade + ", votos=" + votos + "]";
	}
	public int getZona() {
		return zona;
	}
	public void setZona(int zona) {
		this.zona = zona;
	}
	public int getSecao() {
		return secao;
	}
	public void setSecao(int secao) {
		this.secao = secao;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public List<Voto> getvotos() {
		return votos;
	}
	public void setvotos(List<Voto> votos) {
		this.votos = votos;
	}
	
	
	
}
