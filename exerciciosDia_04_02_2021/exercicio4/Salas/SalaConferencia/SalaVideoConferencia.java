package exerciciosDia_04_02_2021.exercicio4.Salas.SalaConferencia;

import exerciciosDia_04_02_2021.exercicio4.Outros.Wifi;

public class SalaVideoConferencia {

	private Wifi wifi;

	public void iniciarVideoConferencia() {
		System.out.println("iniciando video coneferencia");
	}
	
	public Wifi getWifi() {
		return wifi;
	}

	public void setWifi(Wifi wifi) {
		this.wifi = wifi;
	}

	public SalaVideoConferencia(Wifi wifi) {
		super();
		this.wifi = wifi;
	}
	
	
}
