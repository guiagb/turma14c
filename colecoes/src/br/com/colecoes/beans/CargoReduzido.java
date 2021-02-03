package br.com.colecoes.beans;

public class CargoReduzido {
	private String nome;
	private float salario;
	
	public CargoReduzido() {
		super();
	}
	public CargoReduzido(String nome, float salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	public void setAll(String nome, float salario) {
		this.nome = nome;
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "CargoReduzido [nome=" + nome + ", salario=" + salario + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
}
