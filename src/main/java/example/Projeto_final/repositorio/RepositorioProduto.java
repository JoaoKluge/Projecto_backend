package example.Projeto_final.repositorio;

import java.util.List;
import org.springframework.data.repository.Repository;
import example.Projeto_final.modelo.ModeloProduto;

	public interface RepositorioProduto extends Repository<ModeloProduto, Integer>{
		
		void save(ModeloProduto produto);
		List<ModeloProduto> findAll();
		ModeloProduto findByID(Integer id);
		void delete(ModeloProduto produto);
}
