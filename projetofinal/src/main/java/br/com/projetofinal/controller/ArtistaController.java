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

import br.com.projetofinal.beans.Artista;
import br.com.projetofinal.dao.ArtistaDAO;

@RestController
@CrossOrigin("*")
public class ArtistaController {

	@Autowired
	private ArtistaDAO dao; 
	
	@PostMapping("/artista/nacionalidadePost/")
	public ResponseEntity<List<Artista>> getByNacionalidadePost(@RequestBody Artista artista){
		List<Artista> lista =  dao.findByNacionalidade(artista.getNacionalidade());
		
		if (lista.size()==0) {
			return ResponseEntity.status(403).build();
			}
		return ResponseEntity.ok(lista);
	}
	
	
	@GetMapping("/artista/nacionalidade/{nacionalidade}")
	public ResponseEntity<List<Artista>> getByNacionalidade(@PathVariable String nacionalidade){
		List<Artista> lista =  dao.findByNacionalidade(nacionalidade);
		
		if (lista.size()==0) {
			return ResponseEntity.status(403).build();
			}
		return ResponseEntity.ok(lista);
	}
	
	
	@GetMapping("/artista/{cod}")
	public ResponseEntity<Artista> getArtista(@PathVariable int cod) {
		Artista artista = dao.findById(cod).orElse(null);
		if (artista==null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(artista);
	}
	
	@PostMapping("/apagaartista")
	public ResponseEntity<Artista> delArtista(@RequestBody Artista artista) {
		try {
			dao.deleteById(artista.getId());
			return ResponseEntity.ok(artista);
		}catch(Exception e){
			return ResponseEntity.status(403).build();
		}
		
	}
	
	@GetMapping("/artistas")
	public ResponseEntity<List<Artista>> getAll(){
		List<Artista> lista = (List<Artista>) dao.findAll();
		
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}
	
	@PostMapping("/gravarartista")
	public ResponseEntity<Artista> gravar(@RequestBody Artista artista){
		try {
			dao.save(artista);
			return ResponseEntity.ok(artista);
		}catch(Exception e){
			return ResponseEntity.status(403).build();
		}
		
		
		
		
	}
	
	
	
	
	
}
