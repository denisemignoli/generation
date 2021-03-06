package StoreGames.StoreGames.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty(message = "Nome não pode estar vazio")
	@Size(min = 3, max = 15)
	private String nomeProduto;

	@NotEmpty(message = "Preço não pode estar vazia")
	@Size(min = 3, max = 255)
	private String preco;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	@ManyToMany
	@JoinTable(name = "tb_juncao", //determina quem é o "Pai"
	joinColumns = @JoinColumn(name = "fk_produto"),
	inverseJoinColumns = @JoinColumn(name = "fk_categoria"))
	private List<Categoria>listaDeCategorias;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Categoria> getListaDeCategorias() {
		return listaDeCategorias;
	}

	public void setListaDeCategorias(List<Categoria> listaDeCategorias) {
		this.listaDeCategorias = listaDeCategorias;
	}

}