package br.ibm.com.treinamento.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Sessao")

public class Sessao {// vendas
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_sessao")
	private Long id;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Livro livro;
	
	@Column(name = "pertence")
	private String Pertence;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public String getPertence() {
		return Pertence;
	}

	public void setPertence(String pertence) {
		Pertence = pertence;
	}
	
	
	
	

}
