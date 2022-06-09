package example.Projeto_final.repositorio;

import java.util.List;
import org.springframework.data.repository.Repository;
import example.Projeto_final.modelo.ModeloFuncionario;

	public interface RepositorioFuncionario extends Repository<ModeloFuncionario, Integer>{
		
		void save(ModeloFuncionario funcionario);
		List<ModeloFuncionario> findAll();
		ModeloFuncionario findByID(Integer id);
		void delete(ModeloFuncionario funcionario);
}
	