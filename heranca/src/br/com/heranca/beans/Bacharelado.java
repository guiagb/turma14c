package br.com.heranca.beans;

import br.com.heranca.util.PadraoFormacao;

public class Bacharelado extends Formacao implements PadraoFormacao{
	private String projetoConclusao;
	private int cargaHorarioEstagio;
	
	@Override
	public String calculcarDesconto(float porc) {
		return null;
	}
	
	public void calcularMensalidade(double fator) {
		super.setMensalidade((super.getDuracao()*fator*600)+(cargaHorarioEstagio*12));
	}
	

	public Bacharelado(String formacao, int periodo, int duracao, double mensalidade, String projetoConclusao,
			int cargaHorarioEstagio) {
		super(formacao, periodo, duracao, mensalidade);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorarioEstagio = cargaHorarioEstagio;
	}


	public Bacharelado() {
		super();
	}
	
	
	public void setAll(String formacao, int periodo, int duracao, double mensalidade, String projetoConclusao,
			int cargaHorarioEstagio) {
		super.setAll(formacao, periodo, duracao, mensalidade);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorarioEstagio = cargaHorarioEstagio;
	}

	@Override
	public String toString() {
		return "Bacharelado [projetoConclusao=" + projetoConclusao + ", cargaHorarioEstagio=" + cargaHorarioEstagio
				+ "," + super.toString() + "]";
	}

	public String getProjetoConclusao() {
		return projetoConclusao;
	}
	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}
	public int getCargaHorarioEstagio() {
		return cargaHorarioEstagio;
	}
	public void setCargaHorarioEstagio(int cargaHorarioEstagio) {
		this.cargaHorarioEstagio = cargaHorarioEstagio;
	}
	
}
