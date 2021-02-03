package br.com.heranca.beans;

import br.com.heranca.util.PadraoFormacao;

public class Formacao implements PadraoFormacao {
	private String formacao;
	private int periodo, duracao;
	private double mensalidade;

	@Override
	public String calculcarDesconto(float porc) {
		return null;
	}
	
	public void calcularMensalidade(double fator) {	
	
	}
	
	public void definirDuracao() {
		if (this instanceof Medio) {
			setDuracao(36);
		} else if (this instanceof Tecnologo) {
			setDuracao(24);
		} else if (this instanceof Bacharelado && formacao.contains("ENGENHARIA")==true){
			setDuracao(60);
		}else if (this instanceof Bacharelado && formacao.contains("ENGENHARIA")==true) {
			setDuracao(48);
		} 
	}
	
	public double exibirMedia(double ps1, double ps2) {
		return (ps1+ps2)/2;
	}
	public double exibirMedia(double ps1, double ps2, double nac1, double nac2) {
		return ((nac1+nac2)/2)*0.2 + ((ps1+ps2)/2)*0.8;
	}
	public double exibirMedia(double ps1, double ps2, double nac1, double nac2, double am1, double am2) {
		return ((nac1+nac2)/2)*0.2 + ((ps1+ps2)/2)*0.5 + ((am1+am2)/2)*0.3;
	}
	
	public void setAll(String formacao, int periodo, int duracao, double mensalidade) {
		this.formacao = formacao;
		this.periodo = periodo;
		this.duracao = duracao;
		this.mensalidade = mensalidade;
	}
	
	public Formacao() {
		super();
	}
	
	public Formacao(String formacao, int periodo, int duracao, double mensalidade) {
		super();
		this.formacao = formacao;
		this.periodo = periodo;
		this.duracao = duracao;
		this.mensalidade = mensalidade;
	}

	@Override
	public String toString() {
		return "Formacao [formacao=" + formacao + ", periodo=" + periodo + ", duracao=" + duracao + ", mensalidade="
				+ mensalidade + "]";
	}

	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public double getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}


	


	
	
}
