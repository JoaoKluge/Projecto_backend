package example.Projeto_final.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="produto")
@Entity
public class ModeloProduto {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="ID")
	private int ID;
		
	@Column(name="nome")
	private String nome;
	


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
	
}