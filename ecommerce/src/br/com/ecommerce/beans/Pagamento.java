package br.com.ecommerce.beans;

public class Pagamento {
	private String forma,valor;

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public String getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "Pagamento [forma=" + forma + ", valor=" + valor + "]";
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Pagamento(String forma, String valor) {
		super();
		this.forma = forma;
		this.valor = valor;
	}
	
	
}
