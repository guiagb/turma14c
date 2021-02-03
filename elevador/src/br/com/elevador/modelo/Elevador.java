package br.com.elevador.modelo;

public class Elevador {
	byte andarMaximo, andarMinimo, capacidadePessoas, qtdePessoas, andarAtual;
	String nome;

	public void entrar1() {
		if (qtdePessoas<capacidadePessoas) {
			qtdePessoas = (byte) (qtdePessoas + 1);
		} else {
			qtdePessoas = capacidadePessoas;
			System.out.println("Elevador com capacidade limite, alguem ficou de fora");
		}
	}
	
	public void entrar2(byte qtde) {
		if (qtdePessoas+qtde<=capacidadePessoas) {
			qtdePessoas = (byte) (qtdePessoas + qtde) ;
		} else{
			qtdePessoas = capacidadePessoas;
			System.out.println("Elevador com capacidade limite, alguem ficou de fora");
		}
	}
	
	public void sair() {
		if (qtdePessoas-1>=0) {
			qtdePessoas = (byte) (qtdePessoas - 1) ;
		}
	}
	
	public String subir() {
		if (andarAtual<andarMaximo) {
			andarAtual = (byte) (andarAtual + 1);
			return "Indo para o andar "+andarAtual;
		}else return "Você já está no ultimo andar, impossivel subir mais...";
	}
	
	public String descer() {
		if (andarAtual>andarMinimo) {
			andarAtual = (byte) (andarAtual - 1);
			return "Indo para o andar "+andarAtual;
		}else return "Você já está no terreo andar, impossivel descer mais...";
	}
	
	public String status() {
		return "Quantidade de pessoas: "+qtdePessoas+" Andar atual: "+andarAtual+" Capacidade de pessoas: "+capacidadePessoas;
	}
	
	public void inicializar(byte andarMaximo, byte andarMinimo, byte capacidadePessoas, String nome) {
		this.andarMaximo = andarMaximo;
		this.andarMinimo = andarMinimo;
		this.capacidadePessoas = capacidadePessoas;
		this.nome = nome;
	}
}
