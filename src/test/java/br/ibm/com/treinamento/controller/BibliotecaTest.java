package br.ibm.com.treinamento.controller;

import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import br.ibm.com.treinamento.demo.controller.BibliotecaController;
import br.ibm.com.treinamento.demo.repository.EmprestimoRepository;

public class BibliotecaTest {
	
	private BibliotecaController bibliotecaController;
	
	@Mock
	private EmprestimoRepository emprestimoRepository;

	@Before
	public void setup() {
		bibliotecaController = new BibliotecaController();
	}
	
	

}
