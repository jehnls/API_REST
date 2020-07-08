package com.crud.api.controller.pessoa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.api.entidade.pessoa.Pessoa;
import com.crud.api.repository.PessoaRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/pessoa")
public class pessoaController {

	@Autowired
	PessoaRepository pessoaRepository;

	@GetMapping("/procurar/{id}")
	public Optional<Pessoa> buscarPessoa(@PathVariable(value = "id") Long id) {
		System.out.print(id);
		return pessoaRepository.findById(id);
	}

	@GetMapping("/listar")
	public List<Pessoa> listarPessoas() {
		return pessoaRepository.findAll();
	}

	@PostMapping("/cadastrar")
	public Pessoa salvarPessoa(@RequestBody Pessoa pessoa) {
		pessoaRepository.save(pessoa);
		
		// Retorna uma resposta.	
		return pessoa;
		
	}

	@PutMapping("/alterar")
	public Pessoa alterarPessoa(@RequestBody Pessoa pessoa) {
		pessoaRepository.save(pessoa);
		return pessoa;
	}

	@DeleteMapping("/excluir")
	public Pessoa excluirPessoa(@RequestBody Pessoa pessoa) {
		pessoaRepository.delete(pessoa);
		return pessoa;
	}

}
