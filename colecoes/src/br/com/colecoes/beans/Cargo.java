package br.com.colecoes.beans;

public class Cargo implements Comparable<Cargo>{

	private String nome, nivel;
	private float salario;

	/*
	@Override
	public int compareTo(Cargo outro) {
		if(this.salario>outro.salario) {
			return 1;
		} else if(this.salario<outro.salario) {
			return -1;
		} else return 0;
	}
	*/
	@Override
	public int compareTo(Cargo outro) {
		return this.nome.compareTo(outro.nome);
		//return -this.nome.compareTo(outro.nome);
	}
	public Cargo() {
		super();
	}
	public void setAll(String nome, String nivel, float salario) {
		this.nome = nome;
		this.nivel = nivel;
		this.salario = salario;
	}
	public Cargo(String nome, String nivel, float salario) {
		super();
		this.nome = nome;
		this.nivel = nivel;
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Cargo [nome=" + nome + ", nivel=" + nivel + ", salario=" + salario + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	




}
