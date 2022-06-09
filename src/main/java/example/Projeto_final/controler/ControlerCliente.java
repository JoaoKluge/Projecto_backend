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

import example.Projeto_final.modelo.ModeloCliente;
import example.Projeto_final.modelo.RespostaModelo;
import example.Projeto_final.repositorio.RepositorioCliente;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api")

public class ControlerCliente {

	@Autowired
	private RepositorioCliente repositorioCliente;
	
	@RequestMapping(value="/cliente", method = RequestMethod.GET)
	public @ResponseBody List<ModeloCliente> consultar(){
		return this.repositorioCliente.findAll();
	}
	
	@RequestMapping(value="/cliente/{ID}", method = RequestMethod.GET)
	public @ResponseBody ModeloCliente buscar(@PathVariable("ID")Integer id) {
		return this.repositorioCliente.findByID(id);
	}
	
	@RequestMapping(value="/cliente", method = RequestMethod.POST)
	public @ResponseBody RespostaModelo salvar(@RequestBody ModeloCliente repositorio) {
		
		try {
			this.repositorioCliente.save(repositorio);
			return new RespostaModelo("Registro salvo com sucesso!");
		}catch(Exception e) {
			return new RespostaModelo(e.getMessage());
		}
	}
	@RequestMapping(value="/cliente", method = RequestMethod.PUT)
	public @ResponseBody RespostaModelo atualizar(@RequestBody ModeloCliente repositorio) {
		
		try {
			this.repositorioCliente.save(repositorio);
			return new RespostaModelo("Registro atualizado com sucesso!");
		}catch(Exception e) {
			return new RespostaModelo(e.getMessage());
		}
	}
	@RequestMapping(value="/cliente/{ID}", method = RequestMethod.DELETE)
	public @ResponseBody RespostaModelo excluir(@PathVariable("ID")Integer id) {
		ModeloCliente ModeloCliente = this.repositorioCliente.findByID(id);
		
		try {
			this.repositorioCliente.delete(ModeloCliente);
			return new RespostaModelo("Registro excluido com sucesso!");
		}catch(Exception e) {
			return new RespostaModelo(e.getMessage());
		}
	}
}