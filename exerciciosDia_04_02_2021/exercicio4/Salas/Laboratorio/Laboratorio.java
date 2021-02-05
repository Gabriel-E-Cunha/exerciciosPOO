package exerciciosDia_04_02_2021.exercicio4.Salas.Laboratorio;

import exerciciosDia_04_02_2021.exercicio4.Salas.Sala;

public abstract class Laboratorio extends Sala {

	private boolean requerEPI;

	public Laboratorio(int capacidadeFisica, String identificacaoUnica, String apelido, String titulo,
			boolean requerEPI) {
		super(capacidadeFisica, identificacaoUnica, apelido, titulo);
		this.requerEPI = requerEPI;
	}

	public void fazerExperimento() {
		System.out.println("Fazendo experimento de laboratório");
	}
	
	public boolean isRequerEPI() {
		return requerEPI;
	}

	public void setRequerEPI(boolean requerEPI) {
		this.requerEPI = requerEPI;
	}
	 
	
	
}
