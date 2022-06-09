package example.Projeto_final.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="cliente")
@Entity
public class ModeloCliente {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="ID")
	private int ID;
		
	@Column(name="nome")
	private String nome;
	
	@Column(name="empresa")
	private String empresa;

	@Column(name="CNPJ")
	private String CNPJ;
	
	
	
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String CNPJ) {
		this.CNPJ = CNPJ;
	}
}