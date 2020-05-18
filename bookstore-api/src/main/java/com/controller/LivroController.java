package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Livro;
import com.repositorio.LivroInterface;

@RestController
@RequestMapping("api/livro")
public class LivroController {
	
	@Autowired
	private LivroInterface livroInt;
	
	@PostMapping
	public void salvar(@RequestBody @Validated Livro livro) {
		livroInt.save(livro);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
