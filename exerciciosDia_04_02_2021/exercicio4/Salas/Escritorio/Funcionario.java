package exerciciosDia_04_02_2021.exercicio4.Salas.Escritorio;

import java.sql.Date;

import exercicioClasses.Pessoa;

public class Funcionario extends Pessoa {

	private String funcao;

	public String getNome() {
		return funcao;
	}

	public void setNome(String nome) {
		this.funcao = nome;
	}

	public Funcionario(String nome, Date dataNascimento, String corPele, String corCabelo, double altura,
			String profissao, double peso, boolean praticaEsporte, String genero, String funcao) {
		super(nome, dataNascimento, corPele, corCabelo, altura, profissao, peso, praticaEsporte, genero);
		this.funcao = funcao;
	}


	
	
	
	
}
