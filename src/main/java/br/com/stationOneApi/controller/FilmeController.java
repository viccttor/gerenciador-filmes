package br.com.stationOneApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.stationOneApi.model.Filme;
import br.com.stationOneApi.repository.FilmeRepository;

@RestController
public class FilmeController {
	
	@Autowired
	private FilmeRepository filmeRepository;
	
	@PostMapping("/cadastro-de-filmes")
	@ResponseBody
	public ResponseEntity<Filme> cadastroDeFilme(@RequestBody Filme filme){
		Filme novoFilme = filmeRepository.save(filme);
		return new ResponseEntity<Filme>(novoFilme, HttpStatus.CREATED);
	}
	
	@GetMapping("/listagem-de-filmes")
	@ResponseBody
	public ResponseEntity<List<Filme>> listagemDeFilmes(){
		List<Filme> filmes = filmeRepository.findAll();
		return new ResponseEntity<List<Filme>>(filmes,HttpStatus.OK);
	}
	
	@GetMapping("buscas-de-filmes-por-id")
	@ResponseBody
	public ResponseEntity<Filme> buscasDeFilmesPorId(@RequestParam long id){
		Filme filme = filmeRepository.findById(id).get();
		return new ResponseEntity<Filme>(filme,HttpStatus.OK);
	}

}
