package exerciciosDia_04_02_2021.exercicio4.Salas.SalaConferencia;

import java.util.ArrayList;

import exerciciosDia_04_02_2021.exercicio4.Outros.Camera;
import exerciciosDia_04_02_2021.exercicio4.Outros.ComputadorRede;
import exerciciosDia_04_02_2021.exercicio4.Outros.ProjetorComputador;

public class SalaNormal extends SalaConferencia {

	public SalaNormal(int capacidadeFisica, String identificacaoUnica, String apelido, String titulo,
			ArrayList<Camera> cameras, ProjetorComputador projetor, ComputadorRede computador) {
		super(capacidadeFisica, identificacaoUnica, apelido, titulo, cameras, projetor, computador);
		
	}
	
	
}
