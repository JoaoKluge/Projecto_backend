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

import example.Projeto_final.modelo.ModeloMaquina;
import example.Projeto_final.modelo.RespostaModelo;
import example.Projeto_final.repositorio.RepositorioMaquina;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api")

public class ControlerMaquina {

	@Autowired
	private RepositorioMaquina repositorioMaquina;
	
	@RequestMapping(value="/maquina", method = RequestMethod.GET)
	public @ResponseBody List<ModeloMaquina> consultar(){
		return this.repositorioMaquina.findAll();
	}
	
	@RequestMapping(value="/maquina/{codigo}", method = RequestMethod.GET)
	public @ResponseBody ModeloMaquina buscar(@PathVariable("codigo")Integer codigo) {
		return this.repositorioMaquina.findByCodigo(codigo);
	}
	
	@RequestMapping(value="/maquina", method = RequestMethod.POST)
	public @ResponseBody RespostaModelo salvar(@RequestBody ModeloMaquina cliente) {
		
		try {
			this.repositorioMaquina.save(cliente);
			return new RespostaModelo("Registro salvo com sucesso!");
		}catch(Exception e) {
			return new RespostaModelo(e.getMessage());
		}
	}
	@RequestMapping(value="/maquina", method = RequestMethod.PUT)
	public @ResponseBody RespostaModelo atualizar(@RequestBody ModeloMaquina cliente) {
		
		try {
			this.repositorioMaquina.save(cliente);
			return new RespostaModelo("Registro atualizado com sucesso!");
		}catch(Exception e) {
			return new RespostaModelo(e.getMessage());
		}
	}
	@RequestMapping(value="/maquina/{codigo}", method = RequestMethod.DELETE)
	public @ResponseBody RespostaModelo excluir(@PathVariable("codigo")Integer codigo) {
		ModeloMaquina ModeloMaquina = this.repositorioMaquina.findByCodigo(codigo);
		
		try {
			this.repositorioMaquina.delete(ModeloMaquina);
			return new RespostaModelo("Registro excluido com sucesso!");
		}catch(Exception e) {
			return new RespostaModelo(e.getMessage());
		}
	}
}
