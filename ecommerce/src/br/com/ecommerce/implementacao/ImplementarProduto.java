package br.com.ecommerce.implementacao;

import br.com.ecommerce.beans.Produto;

public class ImplementarProduto {

	public static void main(String[] args) {
		Produto produto = new Produto();
		System.out.println(produto);
		produto.setAll(1000, "CAMISETA PRETA", (float)29.90, (float)17.90, 25);
		System.out.println(produto);
		produto.atualizarValores(10);
		System.out.println(produto);
		System.out.println(produto.getTotalCompra());
		System.out.println(produto.getTotalVenda());
	}

}
