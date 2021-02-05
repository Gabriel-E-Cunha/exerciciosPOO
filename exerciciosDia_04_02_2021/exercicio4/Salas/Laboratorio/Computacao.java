package exerciciosDia_04_02_2021.exercicio4.Salas.Laboratorio;

import java.util.ArrayList;

import exerciciosDia_04_02_2021.exercicio4.Outros.ComputadorRede;

public class Computacao extends Laboratorio {

	private ArrayList<ComputadorRede> computadores;

	public ArrayList<ComputadorRede> getComputadores() {
		return computadores;
	}

	public void setComputadores(ArrayList<ComputadorRede> computadores) {
		this.computadores = computadores;
	}

	public Computacao(int capacidadeFisica, String identificacaoUnica, String apelido, String titulo, boolean requerEPI,
			ArrayList<ComputadorRede> computadores) {
		super(capacidadeFisica, identificacaoUnica, apelido, titulo, requerEPI);
		this.computadores = computadores;
	}
	
	
	
	
}
