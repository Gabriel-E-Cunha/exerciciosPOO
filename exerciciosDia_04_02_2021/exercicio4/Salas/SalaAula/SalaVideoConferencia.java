package exerciciosDia_04_02_2021.exercicio4.Salas.SalaAula;

import java.util.ArrayList;

import exerciciosDia_04_02_2021.exercicio4.Outros.Camera;
import exerciciosDia_04_02_2021.exercicio4.Outros.Retroprojetor;
import exerciciosDia_04_02_2021.exercicio4.Outros.TV;
import exerciciosDia_04_02_2021.exercicio4.Outros.TelaProjecao;

public class SalaVideoConferencia extends SalaAula {

	private ArrayList<Camera> cameras;

	public void gravar() {
		System.out.println("Gravando");
	}
	
	public ArrayList<Camera> getCameras() {
		return cameras;
	}

	public void setCameras(ArrayList<Camera> cameras) {
		this.cameras = cameras;
	}

	public SalaVideoConferencia(int capacidadeFisica, String identificacaoUnica, String apelido, String titulo,
			String professor, int numeroAlunos, Retroprojetor retroprojetor, TelaProjecao telaProjecao, TV tv,
			ArrayList<Camera> cameras) {
		super(capacidadeFisica, identificacaoUnica, apelido, titulo, professor, numeroAlunos, retroprojetor,
				telaProjecao, tv);
		this.cameras = cameras;
	}
	
	
	
}
