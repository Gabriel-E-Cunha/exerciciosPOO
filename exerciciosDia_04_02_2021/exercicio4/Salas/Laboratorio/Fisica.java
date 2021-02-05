package exerciciosDia_04_02_2021.exercicio4.Salas.Laboratorio;

import java.util.ArrayList;

import exerciciosDia_04_02_2021.exercicio4.Outros.ObjetoFisica;

public class Fisica extends Laboratorio {

	private ArrayList<ObjetoFisica> objetosFisica;

	public void fazerExperimentoFisico() {
		System.out.println("Fazendo experimento físico");
	}
	
	public ArrayList<ObjetoFisica> getObjetosFisica() {
		return objetosFisica;
	}

	public void setObjetosFisica(ArrayList<ObjetoFisica> objetosFisica) {
		this.objetosFisica = objetosFisica;
	}

	public Fisica(int capacidadeFisica, String identificacaoUnica, String apelido, String titulo, boolean requerEPI,
			ArrayList<ObjetoFisica> objetosFisica) {
		super(capacidadeFisica, identificacaoUnica, apelido, titulo, requerEPI);
		this.objetosFisica = objetosFisica;
	}
	
	
	
}
