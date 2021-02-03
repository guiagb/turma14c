package br.com.ecommerce.beans;

public class ClientePJ extends Cliente {
	private String cnpj, contato;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}
	
	public ClientePJ() {
		super();
	}

	public ClientePJ(String nome, String telefone, Endereco endereco, String cnpj, String contato) {
		super(nome, telefone, endereco);
		this.cnpj = cnpj;
		this.contato = contato;
	}
	
	public void setAll(String nome, String telefone, Endereco endereco, String cnpj, String contato) {
		super.setAll(nome, telefone, endereco);
		this.cnpj = cnpj;
		this.contato = contato;
	}

	@Override
	public String toString() {
		return "ClientePJ [cnpj=" + cnpj + ", contato=" + contato + super.toString() + "]";
	}
	
	public String getBasico() {
		return "Razao social: "+ super.getNome() + "\nContato";
	}
}
