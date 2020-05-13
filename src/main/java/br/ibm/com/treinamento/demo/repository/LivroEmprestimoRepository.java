package br.ibm.com.treinamento.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ibm.com.treinamento.demo.model.Emprestimo;
import br.ibm.com.treinamento.demo.model.Livro;



@Repository
public interface LivroEmprestimoRepository extends JpaRepository<Livro, Long>{

	void save(Emprestimo EM);

	
	
}
