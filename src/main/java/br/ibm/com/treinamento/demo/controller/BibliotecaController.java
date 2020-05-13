package br.ibm.com.treinamento.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ibm.com.treinamento.demo.model.Livro;
import br.ibm.com.treinamento.demo.repository.LivroEmprestimoRepository;



@RestController
@RequestMapping ("/")

public class BibliotecaController {
	
	@Autowired
	private LivroEmprestimoRepository ler;
	
		
	@PostMapping("livro/novo")
	public Livro criaLivro (@RequestBody Livro novoLivro) {
		return ler.save(novoLivro);
	}
	@GetMapping ("livro/consulta")
	public List<Livro> consultaLivro(){
		return ler.findAll();
				
	}
	@GetMapping("livro/consulta/{id}")
	public Livro consultaLivroById(@PathVariable(value = "id")Long id) {
		return ler.findById(id).get();
	}
	@DeleteMapping("livro/deleta")
	public void deletaLivroById(@RequestBody Livro deletaLivro) {
		ler.delete(deletaLivro);
	}
	

}
