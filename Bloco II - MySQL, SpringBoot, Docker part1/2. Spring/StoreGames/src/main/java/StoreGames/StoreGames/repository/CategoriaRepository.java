package StoreGames.StoreGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import StoreGames.StoreGames.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	/**
	 * 
	 * @param nome
	 * @return retorna lista com todos os nomes independete de estarem maiusculas ou
	 *         minusculas
	 * @since v1.0
	 * @author denise
	 */
	public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);

}
