package example.Projeto_final.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import example.Projeto_final.modelo.ModeloFuncionario;
import example.Projeto_final.modelo.RespostaModelo;
import example.Projeto_final.repositorio.RepositorioFuncionario;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api")

public class ControlerFuncionario {

	@Autowired
	private RepositorioFuncionario repositorioFuncionario;
	
	@RequestMapping(value="/funcionario", method = RequestMethod.GET)
	public @ResponseBody List<ModeloFuncionario> consultar(){
		return this.repositorioFuncionario.findAll();
	}
	
	@RequestMapping(value="/funcionario/{ID}", method = RequestMethod.GET)
	public @ResponseBody ModeloFuncionario buscar(@PathVariable("id")Integer id) {
		return this.repositorioFuncionario.findByID(id);
	}
	
	@RequestMapping(value="/funcionario", method = RequestMethod.POST)
	public @ResponseBody RespostaModelo salvar(@RequestBody ModeloFuncionario funcionario) {
		
		try {
			this.repositorioFuncionario.save(funcionario);
			return new RespostaModelo("Registro salvo com sucesso!");
		}catch(Exception e) {
			return new RespostaModelo(e.getMessage());
		}
	}  
	@RequestMapping(value="/funcionario", method = RequestMethod.PUT)
	public @ResponseBody RespostaModelo atualizar(@RequestBody ModeloFuncionario funcionario) {
		
		try {
			this.repositorioFuncionario.save(funcionario);
			return new RespostaModelo("Registro atualizado com sucesso!");
		}catch(Exception e) {
			return new RespostaModelo(e.getMessage());
		}
	}
	@RequestMapping(value="/funcionario/{ID}", method = RequestMethod.DELETE)
	public @ResponseBody RespostaModelo excluir(@PathVariable("id")Integer id) {
		ModeloFuncionario ModeloFuncionario = this.repositorioFuncionario.findByID(id);
		
		try {
			this.repositorioFuncionario.delete(ModeloFuncionario);
			return new RespostaModelo("Registro excluido com sucesso!");
		}catch(Exception e) {
			return new RespostaModelo(e.getMessage());
		}
	}
}