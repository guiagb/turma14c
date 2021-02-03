package br.com.ecommerce.beans;

public class ClientePF extends Cliente{
	
	private String cpf, rg;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {

		this.rg = rg;
	}
	
	
	public ClientePF() {
		super();
	}
	

	public ClientePF(String nome, String telefone, Endereco endereco, String cpf, String rg) {
		super(nome, telefone, endereco);
		this.cpf = cpf;
		this.rg = rg;
	}

	@Override
	public String toString() {
		return "ClientePF [cpf=" + cpf + ", rg=" + rg + ", " + super.toString() + "]";
	}

	public void setAll(String nome, String telefone, Endereco endereco, String cpf, String rg) {
		super.setAll(nome, telefone, endereco);
		this.cpf = cpf;
		this.rg = rg;
	}

	
	

	
	
	
	
}
