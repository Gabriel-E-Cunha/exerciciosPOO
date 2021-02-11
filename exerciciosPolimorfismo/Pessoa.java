package exerciciosPolimorfismo;

import java.util.Date;

public class Pessoa {

	private Date dataNascimento;
	private String nome;
	public Pessoa(Date dataNascimento, String nome) {
		super();
		this.dataNascimento = dataNascimento;
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
