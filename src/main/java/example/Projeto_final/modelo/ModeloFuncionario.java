package example.Projeto_final.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="funcionario")
@Entity
public class ModeloFuncionario {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	@Column(name="ID")
	private int ID;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="sobrenome")
	private String sobrenome;
	
	@Column(name="setor")
	private String setor;
	

	
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
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
}