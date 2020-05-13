package br.ibm.com.treinamento.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Emprestimo")// = produtovenda 

public class Emprestimo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="id_emprestimo")
	private Long id;
	@Column(name = "quantidade_livro_emprestimo", nullable = false)
	private Integer quantidade;

	
	
	@OneToMany(cascade = CascadeType.ALL)
		private List<Livro>livro;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Usuario usuario;
		
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public List<Livro> getLivro() {
		return livro;
	}

	public void setLivro(List<Livro> livro) {
		this.livro = livro;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	

	
	
	

}
