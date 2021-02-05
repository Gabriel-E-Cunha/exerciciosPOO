package exerciciosDia_04_02_2021.exercicio4.Salas.SalaAula;

import java.util.ArrayList;
import java.util.Arrays;

import exerciciosDia_04_02_2021.exercicio4.Outros.Assento;
import exerciciosDia_04_02_2021.exercicio4.Outros.MesaProfessor;
import exerciciosDia_04_02_2021.exercicio4.Outros.Quadro;
import exerciciosDia_04_02_2021.exercicio4.Outros.Retroprojetor;
import exerciciosDia_04_02_2021.exercicio4.Outros.TV;
import exerciciosDia_04_02_2021.exercicio4.Outros.TelaProjecao;

public class SalaNormal extends SalaAula {

	private ArrayList<Assento> assentos;
	private ArrayList<Quadro> quadros;
	private MesaProfessor mesaProfessor;
	public SalaNormal(int capacidadeFisica, String identificacaoUnica, String apelido, String titulo, String professor,
			int numeroAlunos, Retroprojetor retroprojetor, TelaProjecao telaProjecao, TV tv,
			ArrayList<Assento> assentos, ArrayList<Quadro> quadros, MesaProfessor mesaProfessor) {
		super(capacidadeFisica, identificacaoUnica, apelido, titulo, professor, numeroAlunos, retroprojetor,
				telaProjecao, tv);
		this.assentos = assentos;
		this.quadros = quadros;
		this.mesaProfessor = mesaProfessor;
	}
	
	public void organizarAssentos() {
		System.out.println("Organizando assentos");
	}
	
	public ArrayList<Assento> getAssentos() {
		return assentos;
	}
	public void setAssentos(ArrayList<Assento> assentos) {
		this.assentos = assentos;
	}
	public ArrayList<Quadro> getQuadros() {
		return quadros;
	}
	public void setQuadros(ArrayList<Quadro> quadros) {
		this.quadros = quadros;
	}
	public MesaProfessor getMesaProfessor() {
		return mesaProfessor;
	}
	public void setMesaProfessor(MesaProfessor mesaProfessor) {
		this.mesaProfessor = mesaProfessor;
	}
	
	
	
	
	
}
