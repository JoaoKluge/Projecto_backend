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

import example.Projeto_final.modelo.ModeloProduto;
import example.Projeto_final.modelo.RespostaModelo;
import example.Projeto_final.repositorio.RepositorioProduto;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api")

public class ControlerProduto {

	@Autowired
	private RepositorioProduto repositorioProduto;
	
	@RequestMapping(value="/produto", method = RequestMethod.GET)
	public @ResponseBody List<ModeloProduto> consultar(){
		return this.repositorioProduto.findAll();
	}
	
	@RequestMapping(value="/produto/{ID}", method = RequestMethod.GET)
	public @ResponseBody ModeloProduto buscar(@PathVariable("id")Integer id) {
		return this.repositorioProduto.findByID(id);
	}
	
	@RequestMapping(value="/produto", method = RequestMethod.POST)
	public @ResponseBody RespostaModelo salvar(@RequestBody ModeloProduto produto) {
		
		try {
			this.repositorioProduto.save(produto);
			return new RespostaModelo("Registro salvo com sucesso!");
		}catch(Exception e) {
			return new RespostaModelo(e.getMessage());
		}
	}
	@RequestMapping(value="/produto", method = RequestMethod.PUT)
	public @ResponseBody RespostaModelo atualizar(@RequestBody ModeloProduto produto) {
		
		try {
			this.repositorioProduto.save(produto);
			return new RespostaModelo("Registro atualizado com sucesso!");
		}catch(Exception e) {
			return new RespostaModelo(e.getMessage());
		}
	}
	@RequestMapping(value="/produto/{ID}", method = RequestMethod.DELETE)
	public @ResponseBody RespostaModelo excluir(@PathVariable("id")Integer id) {
		ModeloProduto ModeloProduto = this.repositorioProduto.findByID(id);
		
		try {
			this.repositorioProduto.delete(ModeloProduto);
			return new RespostaModelo("Registro excluido com sucesso!");
		}catch(Exception e) {
			return new RespostaModelo(e.getMessage());
		}
	}
}

