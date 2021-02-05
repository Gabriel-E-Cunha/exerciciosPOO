package exerciciosDia_04_02_2021.exercicio4.Salas.Escritorio;

import java.sql.Date;

import exercicioClasses.Pessoa;

public class CorpoDocente extends Pessoa {

	private String docente;
	
	public String getDocente() {
		return docente;
	}

	public void setDocente(String docente) {
		this.docente = docente;
	}

	public CorpoDocente(String nome, Date dataNascimento, String corPele, String corCabelo, double altura,
			String profissao, double peso, boolean praticaEsporte, String genero, String docente) {
		super(nome, dataNascimento, corPele, corCabelo, altura, profissao, peso, praticaEsporte, genero);
		this.docente = docente;
	}
	
	
	
}
