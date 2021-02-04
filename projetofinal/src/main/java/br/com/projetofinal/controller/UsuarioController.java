package br.com.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.beans.Usuario;
import br.com.projetofinal.dao.UsuarioDAO;

@RestController
@CrossOrigin("*")
public class UsuarioController {
	
	@Autowired
	private UsuarioDAO dao;
	
	
	@PostMapping("/login")
	public ResponseEntity<Usuario> logar(@RequestBody Usuario user){
		Usuario resposta = dao.findByEmailAndSenha(user.getEmail(), user.getSenha());
		if (resposta==null) {
			return ResponseEntity.status(403).build();
			}
		return ResponseEntity.ok(resposta);
	}
	
	
	@PostMapping("/novousuario")
	public ResponseEntity<Usuario> gravar(@RequestBody Usuario user){
		try {
			if (user.getNome().length()<4) {
				return ResponseEntity.status(403).build();
			}
			dao.save(user);
			return ResponseEntity.ok(user);
		}catch(Exception e){
			return ResponseEntity.status(403).build();
		}
	
	}
	
	
	@GetMapping("/usuario/{cod}")
	public ResponseEntity<Usuario> getUser(@PathVariable int cod) {
		Usuario user = dao.findById(cod).orElse(null);
		if (user==null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(user);
	}
	
	@GetMapping("/usuarios")
	public ResponseEntity<List<Usuario>> getAll(){
		List<Usuario> lista = (List<Usuario>) dao.findAll();
		
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}
	
	
	
	
}
