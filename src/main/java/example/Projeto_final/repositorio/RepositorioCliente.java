package example.Projeto_final.repositorio;

import java.util.List;
import org.springframework.data.repository.Repository;
import example.Projeto_final.modelo.ModeloCliente;

public interface RepositorioCliente extends Repository<ModeloCliente, Integer>{
	
	void save(ModeloCliente cliente);
	List<ModeloCliente> findAll();
	ModeloCliente findByID(Integer id);
	void delete(ModeloCliente cliente);
}

	

