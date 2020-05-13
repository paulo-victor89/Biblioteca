package br.ibm.com.treinamento.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.ibm.com.treinamento.demo.model.Emprestimo;






@Service
public interface EmprestimoLivrosService {
	
	//EM = Emprestimo
	
			//Insere no H2 via JSON
			Emprestimo criaEM(Emprestimo em);
			
			//Consulta no H2 por Id via JSON
			Emprestimo consultaEMById(Long id);
			
			//Consulta no H2 todos PVs
			List<Emprestimo> consultaEM();
			
			//Deleta do H2 todos dados por Id do PV via JSON
		Emprestimo removeEMById(Long id);

		

}
