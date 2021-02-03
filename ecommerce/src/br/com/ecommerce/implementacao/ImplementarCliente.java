package br.com.ecommerce.implementacao;

import br.com.ecommerce.beans.ClientePF;
import br.com.ecommerce.beans.ClientePJ;
import br.com.ecommerce.beans.Endereco;
import br.com.ecommerce.util.Magica;


public class ImplementarCliente {

	public static void main(String[] args) {

		char resp = Magica.s("digite <f> para fisica ou <j> para juridica").charAt(0);
		if(resp=='F') {
			ClientePF pf = new ClientePF("gui","22222",
					new Endereco("rua x", "70", "casa", "bela vista", "osasco", "sp", "06070050"),
					"666","555");
			System.out.println(pf.toString());
		}else if (resp=='J') {
			ClientePJ pj = new ClientePJ("guipj", "123", 
					new Endereco("rua x", "70", "casa", "bela vista", "osasco", "sp", "06070050"), 
					"666", "555");
			System.out.println(pj.toString());
		}else {
			System.out.println("op��o invalida");
		}
	}

}
