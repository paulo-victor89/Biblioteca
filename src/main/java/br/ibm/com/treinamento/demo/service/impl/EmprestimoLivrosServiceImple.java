package br.ibm.com.treinamento.demo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.ibm.com.treinamento.demo.model.Emprestimo;
import br.ibm.com.treinamento.demo.repository.LivroEmprestimoRepository;
import br.ibm.com.treinamento.demo.service.EmprestimoLivrosService;

@Service
public class EmprestimoLivrosServiceImple implements EmprestimoLivrosService{
	
	@Autowired
	private LivroEmprestimoRepository livroEmprestimoRespositpory;

	@Override
	public Emprestimo criaEM(Emprestimo EM) {
		livroEmprestimoRespositpory.save(EM);
		return EM;
	}

	@Override
	public Emprestimo consultaEMById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Emprestimo> consultaEM() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Emprestimo removeEMById(Long id) {
		
		return removeEMById(id);
	}
	



}
