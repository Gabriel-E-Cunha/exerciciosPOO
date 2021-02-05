package exerciciosDia_04_02_2021.exercicio4.Salas.Laboratorio;

import exerciciosDia_04_02_2021.exercicio4.Outros.TabelaPeriodica;

public class Quimica extends Laboratorio {

	private TabelaPeriodica tablePeriodica;
	
	public void misturarElementos() {
		System.out.println("misturando elementos químicos");
	}

	public Quimica(int capacidadeFisica, String identificacaoUnica, String apelido, String titulo, boolean requerEPI,
			TabelaPeriodica tablePeriodica) {
		super(capacidadeFisica, identificacaoUnica, apelido, titulo, requerEPI);
		this.tablePeriodica = tablePeriodica;
	}

	public TabelaPeriodica getTablePeriodica() {
		return tablePeriodica;
	}

	public void setTablePeriodica(TabelaPeriodica tablePeriodica) {
		this.tablePeriodica = tablePeriodica;
	}
	
	
}
