package com.crud.api.controller.pessoa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.api.entidade.pessoa.Pessoa;
import com.crud.api.repository.PessoaRepository;

@RestController
@RequestMapping("/api/pessoa")
public class pessoaController {
	
	@Autowired
	PessoaRepository pessoaRepository;
	
	@GetMapping("/listar")
	public List<Pessoa> listarPessoas(){
		return pessoaRepository.findAll();
	}
	
	@PostMapping("/save")
	public void salvarPessoa (Pessoa pessoa) {
		
		pessoaRepository.save(pessoa);
		
	}
	
	//PUT
	
	//DELETE
	

	
	
	
}
