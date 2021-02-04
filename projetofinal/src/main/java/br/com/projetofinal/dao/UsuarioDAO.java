package br.com.projetofinal.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.projetofinal.beans.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario,Integer>{

	 /*
	  * metodos que o spring cria sao:
	  * save(); grava 
	  * findById(); consultar pela PK
	  * findAll(); consulta todas a linhas
	  * deleteByID(); apaga atraves da PK
	  * deleteAll(); apaga tudo
	  * count(); retorna a quantidade de linhas
	  * existsByID(); retorna um bool se existe ou nao
	  */
	
	public Usuario findByEmailAndSenha(String email, String senha);
	
}
