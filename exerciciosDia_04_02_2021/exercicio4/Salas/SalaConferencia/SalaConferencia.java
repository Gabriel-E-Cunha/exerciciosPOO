package exerciciosDia_04_02_2021.exercicio4.Salas.SalaConferencia;

import java.util.ArrayList;

import exerciciosDia_04_02_2021.exercicio4.Outros.Camera;
import exerciciosDia_04_02_2021.exercicio4.Outros.ComputadorRede;
import exerciciosDia_04_02_2021.exercicio4.Outros.ProjetorComputador;
import exerciciosDia_04_02_2021.exercicio4.Salas.Sala;

public abstract class SalaConferencia extends Sala {

	private ArrayList<Camera> cameras;
	private ProjetorComputador projetor;
	private ComputadorRede computador;
	
	public void iniciarConferencia() {
		System.out.println("Iniciando conferência");
	}
	
	public ArrayList<Camera> getCameras() {
		return cameras;
	}
	public void setCameras(ArrayList<Camera> cameras) {
		this.cameras = cameras;
	}
	public ProjetorComputador getProjetor() {
		return projetor;
	}
	public void setProjetor(ProjetorComputador projetor) {
		this.projetor = projetor;
	}
	public ComputadorRede getComputador() {
		return computador;
	}
	public void setComputador(ComputadorRede computador) {
		this.computador = computador;
	}

	public SalaConferencia(int capacidadeFisica, String identificacaoUnica, String apelido, String titulo,
			ArrayList<Camera> cameras, ProjetorComputador projetor, ComputadorRede computador) {
		super(capacidadeFisica, identificacaoUnica, apelido, titulo);
		this.cameras = cameras;
		this.projetor = projetor;
		this.computador = computador;
	}
	
	
	
	
}
