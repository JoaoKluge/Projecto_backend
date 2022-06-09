package example.Projeto_final.repositorio;

import java.util.List;
import org.springframework.data.repository.Repository;
import example.Projeto_final.modelo.ModeloMaquina;

	public interface RepositorioMaquina extends Repository<ModeloMaquina, Integer>{
		
		void save(ModeloMaquina maquina);
		List<ModeloMaquina> findAll();
		ModeloMaquina findByCodigo(Integer codigo);
		void delete(ModeloMaquina maquina);
}
