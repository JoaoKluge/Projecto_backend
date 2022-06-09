package example.Projeto_final.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="ordem_producao")
@Entity
public class ModeloOP {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="OP")
	private int OP;
		
	@Column(name="idCliente")
	private int idCliente;
	
	@Column(name="idProduto")
	private int idProduto;

	@Column(name="idMaquina")
	private int idMaquina;
	
	@Column(name="idFuncionario")
	private int idFuncionario;
	
	@Column(name="quantidade")
	private Double quantidade;
	
	
	
	public int getOP() {
		return OP;
	}
	public void setOP(int OP) {
		this.OP = OP;
	}
	public int getIDCliente() {
		return idCliente;
	}
	public void setIDCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public int getIDProduto() {
		return idProduto;
	}
	public void setIDProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public int getIDMaquina() {
		return idMaquina;
	}
	public void setIDMaquina(int idMaquina) {
		this.idMaquina = idMaquina;
	}
	public int getIDFuncionario() {
		return idFuncionario;
	}
	public void setIDFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
}
