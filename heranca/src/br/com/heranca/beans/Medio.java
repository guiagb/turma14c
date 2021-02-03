package br.com.heranca.beans;

import br.com.heranca.util.PadraoFormacao;

public class Medio extends Formacao implements PadraoFormacao{
	private String tipo;

	
	@Override
	public String calculcarDesconto(float porc) {
		return null;
	}
	
	public void calcularMensalidade(double fator) {
		super.setMensalidade((super.getDuracao()*fator*500));
	}
	
	
	public Medio() {
		super();
	}
	
	public void setAll(String formacao, int periodo, int duracao, double mensalidade, String tipo) {
		super.setAll(formacao, periodo, duracao, mensalidade);
		this.tipo = tipo;
	}

	public Medio(String formacao, int periodo, int duracao, double mensalidade, String tipo) {
		super(formacao, periodo, duracao, mensalidade);
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Medio [tipo=" + tipo + super.toString() + "]";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}