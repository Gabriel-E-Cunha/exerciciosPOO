package exerciciosDia_04_02_2021.exercicio4.Salas.SalaAula;

import java.util.ArrayList;

import exerciciosDia_04_02_2021.exercicio4.Outros.Assento;
import exerciciosDia_04_02_2021.exercicio4.Outros.ComputadorRede;
import exerciciosDia_04_02_2021.exercicio4.Outros.MesaProfessor;
import exerciciosDia_04_02_2021.exercicio4.Outros.ProjetorComputador;
import exerciciosDia_04_02_2021.exercicio4.Outros.Quadro;
import exerciciosDia_04_02_2021.exercicio4.Outros.Retroprojetor;
import exerciciosDia_04_02_2021.exercicio4.Outros.SistemaAudio;
import exerciciosDia_04_02_2021.exercicio4.Outros.TV;
import exerciciosDia_04_02_2021.exercicio4.Outros.TelaProjecao;

public class SalaInteligente extends SalaNormal {

	private ComputadorRede computadorRede;
	private SistemaAudio sistemaAudio;
	private ProjetorComputador projetorAcoplado;
	private ArrayList<ComputadorRede> computadoresAlunos;
	
	public SalaInteligente(int capacidadeFisica, String identificacaoUnica, String apelido, String titulo,
			String professor, int numeroAlunos, Retroprojetor retroprojetor, TelaProjecao telaProjecao, TV tv,
			ArrayList<Assento> assentos, ArrayList<Quadro> quadros, MesaProfessor mesaProfessor,
			ComputadorRede computadorRede, SistemaAudio sistemaAudio, ProjetorComputador projetorAcoplado,
			ArrayList<ComputadorRede> computadoresAlunos) {
		super(capacidadeFisica, identificacaoUnica, apelido, titulo, professor, numeroAlunos, retroprojetor,
				telaProjecao, tv, assentos, quadros, mesaProfessor);
		this.computadorRede = computadorRede;
		this.sistemaAudio = sistemaAudio;
		this.projetorAcoplado = projetorAcoplado;
		this.computadoresAlunos = computadoresAlunos;
	}
	
	public void ligarProjetorComputador() {
		System.out.println("Ligando projetor do computador");
	}
	
	public ComputadorRede getComputadorRede() {
		return computadorRede;
	}
	public void setComputadorRede(ComputadorRede computadorRede) {
		this.computadorRede = computadorRede;
	}
	public SistemaAudio getSistemaAudio() {
		return sistemaAudio;
	}
	public void setSistemaAudio(SistemaAudio sistemaAudio) {
		this.sistemaAudio = sistemaAudio;
	}
	public ProjetorComputador getProjetorAcoplado() {
		return projetorAcoplado;
	}
	public void setProjetorAcoplado(ProjetorComputador projetorAcoplado) {
		this.projetorAcoplado = projetorAcoplado;
	}
	public ArrayList<ComputadorRede> getComputadoresAlunos() {
		return computadoresAlunos;
	}
	public void setComputadoresAlunos(ArrayList<ComputadorRede> computadoresAlunos) {
		this.computadoresAlunos = computadoresAlunos;
	}
	
	
	
}
