package example.Projeto_final.repositorio;

import java.util.List;
import org.springframework.data.repository.Repository;
import example.Projeto_final.modelo.ModeloOP;

	public interface RepositorioOP extends Repository<ModeloOP, Integer>{
		
		void save(ModeloOP op);
		List<ModeloOP> findAll();
		ModeloOP findByOP(Integer op);
		void delete(ModeloOP op);
}