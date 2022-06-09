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

import example.Projeto_final.modelo.ModeloOP;
import example.Projeto_final.modelo.RespostaModelo;
import example.Projeto_final.repositorio.RepositorioOP;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api")

public class ControlerOP {

	@Autowired
	private RepositorioOP repositorioOP;
	
	@RequestMapping(value="/op", method = RequestMethod.GET)
	public @ResponseBody List<ModeloOP> consultar(){
		return this.repositorioOP.findAll();
	}
	
	@RequestMapping(value="/op/{OP}", method = RequestMethod.GET)
	public @ResponseBody ModeloOP buscar(@PathVariable("op")Integer op) {
		return this.repositorioOP.findByOP(op);
	}
	
	@RequestMapping(value="/op", method = RequestMethod.POST)
	public @ResponseBody RespostaModelo salvar(@RequestBody ModeloOP op) {
		
		try {
			this.repositorioOP.save(op);
			return new RespostaModelo("Registro salvo com sucesso!");
		}catch(Exception e) {
			return new RespostaModelo(e.getMessage());
		}
	}
	@RequestMapping(value="/op", method = RequestMethod.PUT)
	public @ResponseBody RespostaModelo atualizar(@RequestBody ModeloOP op) {
		
		try {
			this.repositorioOP.save(op);
			return new RespostaModelo("Registro atualizado com sucesso!");
		}catch(Exception e) {
			return new RespostaModelo(e.getMessage());
		}
	}
	@RequestMapping(value="/op/{OP}", method = RequestMethod.DELETE)
	public @ResponseBody RespostaModelo excluir(@PathVariable("op")Integer op) {
		ModeloOP ModeloOP = this.repositorioOP.findByOP(op);
		
		try {
			this.repositorioOP.delete(ModeloOP);
			return new RespostaModelo("Registro excluido com sucesso!");
		}catch(Exception e) {
			return new RespostaModelo(e.getMessage());
		}
	}
}
