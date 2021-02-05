package exerciciosDia_04_02_2021.exercicio4.Salas.Laboratorio;

import java.util.ArrayList;

import exerciciosDia_04_02_2021.exercicio4.Outros.AmostraBiologica;

public class Biologia  extends Laboratorio{

	
	private ArrayList<AmostraBiologica> amostrarBiologicas;

	public void observarAmostrarBiologicas() {
		System.out.println("Observando amostras");
	}
	
	public ArrayList<AmostraBiologica> getAmostrarBiologicas() {
		return amostrarBiologicas;
	}

	public void setAmostrarBiologicas(ArrayList<AmostraBiologica> amostrarBiologicas) {
		this.amostrarBiologicas = amostrarBiologicas;
	}

	public Biologia(int capacidadeFisica, String identificacaoUnica, String apelido, String titulo, boolean requerEPI,
			ArrayList<AmostraBiologica> amostrarBiologicas) {
		super(capacidadeFisica, identificacaoUnica, apelido, titulo, requerEPI);
		this.amostrarBiologicas = amostrarBiologicas;
	}
	
	
	
}
