package br.com.ecommerce.implementacao;



import br.com.ecommerce.beans.Cliente;
import br.com.ecommerce.beans.Endereco;
import br.com.ecommerce.beans.Pagamento;
import br.com.ecommerce.beans.Produto;
import br.com.ecommerce.beans.Venda;
import br.com.ecommerce.util.Magica;

public class ImplementarProdutoConstrutor {

	
	public static void main(String[] args) {
		Venda venda = new Venda(
				10001,
				new Cliente(Magica.s("Nome"), "1234569", 
						new Endereco(
								"Rua francisco", 
								"70", 
								"casa", 
								"bela vista", 
								"osasco", 
								"sp", 
								"0123")
						), new Produto(
								111, 
								2, 
								"camiseta", 
								(float)20.5, 
								(float)19.5), 
				"10/02/2021", 
				(float) 1000, 
				new Pagamento(
						"debito", 
						"10001")
				);
		
		System.out.println(venda.toString()); 
	}

}
